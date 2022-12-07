drop database if exists tb_final;
create database if not  exists tb_final;
use tb_final;


create table if not  exists estoque(
id_estoque int not null,
nome varchar(45) not null,
quantidade int not null,
medidor varchar(45) not null,
fornecedor varchar(45) not null,
preco decimal(10,2) not null,
total decimal(10,2) not null,
primary key(id_estoque)
);

create table if not  exists cardapio(
id_cardapio int not null,
nome varchar(45) not null,
preco decimal(10,2) not null,
desconto decimal(10,2) not null,
primary key(id_cardapio)
);

create table if not  exists itens_pedido(
id_estoque int not null,
id_cardapio int not null,
quantidade varchar(45) not null,
foreign key(id_estoque) references estoque(id_estoque),
foreign key(id_cardapio) references cardapio(id_cardapio) 
);

create table if not  exists clientes(
id_cliente int not null,
nome varchar(45) not null,
telefone varchar(45) not null,
primary key(id_cliente)
);

create table if not  exists pedido(
id_pedido int not null,
total_preco decimal(10,2) not null,
data_pedido date not null,
horario time not null,
desconto decimal(10,2) not null,
id_cliente int not null,
primary key(id_pedido), 
foreign key(id_cliente) references cliente(id_cliente) 
);

create table if not  exists itens_produto(
id_cardapio int not null,
id_pedido int not null,
quantidade varchar(45) not null,
foreign key(id_cardapio) references cardapio(id_cardapio),
foreign key(id_pedido) references pedido(id_pedido) 
);

create table if not  exists endereco(
id_endereco int not null,
rua varchar(45) not null,
bairro varchar(45) not null,
numero varchar(45) not null,
descricao varchar(45) not null,
id_cliente int not null,
primary key(id_endereco), 
foreign key(id_cliente) references cliente(id_cliente) 
);

create table if not  exists funcionarios(
id_funcionarios int not null,
nome varchar(45) not null,
cargo varchar(45) not null,
primary key(id_funcionarios)
);
