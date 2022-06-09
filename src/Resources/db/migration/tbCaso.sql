CREATE TABLE caso (
    codigo_caso PRIMARY KEY AUTO INCREMENT,
    tipo_de_servico CHAR,
    valor_dos_honorarios DECIMAL,
    parcelas INT,
    data_vencimento DATE,
    descricao VARCHAR,
    CONSTRAINT advogado FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo_usuario)
    CONSTRAINT clie FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo_cliente)
);

