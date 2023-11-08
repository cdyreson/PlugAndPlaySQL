BEGIN TRANSACTION;
--
-- Updated: 2017-03-02
-- --------------------------------------------------------
--
-- Table structure for table AllStarFull
--
--

DROP TABLE IF EXISTS AllStarFull;
CREATE TABLE IF NOT EXISTS AllStarFull (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	gameNum int NOT NULL,
	gameID varchar(12) DEFAULT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	GP int DEFAULT NULL,
	startingPos int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,gameNum),
	CONSTRAINT allstarfull_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
	CONSTRAINT allstarfull_ibfk_2 FOREIGN KEY (team_ID) REFERENCES teams (ID)
);

-- --------------------------------------------------------

--
-- Table structure for table Appearances
--
--

DROP TABLE IF EXISTS Appearances;
CREATE TABLE IF NOT EXISTS Appearances (
	yearID int NOT NULL,
	teamID varchar(3) NOT NULL,
	lgID varchar(2) DEFAULT NULL,
	playerID varchar(10) NOT NULL,
	G_all int DEFAULT NULL,
	GS int DEFAULT NULL,
	G_batting int DEFAULT NULL,
	G_defense int DEFAULT NULL,
	G_p int DEFAULT NULL,
	G_c int DEFAULT NULL,
	G_1b int DEFAULT NULL,
	G_2b int DEFAULT NULL,
	G_3b int DEFAULT NULL,
	G_ss int DEFAULT NULL,
	G_lf int DEFAULT NULL,
	G_cf int DEFAULT NULL,
	G_rf int DEFAULT NULL,
	G_of int DEFAULT NULL,
	G_dh int DEFAULT NULL,
	G_ph int DEFAULT NULL,
	G_pr int DEFAULT NULL,
	PRIMARY KEY (yearID,teamID,playerID),
CONSTRAINT appearances_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT appearances_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT appearances_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table AwardsManagers
--
--

DROP TABLE IF EXISTS AwardsManagers;
CREATE TABLE IF NOT EXISTS AwardsManagers (
	playerID varchar(10) NOT NULL,
	awardID varchar(25) NOT NULL,
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	tie varchar(1) DEFAULT NULL,
	notes varchar(100) DEFAULT NULL,
	PRIMARY KEY (yearID,awardID,lgID,playerID),
CONSTRAINT awardsmanagers_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT awardsmanagers_ibfk_2 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table AwardsPlayers
--
--

DROP TABLE IF EXISTS AwardsPlayers;
CREATE TABLE IF NOT EXISTS AwardsPlayers (
	playerID varchar(10) NOT NULL,
	awardID varchar(255) NOT NULL,
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	tie varchar(1) DEFAULT NULL,
	notes varchar(100) DEFAULT NULL,
	PRIMARY KEY (yearID,awardID,lgID,playerID),
CONSTRAINT awardsplayers_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT awardsplayers_ibfk_2 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table AwardsShareManagers
--
--

DROP TABLE IF EXISTS AwardsShareManagers;
CREATE TABLE IF NOT EXISTS AwardsShareManagers (
	awardID varchar(25) NOT NULL,
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	playerID varchar(10) NOT NULL,
	pointsWon int DEFAULT NULL,
	pointsMax int DEFAULT NULL,
	votesFirst int DEFAULT NULL,
	PRIMARY KEY (awardID,yearID,lgID,playerID),
CONSTRAINT awardssharemanagers_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT awardssharemanagers_ibfk_2 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table AwardsSharePlayers
--
--

DROP TABLE IF EXISTS AwardsSharePlayers;
CREATE TABLE IF NOT EXISTS AwardsSharePlayers (
	awardID varchar(25) NOT NULL,
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	playerID varchar(10) NOT NULL,
	pointsWon double precision DEFAULT NULL,
	pointsMax int DEFAULT NULL,
	votesFirst double precision DEFAULT NULL,
	PRIMARY KEY (awardID,yearID,lgID,playerID),
CONSTRAINT awardsshareplayers_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT awardsshareplayers_ibfk_2 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table Batting
--
--

DROP TABLE IF EXISTS Batting;
CREATE TABLE IF NOT EXISTS Batting (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	stint int NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	G int DEFAULT NULL,
	AB int DEFAULT NULL,
	R int DEFAULT NULL,
	H int DEFAULT NULL,
	H2B int DEFAULT NULL,
	H3B int DEFAULT NULL,
	HR int DEFAULT NULL,
	RBI int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	BB int DEFAULT NULL,
	SO int DEFAULT NULL,
	IBB int DEFAULT NULL,
	HBP int DEFAULT NULL,
	SH int DEFAULT NULL,
	SF int DEFAULT NULL,
	GIDP int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,stint),
CONSTRAINT batting_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT batting_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT batting_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table BattingPost
--
--

DROP TABLE IF EXISTS BattingPost;
CREATE TABLE IF NOT EXISTS BattingPost (
	yearID int NOT NULL,
	round varchar(10) NOT NULL,
	playerID varchar(10) NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	G int DEFAULT NULL,
	AB int DEFAULT NULL,
	R int DEFAULT NULL,
	H int DEFAULT NULL,
	H2B int DEFAULT NULL,
	H3B int DEFAULT NULL,
	HR int DEFAULT NULL,
	RBI int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	BB int DEFAULT NULL,
	SO int DEFAULT NULL,
	IBB int DEFAULT NULL,
	HBP int DEFAULT NULL,
	SH int DEFAULT NULL,
	SF int DEFAULT NULL,
	GIDP int DEFAULT NULL,
	PRIMARY KEY (yearID,round,playerID),
CONSTRAINT battingpost_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT battingpost_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT battingpost_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table CollegePlaying
--
--

DROP TABLE IF EXISTS CollegePlaying;
CREATE TABLE IF NOT EXISTS CollegePlaying (
	playerID varchar(10) NOT NULL,
	schoolID varchar(15) NOT NULL,
	yearID int NOT NULL,
	PRIMARY KEY (playerID, schoolID, yearID),
CONSTRAINT collegeplaying_ibfk_1 FOREIGN KEY (schoolID) REFERENCES schools (schoolID),
CONSTRAINT collegeplaying_ibfk_2 FOREIGN KEY (playerID) REFERENCES people (playerID)

);



CREATE TABLE divisions (
  divID char(2) NOT NULL,
  lgID char(2) NOT NULL,
  division varchar(50) NOT NULL,
  active char(1) NOT NULL,
  PRIMARY KEY (divID),
CONSTRAINT divisions_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID)
);

-- --------------------------------------------------------

--
-- Table structure for table Fielding
--
--

DROP TABLE IF EXISTS Fielding;
CREATE TABLE IF NOT EXISTS Fielding (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	stint int NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	POS varchar(2) NOT NULL,
	G int DEFAULT NULL,
	GS int DEFAULT NULL,
	InnOuts int DEFAULT NULL,
	PO int DEFAULT NULL,
	A int DEFAULT NULL,
	E int DEFAULT NULL,
	DP int DEFAULT NULL,
	PB int DEFAULT NULL,
	WP int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	ZR double precision DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,stint,POS),
	CONSTRAINT fielding_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT fielding_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT fielding_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table FieldingOF
--
--

DROP TABLE IF EXISTS FieldingOF;
CREATE TABLE IF NOT EXISTS FieldingOF (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	stint int NOT NULL,
	Glf int DEFAULT NULL,
	Gcf int DEFAULT NULL,
	Grf int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,stint),
CONSTRAINT fieldingof_ibfk_1 FOREIGN KEY (playerID) REFERENCES people (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table FieldingOFsplit
--
--

DROP TABLE IF EXISTS FieldingOFsplit;
CREATE TABLE IF NOT EXISTS FieldingOFsplit (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	stint int NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	POS varchar(2) NOT NULL,
	G int DEFAULT NULL,
	GS int DEFAULT NULL,
	InnOuts int DEFAULT NULL,
	PO int DEFAULT NULL,
	A int DEFAULT NULL,
	E int DEFAULT NULL,
	DP int DEFAULT NULL,
	PB int DEFAULT NULL,
	WP int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	ZR double precision DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,stint,POS),
CONSTRAINT fieldingofsplit_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT fieldingofsplit_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT fieldingofsplit_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table FieldingPost
--
--

DROP TABLE IF EXISTS FieldingPost;
CREATE TABLE IF NOT EXISTS FieldingPost (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	round varchar(10) NOT NULL,
	POS varchar(2) NOT NULL,
	G int DEFAULT NULL,
	GS int DEFAULT NULL,
	InnOuts int DEFAULT NULL,
	PO int DEFAULT NULL,
	A int DEFAULT NULL,
	E int DEFAULT NULL,
	DP int DEFAULT NULL,
	TP int DEFAULT NULL,
	PB int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,round,POS),
CONSTRAINT fieldingpost_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT fieldingpost_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT fieldingpost_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table HallOfFame
--
--

DROP TABLE IF EXISTS HallOfFame;
CREATE TABLE IF NOT EXISTS HallOfFame (
	playerID varchar(10) NOT NULL,
	yearid int NOT NULL,
	votedBy varchar(64) NOT NULL DEFAULT '',
	ballots int DEFAULT NULL,
	needed int DEFAULT NULL,
	votes int DEFAULT NULL,
	inducted varchar(1) DEFAULT NULL,
	category varchar(20) DEFAULT NULL,
	needed_note varchar(20) DEFAULT NULL,
	PRIMARY KEY (playerID,yearid,votedBy),
CONSTRAINT halloffame_ibfk_1 FOREIGN KEY (playerID) REFERENCES people (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table HomeGames
--
--

DROP TABLE IF EXISTS HomeGames;
CREATE TABLE IF NOT EXISTS HomeGames (
	year int NOT NULL,
	league varchar(64) NULL DEFAULT '',
	team varchar(10) DEFAULT NULL,
	park varchar(10) DEFAULT NULL,
	span_first date DEFAULT NULL,
	span_last date DEFAULT NULL,
	games int DEFAULT NULL,
	openings int DEFAULT NULL,
	attendance int DEFAULT NULL,
	PRIMARY KEY (year,league,team,park),
CONSTRAINT homegames_ibfk_1 FOREIGN KEY (leaguekey) REFERENCES leagues (lgID),
CONSTRAINT homegames_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT homegames_ibfk_3 FOREIGN KEY (park) REFERENCES parks (park)
);



-- --------------------------------------------------------

--
-- Table structure for table leagues
--
--

DROP TABLE IF EXISTS leagues;
CREATE TABLE leagues (
  lgID char(2) NOT NULL,
  league varchar(50) NOT NULL,
  active char(1) NOT NULL,
  PRIMARY KEY (lgID)

);






-- --------------------------------------------------------

--
-- Table structure for table Managers
--
--

DROP TABLE IF EXISTS Managers;
CREATE TABLE IF NOT EXISTS Managers (
	playerID varchar(10) DEFAULT NULL,
	yearID int NOT NULL,
	teamID varchar(3) NOT NULL,
	lgID varchar(2) DEFAULT NULL,
	inseason int NOT NULL,
	G int DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	rank int DEFAULT NULL,
	plyrMgr varchar(1) DEFAULT NULL,
	PRIMARY KEY (yearID,teamID,inseason),
CONSTRAINT managers_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT managers_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT managers_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table ManagersHalf
--
--

DROP TABLE IF EXISTS ManagersHalf;
CREATE TABLE IF NOT EXISTS ManagersHalf (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	teamID varchar(3) NOT NULL,
	lgID varchar(2) DEFAULT NULL,
	inseason int DEFAULT NULL,
	half int NOT NULL,
	G int DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	rank int DEFAULT NULL,
	PRIMARY KEY (yearID,teamID,playerID,half),
CONSTRAINT managershalf_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT managershalf_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT managershalf_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table Parks
--
--

DROP TABLE IF EXISTS Parks;
CREATE TABLE IF NOT EXISTS Parks (
	park varchar(50) NOT NULL,
	park_name varchar(100) DEFAULT NULL,
	park_alias varchar(100) DEFAULT NULL,
	city varchar(50) DEFAULT NULL,
	state varchar(50) DEFAULT NULL,
	country varchar(50) DEFAULT NULL,
	PRIMARY KEY (park)
);

-- --------------------------------------------------------

--
-- Table structure for table People
--
--

DROP TABLE IF EXISTS People;
CREATE TABLE IF NOT EXISTS People (
	playerID varchar(10) DEFAULT NULL,
	birthYear int DEFAULT NULL,
	birthMonth int DEFAULT NULL,
	birthDay int DEFAULT NULL,
	birthCountry varchar(50) DEFAULT NULL,
	birthState varchar(50) DEFAULT NULL,
	birthCity varchar(50) DEFAULT NULL,
	deathYear int DEFAULT NULL,
	deathMonth int DEFAULT NULL,
	deathDay int DEFAULT NULL,
	deathCountry varchar(50) DEFAULT NULL,
	deathState varchar(50) DEFAULT NULL,
	deathCity varchar(50) DEFAULT NULL,
	nameFirst varchar(50) DEFAULT NULL,
	nameLast varchar(50) DEFAULT NULL,
	nameGiven varchar(255) DEFAULT NULL,
	weight int DEFAULT NULL,
	height double precision DEFAULT NULL,
	bats varchar(1) DEFAULT NULL,
	throws varchar(1) DEFAULT NULL,
	debut varchar(10) DEFAULT NULL,
	finalGame varchar(10) DEFAULT NULL,
	retroID varchar(9) DEFAULT NULL,
	bbrefID varchar(9) DEFAULT NULL,
	PRIMARY KEY (playerID)
);

-- --------------------------------------------------------

--
-- Table structure for table Pitching
--
--

DROP TABLE IF EXISTS Pitching;
CREATE TABLE IF NOT EXISTS Pitching (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	stint int NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	G int DEFAULT NULL,
	GS int DEFAULT NULL,
	CG int DEFAULT NULL,
	SHO int DEFAULT NULL,
	SV int DEFAULT NULL,
	IPouts int DEFAULT NULL,
	H int DEFAULT NULL,
	ER int DEFAULT NULL,
	HR int DEFAULT NULL,
	BB int DEFAULT NULL,
	SO int DEFAULT NULL,
	BAOpp double precision DEFAULT NULL,
	ERA double precision DEFAULT NULL,
	IBB int DEFAULT NULL,
	WP int DEFAULT NULL,
	HBP int DEFAULT NULL,
	BK int DEFAULT NULL,
	BFP int DEFAULT NULL,
	GF int DEFAULT NULL,
	R int DEFAULT NULL,
	SH int DEFAULT NULL,
	SF int DEFAULT NULL,
	GIDP int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,stint),
CONSTRAINT pitching_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT pitching_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT pitching_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)


);

-- --------------------------------------------------------

--
-- Table structure for table PitchingPost
--
--

DROP TABLE IF EXISTS PitchingPost;
CREATE TABLE IF NOT EXISTS PitchingPost (
	playerID varchar(10) NOT NULL,
	yearID int NOT NULL,
	round varchar(10) NOT NULL,
	teamID varchar(3) DEFAULT NULL,
	lgID varchar(2) DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	G int DEFAULT NULL,
	GS int DEFAULT NULL,
	CG int DEFAULT NULL,
	SHO int DEFAULT NULL,
	SV int DEFAULT NULL,
	IPouts int DEFAULT NULL,
	H int DEFAULT NULL,
	ER int DEFAULT NULL,
	HR int DEFAULT NULL,
	BB int DEFAULT NULL,
	SO int DEFAULT NULL,
	BAOpp double precision DEFAULT NULL,
	ERA double precision DEFAULT NULL,
	IBB int DEFAULT NULL,
	WP int DEFAULT NULL,
	HBP int DEFAULT NULL,
	BK int DEFAULT NULL,
	BFP int DEFAULT NULL,
	GF int DEFAULT NULL,
	R int DEFAULT NULL,
	SH int DEFAULT NULL,
	SF int DEFAULT NULL,
	GIDP int DEFAULT NULL,
	PRIMARY KEY (playerID,yearID,round),
CONSTRAINT pitchingpost_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT pitchingpost_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT pitchingpost_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table Salaries
--
--

DROP TABLE IF EXISTS Salaries;
CREATE TABLE IF NOT EXISTS Salaries (
	yearID int NOT NULL,
	teamID varchar(3) NOT NULL,
	lgID varchar(2) NOT NULL,
	playerID varchar(10) NOT NULL,
	salary double precision DEFAULT NULL,
	PRIMARY KEY (yearID,teamID,lgID,playerID),
CONSTRAINT salaries_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT salaries_ibfk_2 FOREIGN KEY (teamID) REFERENCES teams (teamID),
CONSTRAINT salaries_ibfk_3 FOREIGN KEY (playerID) REFERENCES people (playerID)

);

-- --------------------------------------------------------

--
-- Table structure for table Schools
--
--

DROP TABLE IF EXISTS Schools;
CREATE TABLE IF NOT EXISTS Schools (
	schoolID varchar(15) NOT NULL,
	schoolName varchar(255) DEFAULT NULL,
	schoolCity varchar(55) DEFAULT NULL,
	schoolState varchar(55) DEFAULT NULL,
	schoolNick varchar(55) DEFAULT NULL,
	PRIMARY KEY (schoolID)


);

-- --------------------------------------------------------

--
-- Table structure for table SeriesPost
--
--

DROP TABLE IF EXISTS SeriesPost;
CREATE TABLE IF NOT EXISTS SeriesPost (
	yearID int NOT NULL,
	round varchar(5) NOT NULL,
	teamIDwinner varchar(3) DEFAULT NULL,
	lgIDwinner varchar(2) DEFAULT NULL,
	teamIDloser varchar(3) DEFAULT NULL,
	lgIDloser varchar(2) DEFAULT NULL,
	wins int DEFAULT NULL,
	losses int DEFAULT NULL,
	ties int DEFAULT NULL,
	PRIMARY KEY (yearID,round),
CONSTRAINT  seriespost_ibfk_1 FOREIGN KEY (lgIDwinner) REFERENCES leagues (lgID),
CONSTRAINT  seriespost_ibfk_2 FOREIGN KEY (lgIDloser) REFERENCES leagues (lgID),
CONSTRAINT  seriespost_ibfk_3 FOREIGN KEY (teamIDwinner) REFERENCES teams (teamID),
CONSTRAINT  seriespost_ibfk_4 FOREIGN KEY (teamIDloser) REFERENCES teams (teamID)


);

-- --------------------------------------------------------

--
-- Table structure for table Teams
--
--

DROP TABLE IF EXISTS Teams;
CREATE TABLE IF NOT EXISTS Teams (
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	teamID varchar(3) NOT NULL,
	franchID varchar(3) DEFAULT NULL,
	divID varchar(1) DEFAULT NULL,
	Rank int DEFAULT NULL,
	G int DEFAULT NULL,
	Ghome int DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	DivWin varchar(1) DEFAULT NULL,
	WCWin varchar(1) DEFAULT NULL,
	LgWin varchar(1) DEFAULT NULL,
	WSWin varchar(1) DEFAULT NULL,
	R int DEFAULT NULL,
	AB int DEFAULT NULL,
	H int DEFAULT NULL,
	H2B int DEFAULT NULL,
	H3B int DEFAULT NULL,
	HR int DEFAULT NULL,
	BB int DEFAULT NULL,
	SO int DEFAULT NULL,
	SB int DEFAULT NULL,
	CS int DEFAULT NULL,
	HBP int DEFAULT NULL,
	SF int DEFAULT NULL,
	RA int DEFAULT NULL,
	ER int DEFAULT NULL,
	ERA double precision DEFAULT NULL,
	CG int DEFAULT NULL,
	SHO int DEFAULT NULL,
	SV int DEFAULT NULL,
	IPouts int DEFAULT NULL,
	HA int DEFAULT NULL,
	HRA int DEFAULT NULL,
	BBA int DEFAULT NULL,
	SOA int DEFAULT NULL,
	E int DEFAULT NULL,
	DP int DEFAULT NULL,
	FP double precision DEFAULT NULL,
	name varchar(50) DEFAULT NULL,
	park varchar(255) DEFAULT NULL,
	attendance int DEFAULT NULL,
	BPF int DEFAULT NULL,
	PPF int DEFAULT NULL,
	teamIDBR varchar(3) DEFAULT NULL,
	teamIDlahman45 varchar(3) DEFAULT NULL,
	teamIDretro varchar(3) DEFAULT NULL,
	PRIMARY KEY (yearID,lgID,teamID),
	
CONSTRAINT teams_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT teams_ibfk_2 FOREIGN KEY (divID) REFERENCES divisions (divID),
CONSTRAINT teams_ibfk_3 FOREIGN KEY (franchID) REFERENCES teamsfranchises (franchID)

);

-- --------------------------------------------------------

--
-- Table structure for table TeamsFranchises
--
--

DROP TABLE IF EXISTS TeamsFranchises;
CREATE TABLE IF NOT EXISTS TeamsFranchises (
	franchID varchar(3) NOT NULL,
	franchName varchar(50) DEFAULT NULL,
	active varchar(2) DEFAULT NULL,
	NAassoc varchar(3) DEFAULT NULL,
	PRIMARY KEY (franchID)
);

-- --------------------------------------------------------

--
-- Table structure for table TeamsHalf
--
--

DROP TABLE IF EXISTS TeamsHalf;
CREATE TABLE IF NOT EXISTS TeamsHalf (
	yearID int NOT NULL,
	lgID varchar(2) NOT NULL,
	teamID varchar(3) NOT NULL,
	Half varchar(1) NOT NULL,
	divID varchar(1) DEFAULT NULL,
	DivWin varchar(1) DEFAULT NULL,
	Rank int DEFAULT NULL,
	G int DEFAULT NULL,
	W int DEFAULT NULL,
	L int DEFAULT NULL,
	PRIMARY KEY (yearID,teamID,lgID,Half),
CONSTRAINT  teamshalf_ibfk_1 FOREIGN KEY (lgID) REFERENCES leagues (lgID),
CONSTRAINT  teamshalf_ibfk_2 FOREIGN KEY (divID) REFERENCES divisions (divID),
CONSTRAINT  teamshalf_ibfk_3 FOREIGN KEY (teamID) REFERENCES teams (teamID)

);

END TRANSACTION;
