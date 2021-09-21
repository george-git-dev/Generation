/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos estudantes deste registro dessa escola.*/

CREATE DATABASE db_escola;

USE db_escola;


/*Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos estudantes para se trabalhar com o serviço dessa escola.*/

CREATE TABLE tb_estudantes (
	id int(5) AUTO_INCREMENT,
	Nome VARCHAR(30) not null,
    Sala int(10) not null,
	Materia VARCHAR(30) not null,
    Serie int(10) not null,
    Nota DECIMAL(10,2) not null,
	PRIMARY KEY (id)
 );

/*Popule esta tabela com até 8 dados;*/

INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("George", 2, "Banco de Dados", 8, 8.6);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Chaves", 3, "Algoritmos", 1, 4.6);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Chiquinha", 4, "Java", 9, 6.9);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Kiko", 8, "Angular", 4, 4.1);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Pops", 7, "HTML", 3, 3.0);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Madruga", 3, "HTML", 3, 10.0);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Clotilde", 2, "CSS", 2, 1.0);
INSERT INTO tb_estudantes(Nome, sala, Materia, Serie, Nota) VALUES("Florinda", 1, "JavaScript", 1, 7.0);


/*Faça um select que retorne o/as estudantes com a nota maior do que 7.*/

SELECT Nome, Materia, Nota FROM tb_estudantes WHERE Nota > 7;


/*Faça um select que retorne o/as estudantes com a nota menor do que 7.*/

SELECT Nome, Materia, Nota FROM tb_estudantes WHERE nota < 7;


/*Ao término atualize um dado desta tabela através de uma query de atualização.*/

UPDATE tb_estudantes SET Nota = 9 WHERE id = 6;