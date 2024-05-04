-- Active: 1714790874407@@mysql-120c4bde-gabrieldias.d.aivencloud.com@25145@defaultdb
CREATE TABLE tb_pessoa(
    cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (200) NOT NULL,
    fone VARCHAR (200) NOT NULL,
    email VARCHAR (200) NULL
);

INSERT INTO tb_pessoa
(nome, fone, email)
VALUES
('José', '40028922', 'jose@gmail.com');
INSERT INTO tb_pessoa
(nome, fone, email)
VALUES
('João', '40041111', 'joao@gmail.com');
INSERT INTO tb_pessoa
(nome, fone, email)
VALUES
('Maria', '38389395', 'maria@gmail.com');

SELECT * FROM tb_pessoa;

SELECT  nome, email FROM tb_pessoa;
SELECT * FROM tb_pessoa WHERE cod_pessoa = 1;

SELECT *FROM tb_pessoa WHERE nome LIKE '%J';
