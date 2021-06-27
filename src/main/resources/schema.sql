create table if not exists users
(
    id     varchar(10) primary key,
    name   varchar(20) not null,
    pascal varchar(10) not null
)