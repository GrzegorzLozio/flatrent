use flatrent;
CREATE TABLE IF NOT EXISTS flat(
    id          INT NOT NULL AUTO_INCREMENT     PRIMARY KEY,
    name        VARCHAR(255),
    city        VARCHAR(255),
    street      VARCHAR(255),
    area        DOUBLE,
    rooms       INT,
    manager_id  INT

);
CREATE TABLE IF NOT EXISTS manager(
    id          INT NOT NULL AUTO_INCREMENT     PRIMARY KEY,
    name        VARCHAR(255),
    flat_id     INT,
    FOREIGN KEY (flat_id)  REFERENCES flat (id)
);
drop table manager;
drop table flat;