This project is set up as a Netbeans project.  It is configured for Apache Netbeans version 22.

The project consists of two parts.  First, is Plug-and-play SQL and second a guard inferencer.  


To run guard inference do the following.

1) Set up a Postgres database.
2) Load the data in DB/northwind.sql into the database
3) Edit test/dbconfig.txt to set up the configuration of the database connection.  The lines in the file mean
       hostname
       port
       database name
       user name
       password
4) Run the targets in run.xml.  This executes the inferencer on queries Q1 to Q6 in the test folder.  It is also possible to run the targets at the command line, for example.
       java -jar dist/GuardedSQL.jar guardedsql.main.InferenceMain test/Q1.sql test/dbconfig.txt

To run Plug-and-play SQL, use the green "run" button in Netbeans.  Alternatively run the project by
       java --module-path lib/javafx-22-0.1 --add-modules javafx.controls,javafx.fxml gui.Main
You must have javafx set up.

For development, runAntlr.xml regenerates the parser for the guard inferencer. 
runCompiler.xml reruns the Antler parser generator for Plug-and-play SQL.