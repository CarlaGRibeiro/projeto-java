# projeto-java

projeto java executando com base no script do banco de dados a seguir:

 banco de dados
 
create database agenciaviagem
default character set UTF8MB4
default collate UTF8MB4_GENERAL_CI;
 
 
 
create table usuario (
id_usuario int not null auto_increment,
Nome varchar (15) not null,
Sobrenome varchar (15) not null,
Email varchar (60) not null,
CPF varchar (15) not null,
Endereço varchar (30),
Numero varchar (7),
Complemento varchar (20),
Bairro varchar (20),
Cidade varchar (25),
Estado varchar (20),
Pais varchar (15) default 'Brasil',
Senha varchar (20) not null,
primary key (id_usuario)
)default charset = UTF8MB4;

create table viagem (
id_usuario int,
id_viagem int not null auto_increment,
Nome varchar (15) not null,
Email varchar (60),
Origem varchar (15),
Destino varchar (15),
Data_dia varchar (3),
Data_mes varchar (10),
Data_ano varchar (4),
primary key (id_viagem),
CONSTRAINT fk_usuviag FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
)default charset = UTF8MB4;
