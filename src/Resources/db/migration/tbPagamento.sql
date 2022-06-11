CREATE TABLE pagamento (
    codigo_pagamento INT PRIMARY KEY AUTO_INCREMENT, 
    codigo_caso INT NOT NULL, 
    valor_pago DECIMAL NOT NULL, 
    data_pagamento DATE NOT NULL, 
    CONSTRAINT relacao_caso FOREING KEY(codigo_caso) REFERENCES caso(codigo),
);