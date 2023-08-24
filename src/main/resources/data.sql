create table Person(
id integer not null,
name varchar(255) not null,
location varchar(255),
date_birth timestamp,
primary key(id)
);

INSERT INTO Person(id,name,location,date_birth) VALUES(10001,'SHRE1','MUMBAI',CURRENT_DATE);
INSERT INTO Person VALUES(10002,'SHRA1','PUNE',CURRENT_TIMESTAMP);
INSERT INTO Person VALUES(10003,'YASH','MP',CURRENT_TIMESTAMP);