CREATE TABLE DD_Advogados;

CREATE TABLE usuario (
codigo_usuario int PRIMARY KEY AUTO_INCREMENT,
login VARCHAR(90) NOT NULL,
senha VARCHAR(20) NOT NULL,
nome VARCHAR(50) NOT NULL
);

CREATE TABLE cliente (
codigo_cliente INT PRIMARY KEY AUTO_INCREMENT,
cpf VARCHAR(14) PRIMARY KEY NOT NULL,
nome VARCHAR(50) NOT NULL,
sobrenome VARCHAR(80) NOT NULL,
endereco VARCHAR(100) NOT NULL, 
estado_civil VARCHAR(60),
cep VARCHAR(9) NOT NULL 
);

Caso(Advogado,cliente,Descrição,valor_dos_honorarios,tipo_de_serviço,Parcelas, data_vencimento)
CREATE TABLE caso(
codigo_caso INT PRIMARY KEY AUTO_INCREMENT,
codigo_usuario INT NOT NULL, 
codigo_cliente INT NOT NULL, 
descricao VARCHAR(500),
valor_honorarios DOUBLE NOT NULL, 
parcelas INT NOT NULL, 
dia_vencimento INT NOT NULL,
CONSTRAINT relacao_usuario FOREIGN KEY(codigo_usuario) REFERENCES usuario(codigo_usuario),
CONSTRAINT relacao_cliente FOREIGN KEY(codigo_cliente) REFERENCES cliente(codigo_cliente)
);

CREATE TABLE pagamento (
    codigo_pagamento INT PRIMARY KEY AUTO_INCREMENT, 
    codigo_caso INT NOT NULL, 
    valor_pago DOUBLE NOT NULL, 
    data_pagamento VARCHAR(10) NOT NULL, 
    CONSTRAINT relacao_caso FOREIGN KEY(codigo_caso) REFERENCES caso(codigo_caso)
);



CONSTRAINT relacao_cliente FOREIGN KEY(codigo_cliente) REFERENCES cliente(codigo_cliente)