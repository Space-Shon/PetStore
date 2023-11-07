DROP TABLE IF EXISTS pet;
create table pet(
    id serial PRIMARY KEY,
    name VARCHAR(30),
    type VARCHAR(30),
    age INTEGER,
    cost INTEGER
);
