BEGIN TRANSACTION;

COPY AllStarFull FROM 'D:/Projects/GuardedSQL/DB/csv/AllstarFull.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Appearances FROM 'D:/Projects/GuardedSQL/DB/csv/Appearances.csv' WITH CSV HEADER DELIMITER AS ',';
COPY AwardsManagers FROM 'D:/Projects/GuardedSQL/DB/csv/AwardsManagers.csv' WITH CSV HEADER DELIMITER AS ',';
COPY AwardsPlayers FROM 'D:/Projects/GuardedSQL/DB/csv/AwardsPlayers.csv' WITH CSV HEADER DELIMITER AS ',';
COPY AwardsShareManagers FROM 'D:/Projects/GuardedSQL/DB/csv/AwardsShareManagers.csv' WITH CSV HEADER DELIMITER AS ',';
COPY AwardsSharePlayers FROM 'D:/Projects/GuardedSQL/DB/csv/AwardsSharePlayers.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Batting FROM 'D:/Projects/GuardedSQL/DB/csv/Batting.csv' WITH CSV HEADER DELIMITER AS ',';
COPY BattingPost FROM 'D:/Projects/GuardedSQL/DB/csv/BattingPost.csv' WITH CSV HEADER DELIMITER AS ',';
COPY CollegePlaying FROM 'D:/Projects/GuardedSQL/DB/csv/CollegePlaying.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Fielding FROM 'D:/Projects/GuardedSQL/DB/csv/Fielding.csv' WITH CSV HEADER DELIMITER AS ',';
COPY FieldingOF FROM 'D:/Projects/GuardedSQL/DB/csv/FieldingOF.csv' WITH CSV HEADER DELIMITER AS ',';
COPY FieldingPost FROM 'D:/Projects/GuardedSQL/DB/csv/FieldingPost.csv' WITH CSV HEADER DELIMITER AS ',';
COPY FieldingOFsplit FROM 'D:/Projects/GuardedSQL/DB/csv/FieldingOFsplit.csv' WITH CSV HEADER DELIMITER AS ',';
COPY HallOfFame FROM 'D:/Projects/GuardedSQL/DB/csv/HallOfFame.csv' WITH CSV HEADER DELIMITER AS ',';
COPY HomeGames FROM 'D:/Projects/GuardedSQL/DB/csv/HomeGames.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Managers FROM 'D:/Projects/GuardedSQL/DB/csv/Managers.csv' WITH CSV HEADER DELIMITER AS ',';
COPY ManagersHalf FROM 'D:/Projects/GuardedSQL/DB/csv/ManagersHalf.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Parks FROM 'D:/Projects/GuardedSQL/DB/csv/Parks.csv' WITH CSV HEADER DELIMITER AS ',';
COPY People FROM 'D:/Projects/GuardedSQL/DB/csv/People.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Pitching FROM 'D:/Projects/GuardedSQL/DB/csv/Pitching.csv' WITH CSV HEADER DELIMITER AS ',';
COPY PitchingPost FROM 'D:/Projects/GuardedSQL/DB/csv/PitchingPost.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Salaries FROM 'D:/Projects/GuardedSQL/DB/csv/Salaries.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Schools FROM 'D:/Projects/GuardedSQL/DB/csv/Schools.csv' WITH CSV HEADER DELIMITER AS ',';
COPY SeriesPost FROM 'D:/Projects/GuardedSQL/DB/csv/SeriesPost.csv' WITH CSV HEADER DELIMITER AS ',';
COPY Teams FROM 'D:/Projects/GuardedSQL/DB/csv/Teams.csv' WITH CSV HEADER DELIMITER AS ',';
COPY TeamsFranchises FROM 'D:/Projects/GuardedSQL/DB/csv/TeamsFranchises.csv' WITH CSV HEADER DELIMITER AS ',';
COPY TeamsHalf FROM 'D:/Projects/GuardedSQL/DB/csv/TeamsHalf.csv' WITH CSV HEADER DELIMITER AS ',';

END TRANSACTION;



