CREATE SEQUENCE dis_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 99999999
    CACHE 1;

CREATE TABLE dis_symptom
(
    id VARCHAR(20) primary key,
    name VARCHAR(50),
    decription varchar(100),
    update_time TIMESTAMP DEFAULT current_timestamp,
    update_by varchar(100)
);

alter table dis_symptom alter column id set default nextval('dis_seq');

CREATE TABLE recipe
(
    id VARCHAR(20) primary key,
    name VARCHAR(50),
    decription varchar(100),
    update_time TIMESTAMP DEFAULT current_timestamp,
    update_by varchar(100)
);

alter table recipe alter column id set default nextval('dis_seq');

CREATE TABLE dia_symptom_recipe
(
    id VARCHAR(20) primary key,
    dia_sym_id varchar(20),
    recipe_id VARCHAR (20),
    decription varchar(100),
    update_time TIMESTAMP DEFAULT current_timestamp,
    update_by varchar(100)
);
alter table dia_symptom_recipe alter column id set default nextval('dis_seq');