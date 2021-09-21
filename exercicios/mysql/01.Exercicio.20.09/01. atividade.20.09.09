/*Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.*/

CREATE DATABASE db_rh_empresa;

USE db_rh_empresa


/*Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.*/

CREATE TABLE tb_funcionarios (
	id int(5) auto_increment,
	nome varchar(30) not null,
	celular int(9) not null,
	email varchar(50),
	endereco varchar(100),
	faculdade varchar(50),
	salario decimal(10,2),
	primary key (id)
);


/*Popule esta tabela com até 5 dados;*/

INSERT INTO tb_funcionarios(nome, celular, email, endereco, faculdade, salario) VALUES ("George", 978787878, "george@hotmail.com", "Rua do Bosque", "Faculdade Impacta", 1500.00);
INSERT INTO tb_funcionarios(nome, celular, email, endereco, faculdade, salario) VALUES ("Walter White", 965899696, "heisenberg@hotmail.com", "Alburqueque, 500",	"Faculdade de Quimica",	1900.00);
INSERT INTO tb_funcionarios(nome, celular, email, endereco, faculdade, salario) VALUES ("Dean Winchester", 966666666, "brothers@hotmail.com", "Rua do Impala", "Faculdade do Castiel", 3500.00);
INSERT INTO tb_funcionarios(nome, celular, email, endereco, faculdade, salario) VALUES ("Michael Scofield", 998788766, "scofield@hotmail.com", "Rua do Calabouço", "Faculdade de Engenharia", 4500.00);
INSERT INTO tb_funcionarios(nome, celular, email, endereco, faculdade, salario) VALUES ("Robert Downey Jr", 965333658, "jarvis@hotmail.com", "Quinta Avenida", "Faculdade Thanos",	5500.00);



/*Faça um select que retorne os funcionaries com o salário maior do que 2000.*/

SELECT nome, salario FROM tb_funcionarios WHERE salario > 2000;


/*Faça um select que retorne os funcionaries com o salário menor do que 2000.*/

SELECT nome, salario FROM tb_funcionarios WHERE salario < 2000;


/*Ao término atualize um dado desta tabela através de uma query de atualização.*/

UPDATE tb_funcionarios SET salario = 2240.00 WHERE id = 1;