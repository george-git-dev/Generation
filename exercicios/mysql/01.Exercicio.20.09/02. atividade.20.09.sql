/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.*/

CREATE DATABASE db_ecommerce;

USE db_ecommerce;


/*Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.*/

CREATE TABLE tb_produtos (
	id INT(5) AUTO_INCREMENT,
	tipo VARCHAR(30) NOT NULL,
	cor VARCHAR(50) NOT NULL,
	marca VARCHAR(50),
	tamanho INT(10),
	preco DECIMAL(10,2),
	primary key (id)
);



/*Popule esta tabela com até 8 dados;*/

INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("tenis", "branco", "nike", 40, 500.00);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("tenis", "preto", "adidas", 38, 450.99);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("camiseta", "azul", "lacoste", 4, 845.99);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("camiseta", "cinza", "polo", 5, 82.70);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("meia", "branco", "nike", 37, 15.90);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("calça", "azul", "armani", 42, 100.80);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("bermuda", "verde", "oakley", 38, 60.45);
INSERT INTO tb_produtos(tipo, cor, marca, tamanho, preco) VALUES ("regata", "amarela", "renner", 3, 22.90);



/*Faça um select que retorne os produtos com o valor maior do que 500.*/

SELECT tipo, preco FROM tb_produtos WHERE preco > 500;



/*Faça um select que retorne os produtos com o valor menor do que 500.*/

SELECT tipo, preco FROM tb_produtos WHERE preco < 500;



/*Ao término atualize um dado desta tabela através de uma query de atualização.*/
UPDATE tb_produtos SET preco = 845.99 WHERE id = 3;