-- Active: 1715363650733@@pg-30853102-gabrieldias.f.aivencloud.com@25145@20241_fatec_ipi_poo@public
CREATE TABLE tb_pessoa(
    cod_pessoa SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL,
    idade INT NOT NULL
)
SELECT * FROM tb_pessoa;
