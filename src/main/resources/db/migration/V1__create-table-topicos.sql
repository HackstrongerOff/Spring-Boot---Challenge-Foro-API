
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(150) not null unique,
    mensaje varchar(250) not null unique,
    fecha_creacion date not null,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

);
