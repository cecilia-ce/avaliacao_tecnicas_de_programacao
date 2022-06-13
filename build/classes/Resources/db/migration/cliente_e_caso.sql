CREATE DATABATE d_advogados;


CREATE TABLE cliente (
codigo_cliente INT PRIMARY KEY AUTO_INCREMENT,
cpf VARCHAR(14),
nome VARCHAR(50),
endereco VARCHAR(100), 
estado_civil VARCHAR(60),
cep VARCHAR(10)
);


CREATE TABLE caso(
codigo_caso INT PRIMARY KEY AUTO_INCREMENT,
descricao VARCHAR(500),
valor_honorarios DOUBLE, 
parcelas INT, 
dia_vencimento INT
);