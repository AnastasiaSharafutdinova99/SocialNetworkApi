DROP TABLE IF EXISTS SNAccount CASCADE;
DROP SEQUENCE IF EXISTS global_sec;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE SNAccount (
    id                  INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    surname             VARCHAR         NOT NULL,
    name                VARCHAR         NOT NULL,
    nickname            VARCHAR         NOT NULL,
    birthday            VARCHAR         NOT NULL,
    age                 INTEGER         NOT NULL,
    email               VARCHAR         NOT NULL,
    pet                 VARCHAR         NOT NULL
);