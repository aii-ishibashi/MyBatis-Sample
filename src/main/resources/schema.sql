create table if not exists users
(
    id   bigint auto_increment primary key,
    name varchar(255)
);

create table if not exists units
(
    id bigint auto_increment primary key,
    name varchar(255)
);

create table if not exists pages
(
    id bigint auto_increment primary key,
    no integer,
    name varchar(255),
    unit_id bigint,
    foreign key (unit_id) references units(id)
);
