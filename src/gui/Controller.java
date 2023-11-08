package gui;

import guardedsql.RetrieveData;
import guardedsql.database.DB;
import guardedsql.grammar.MyListener;
import guardedsql.grammar.SQLiteLexer;
import guardedsql.grammar.SQLiteParser;
import guardedsql.grammar.ThrowingErrorListener;
import guardedsql.tree.PatternTree;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.antlr.v4.runtime.misc.ParseCancellationException;


/*Controller to handle the GUI events and execute the guard clause
    @author Shubham Swami
 */


public class Controller {
    private static DB db;
    public TextField dburi;
    public TextField dbname;
    public PasswordField dbpass;
    public TextField dbuser;
    public TextArea guardField;
    public TextField dbport;
    public Button connectdb;
    public static String url;

    public void connectDatabase() {
        try {
            configureDB();
            if (db == null) db = DB.getInstance();
            loadApplication();
            System.out.println(db == null ? "Failed to establish connection" : "Established db connection");
        } catch (Exception e) {
            Stage stage = new Stage();
            TextArea text = new TextArea();
            text.setEditable(false);
            text.setText("Unable to establish a database connection, check the connection info and try again."
                         + "\n" + e.getMessage());
            Scene scene = new Scene(text, 400, 40);
            stage.setScene(scene);
            stage.show();
        }
    }

    private void configureDB() {
        url = "jdbc:postgresql://" + dburi.getText() + ":" + dbport.getText() + "/";
        String dbName = dbname.getText();
        String uName = dbuser.getText();
        String dbPassword = dbpass.getText();
        System.out.println(url + " " + dbName + " " + uName + " " + dbPassword);
        DB.setJdbcUrl(url);
        DB.setUserName(uName);
        DB.setPassword(dbPassword);
        DB.setDatabaseName(dbName);
    }

