-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: src/main/resources/database-changelog.xml
-- Ran at: 16.03.11 21:30
-- Against: postgres@jdbc:postgresql://localhost:5432/postgres
-- LiquiBase version: 1.6.1
-- *********************************************************************

-- Lock Database
UPDATE databasechangeloglock SET LOCKEDBY = 'slavo-7d5a9e1cd (10.0.2.15)', LOCKGRANTED = '2011-03-16 21:30:05.225', LOCKED = true WHERE ID  = 1;

-- Release Database Lock
UPDATE databasechangeloglock SET LOCKEDBY = NULL, LOCKGRANTED = NULL, LOCKED = false WHERE  ID = 1;

-- Release Database Lock
UPDATE databasechangeloglock SET LOCKEDBY = NULL, LOCKGRANTED = NULL, LOCKED = false WHERE  ID = 1;

