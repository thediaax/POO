-- Active: 1715363650733@@pg-30853102-gabrieldias.f.aivencloud.com@25145@defaultdb@public
CREATE TABLE tb_pessoa(
    cod_pessoa SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(200) NOT NULL,
    email VARCHAR(100) NOT NULL,
    idade INT NOT NULL
)

SELECT * FROM tb_pessoa;

ALTER DATABASE defaultdb
ALTER DATABASE CardManagement MODIFY NAME = 20241_fatec_ipi_poo_pessoas;
ALTER DATABASE 20241_fatec_ipi_poo_pessoas;