    private void loadApplication() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxmlFiles/guards.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = Main.getPrimaryStage();
        Scene scene = stage.getScene();
        scene.setRoot(root);
        stage.show();
    }

    public void generateQueries() {
        System.out.println("Generating queries ");
        if (guardField == null || guardField.getText() == null || guardField.getText().isEmpty()) {
            Stage stage = new Stage();
            TextArea text = new TextArea();
            text.setEditable(false);
            text.setText("Please provide the guard clause");
            Scene scene = new Scene(text, 400, 40);
            stage.setScene(scene);
            stage.show();
        } else {
            boolean parsed = false;
            RetrieveData retrieveData = new RetrieveData();;
            try {
                if (db == null) {
                    configureDB();
                    if (db == null) db = DB.getInstance();
                }
                String guardClause = guardField.getText();
                System.out.println(" doing " + guardField.getText());
                CharStream charStream = CharStreams.fromString(guardClause);
                SQLiteLexer lexer = new SQLiteLexer(charStream);
                lexer.removeErrorListeners();
                lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
                CommonTokenStream ts = new CommonTokenStream(lexer);
                SQLiteParser parser = new SQLiteParser(ts);
                parser.removeErrorListeners();
                parser.addErrorListener(ThrowingErrorListener.INSTANCE);
                ParserRuleContext tree = parser.parse();
                MyListener extractor = new MyListener(parser);
                System.out.println(" Walking ");
                ParseTreeWalker.DEFAULT.walk(extractor, tree);
                System.out.println(" Walked ");
                System.out.println(" Retrieving ");
                retrieveData.setParser(parser);
                System.out.println(" Parsing ");
                retrieveData.retrieveData();
                System.out.println(" fff ");
                showGeneratedQueries();
            } catch (ParseCancellationException e) {
                // Ignore the EOF error
                if (!e.toString().contains("<EOF>")) {
                    Stage stage = new Stage();
                    TextArea text = new TextArea();
                    text.setEditable(false);
                    text.setText("Syntax error " + e);
                    Scene scene = new Scene(text, 400, 40);
                    stage.setScene(scene);
                    stage.show();
                } else {
                    parsed = true;
                }
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            }
            // Generate code
            if (parsed) {
                // retrieveData.retrieveData();
                System.out.println(" fff ");
                showGeneratedQueries();
            }

        }
    }

    private void showGeneratedQueries() {

        String[] generatedQueries = PatternTree.getGeneratedQueries();
        String selectClause = MyListener.selectClauseText;
        String whereClause = MyListener.whereClauseText;
        if (generatedQueries == null) return;
        String[] comboBoxItems = new String[generatedQueries.length];
        // System.out.println(" Showing generated queries " + generatedQueries.length);
        for (int i = 0; i < generatedQueries.length; i++) {
            comboBoxItems[i] = ("Query " + i);
        }

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(15);
        gridPane.setVgap(15);

        ObservableList<String> queryList = FXCollections.observableArrayList(comboBoxItems);
        ComboBox comboBox = new ComboBox();
        comboBox.setItems(queryList);
        comboBox.setVisibleRowCount(5);
        Label comboBoxLabel = new Label();
        comboBoxLabel.setText("Select Query: ");
        comboBoxLabel.setLabelFor(comboBox);

        Button executeQuery = new Button();

        TextArea queryTextArea = new TextArea();
        queryTextArea.setEditable(false);
        queryTextArea.setMinSize(200, 100);
        Label queryLabel = new Label();
        queryLabel.setText("Query: ");
        queryLabel.setLabelFor(queryLabel);


        comboBox.getSelectionModel().selectFirst();
        if (queryTextArea.getText().isEmpty() && generatedQueries.length > 0) {
            queryTextArea.setText(generateQueryText(generatedQueries[0]));
        }

        executeQuery.setText("Execute Query");
        executeQuery.setOnAction(event -> {
            try {
                String q = queryTextArea.getText();
                ResultSet out = executeQuery(q);
                loadResults(out, q);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        comboBox.setOnAction((event) -> {

            int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
            System.out.println("Selected index: " + selectedIndex);
            queryTextArea.setText(generatedQueries[selectedIndex]);
        });
        Label label = new Label();
        label.setText("Generated Queries");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        gridPane.add(label, 0, 0, 2, 1);
        gridPane.add(comboBoxLabel, 0, 2);
        gridPane.add(comboBox, 1, 2);
        gridPane.add(queryLabel, 0, 3);
        gridPane.add(queryTextArea, 1, 3);
        gridPane.add(executeQuery, 0, 4, 2, 1);
        GridPane.setHalignment(label, HPos.CENTER);
        GridPane.setHalignment(executeQuery, HPos.CENTER);
        Stage stage = Main.getPrimaryStage();
        stage.setTitle("Plug and Play SQL");
        Scene scene = stage.getScene();
        scene.setRoot(gridPane);
        stage.show();

    }

    private String generateQueryText(String innerFrom) {
        if (MyListener.hasAggregate) {
            String s = MyListener.selectClauseText;
            /*
            for (String key : MyListener.aggregateMap.keySet()) {
                s += ", " + key;
            }
            */
            s += "\nFROM (" + innerFrom
                    + "\n     ) A\n";
            String w = "WHERE true ";
            for (String c : MyListener.aggregateComparisonSet) {
                for (String key : MyListener.aggregateMap.keySet()) {
                    if (c.contains(MyListener.aggregateMap.get(key))) {
                        c = c.replace(MyListener.aggregateMap.get(key), key);
                        w += " AND " + c;
                    }
                }
            }
            return s + w;
        } else {
            return MyListener.selectClauseText
                    + "\nFROM (" + innerFrom
                    + "\n     ) A\n" + MyListener.whereClauseText;
        }
    }

    private void loadResults(ResultSet resultSet, String executedQuery) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Label label = new Label();
        label.setText("Results");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 18));

        Label executedQueryLabel = new Label();
        executedQueryLabel.setText("Executed Query: ");
        TextArea executedQueryTextArea = new TextArea();
        executedQueryLabel.setLabelFor(executedQueryTextArea);
        executedQueryTextArea.setEditable(false);
        executedQueryTextArea.setText(executedQuery);

        ObservableList<ObservableList> data = FXCollections.observableArrayList();
        TableView tableview = new TableView();
        Label tableViewLabel = new Label();
        tableViewLabel.setText("Results: ");
        tableViewLabel.setLabelFor(tableview);
        populateTable(resultSet, data, tableview);

        Button saveButton = new Button();
        Button backButton = new Button();
        saveButton.setText("Save Output");
        backButton.setText("Back");

        saveButton.setOnAction(event -> {
            try {
                writeExcel(resultSet);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });

        backButton.setOnAction(event -> {
            try {
                showGeneratedQueries();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        gridPane.add(label, 0, 0, 2, 1);
        gridPane.add(executedQueryLabel, 0, 2);
        gridPane.add(executedQueryTextArea, 1, 2);
        gridPane.add(tableViewLabel, 0, 3);
        gridPane.add(tableview, 1, 3);
        gridPane.add(backButton, 1, 4, 1, 1);
        gridPane.add(saveButton, 1, 4, 1, 1);
        GridPane.setHalignment(label, HPos.CENTER);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setHalignment(saveButton, HPos.RIGHT);
        Stage stage = Main.getPrimaryStage();
        stage.setTitle("Plug and Play SQL");
        Scene scene = stage.getScene();
        scene.setRoot(gridPane);
        stage.show();
    }

    private void populateTable(ResultSet resultSet, ObservableList<ObservableList> data, TableView tableview) {
        try {
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                final int j = i;
                TableColumn col = new TableColumn(resultSet.getMetaData().getColumnName(i + 1));
                col.setCellValueFactory((Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>) param -> new SimpleStringProperty(param.getValue().get(j).toString()));
                tableview.getColumns().addAll(col);

            }
            while (resultSet.next()) {

                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    row.add(resultSet.getString(i));
                }
                data.add(row);
            }
            tableview.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }

    }

    public ResultSet executeQuery(String execute) {
        return PatternTree.executegeneratedQueries(execute);
    }

    private String getFileName(String baseName) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String dateTimeInfo = dateFormat.format(new Date());
        return baseName.concat(String.format("_%s.txt", dateTimeInfo));
    }

    public void writeExcel(ResultSet resultSet) throws Exception {
        if (resultSet == null)
            System.out.println("Write file null");
        else System.out.println("not null");
        StringBuilder sb = new StringBuilder();
        String directoryName = getFileName("D:/Projects/GaurdedSQL/generatedFiles/output.txt");
        String fileName = directoryName.replace("\\\\", "/");
        File file = new File(fileName);
        file.getParentFile().mkdirs();
        FileWriter fileWriter = new FileWriter(file);
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        System.out.println(columnsNumber);
        while (resultSet.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) fileWriter.write(",  ");
                String columnValue = resultSet.getString(i);
                System.out.println(columnValue);
                fileWriter.write(columnValue + " " + rsmd.getColumnName(i));
            }
            fileWriter.write("\n");
        }
        System.out.println("done");
        fileWriter.close();

    }

}
