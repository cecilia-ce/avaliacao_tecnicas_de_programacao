CREATE TABLE pagamento (
    codigo_pagamento INT PRIMARY KEY AUTO_INCREMENT, 
    parcela INT NOT NULL, 
    valor_pago DECIMAL NOT NULL, 
    dia_vencimento INT NOT NULL,
    valor_honorario DECIMAL NOT NULL,
    codigo_caso INT NOT NULL, 
    CONSTRAINT relacao_caso FOREING KEY(codigo_caso) REFERENCES caso(codigo),
);