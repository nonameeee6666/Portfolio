CREATE TABLE clientesMulti(
cliente TEXT not NULL,
PRIMARY KEY(cliente)
)
CREATE TABLE livrosMulti(
livros TEXT NOT NULL,
PRIMARY KEY(livros)
)
CREATE TABLE clientesFN1(
nome VARCHAR(20) not NULL,
cpf VARCHAR(14) not NULL,
idade int NOT NULL,
PRIMARY KEY(cpf)
)
CREATE TABLE livrosFN1(
id_livro int not NULL,
titulo VARCHAR(30) not null,
qnt int not null,
PRIMARY KEY(id_livro)
)
CREATE TABLE livrosAlugadosFN1(
cpf_cliente VARCHAR(14) not NULL,
id_livro int not NULL,
PRIMARY KEY(id_livro),
FOREIGN KEY (id_livro) REFERENCES livrosfn1 (id_livro),
FOREIGN KEY (cpf_cliente) REFERENCES clientesfn1 (cpf)
)

INSERT INTO clientesMulti(cliente)
values ('Pedro, cpf:159.566.137-32,25 anos, sem livros'), ('Maria, cpf:20850218470, Livros: Pale Blue Dot, Alice no País das Maravilhas')

INSERT INTO livrosmulti(livros)
VALUES ('id:2, titulo: Darkside Livros de Sangue'), ('id:34, titulo: Darkside Livros de Sangue Vol2')

INSERT INTO clientesfn1(nome, cpf, idade)
VALUES ('Pedro', '159.566.137-32', 25), ('Maria', '208.502.184-70', 16)

INSERT INTO livrosfn1(id_livro, titulo, qnt)
VALUES (2, 'Darkside Livros de Sangue', 3), (34, 'Darkside Livros de Sangue Vol2', 20), (12, 'Pale Blue Dot', 5), (10, 'Alice no País das Maravilhas', 1)

INSERT INTO livrosalugadosfn1(id_livro, cpf_cliente)
VALUES (12, '208.502.184-70'), (10, '208.502.184-70')

SELECT * FROM clientesmulti;
SELECT * FROM livrosmulti;
SELECT * FROM clientesfn1;
SELECT * FROM livrosfn1;
SELECT * FROM livrosalugadosfn1;