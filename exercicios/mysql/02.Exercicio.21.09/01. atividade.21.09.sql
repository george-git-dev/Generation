/*Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.*/

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

/*O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.
siga exatamente esse passo a passo:
Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.*/

CREATE TABLE tb_classe (
	id_classe INT NOT NULL AUTO_INCREMENT,
    nome_classe VARCHAR(255) NOT NULL,
	arma_classe VARCHAR(255) NOT NULL,
    PRIMARY KEY(id_classe))
);

/*Popule esta tabela classe com até 5 dados.*/

INSERT INTO tb_classe (nome_classe, arma_classe)
VALUES
("Arqueiro(a)", "Arco e Flexa"),
("Assassino(a)", "Adaga"),
("Mago(a)", "Cajado"),
("Guerreiro(a)", "Espada de duas Mãos"),
("Bardo(a)", "Cavaquinho");

/*Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).*/

CREATE TABLE tb_personagem (
	id_personagem INT NOT NULL AUTO_INCREMENT,
    nome_personagem VARCHAR(255) NOT NULL,
    poder_ataque INT,
    poder_defesa INT,
    fk_classe INT,
    PRIMARY KEY(id_personagem),
    FOREIGN KEY (fk_classe) REFERENCES tb_classe (id_classe)
);

/*Popule esta tabela personagem com até 8 dados.*/

INSERT INTO tb_personagem (nome_personagem, poder_ataque, poder_defesa, fk_classe)
VALUES
("Rafa", 1500, 10000, 3),
("Ronan", 200, 10000, 2),
("Priscila", 100, 10000, 1),
("Amanda", 500, 10000, 5),
("Italo", 500, 10000, 5),
("Rani", 200, 10000, 2),
("Leo", 200, 10000, 2),
("Lord Boaz", 200, 15000, 4);

/*Faça um select que retorne os personagens com o poder de ataque maior do que 2000.*/

SELECT * FROM tb_personagem
WHERE poder_ataque > 2000;


/*Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.*/

SELECT * FROM tb_personagem
WHERE poder_defesa BETWEEN 12000 AND 18000;


/*Faça um select utilizando LIKE buscando os personagens com a letra C.*/

SELECT * FROM tb_personagem
WHERE nome_personagem LIKE "%C%";
 
 
/*Faça um um select com Inner join entre tabela classe e personagem.*/

SELECT * FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.classe_id = tb_classe.id;

/*Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).*/

SELECT nome_personagem, nome_classe, arma_classe
FROM tb_personagem
INNER JOIN tb_classe ON tb_personagem.fk_classe = tb_classe.id_classe
WHERE nome_classe = 'Arqueiro(a)';