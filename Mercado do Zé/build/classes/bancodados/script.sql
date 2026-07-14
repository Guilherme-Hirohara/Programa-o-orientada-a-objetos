USE mercado;

CREATE TABLE Produto(
	nome VARCHAR(50) NOT NULL, 
    quantidade INTEGER NOT NULL, 
    preco DOUBLE NOT NULL, 
    codigo INT NOT NULL,
    PRIMARY KEY (codigo)
    
); 

INSERT INTO Produto VALUES (nome, quantidade, preco, codigo), 
	("Batata", 20, 3.50, 1),
    ("Cebola", 100, 2.50, 2), 
    ("Leite", 50, 3.40, 3); 

SELECT * FROM Produto;

