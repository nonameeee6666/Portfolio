CREATE TABLE atributos(
id_empregado int not null,
endereco_empresa VARCHAR(100) not null,
id_empresa int not null,
nome_empregado VARCHAR(30) not null,
horas_semanais int not null
)

/*******NORMALIZAÇÃO*******/
CREATE TABLE empregadoFN2(
id_empregado int not null,
nome_empregado VARCHAR(10) not null,
sobrenome_empregado VARCHAR(20) not null,
horas_semanais int not null,
PRIMARY KEY (id_empregado)
)
CREATE TABLE empresaFN2(
nome_empresa VARCHAR(30) not null,
id_empresa int not null,
cidade_empresa VARCHAR(20) not null,
rua_empresa VARCHAR(50) not null,
num_empresa int not null,
cep_empresa VARCHAR(9) not null,
complemento VARCHAR(30),
PRIMARY KEY (id_empresa)
)
CREATE TABLE empregado_empresaFN2(
id_empregado int not null,
id_empresa int not null,
FOREIGN KEY (id_empregado) REFERENCES empregadoFN2 (id_empregado),
FOREIGN KEY (id_empresa) REFERENCES empresaFN2 (id_empresa)
)