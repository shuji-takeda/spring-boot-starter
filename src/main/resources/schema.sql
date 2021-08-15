create table band(
   id int not null auto_increment,
   bandName varchar(100) not null,
   bestSong varchar(100) not null,
   created datetime not null,
   primary key(id)
);
