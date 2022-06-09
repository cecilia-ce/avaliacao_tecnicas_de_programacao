CREATE TABLE caso (
    tipo_de_servico CHAR PRIMARY KEY,
    valor_dos_honorarios VARCHAR LOAD,
    parcelas VARCHAR BIGINT,
    data_vencimento VARCHAR DATE,
    descricao VARCHAR TEXT,
    CONSTRAINT advogado FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo_usuario)
    CONSTRAINT clie FOREIGN KEY (codigo_cliente) REFERENCES cliente(codigo_cliente)
);

