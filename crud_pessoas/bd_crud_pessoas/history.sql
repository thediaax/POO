/* 2024-05-10 15:09:23 [492 ms] */ 
CREATE TABLE tb_pessoa(
    cod_pessoa SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(200) NOT NULL,
    email VARCHAR(100) NOT NULL,
    idade INT NOT NULL
);
/* 2024-05-10 15:10:03 [196 ms] */ 
SELECT * FROM tb_pessoa LIMIT 100;
/* 2024-05-10 15:28:11 [193 ms] */ 
ALTER DATABASE defaultdb;
