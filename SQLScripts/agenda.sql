use dbagenda;

create table contatos(
	idcon int  primary key auto_increment,
    nome varchar(50) not null,
    fone varchar(15) not null,
    email varchar(50)
);

show tables;
describe contatos;

/* CRUD CREATE */
insert into contatos (nome,fone,email) values ('Bill Gates', '9999-1111', 'bill@outlook.com');

/* CRUD READ */
select * from contatos;
select * from contatos order by nome;
select * from contatos where idcon = 3;

/* CRUD UPDATE */
update contatos set nome ='Lisa Su' where idcon = 7;
update contatos set nome ='Jose de Assis',fone='99999-2222',email='jose@gmail.com' where idcon = 3;
