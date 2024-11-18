Para que o sistema possa ser testado a contento, deve ser previsto um script de inicialização capaz de popular (inserir dados) o banco de
dados com pelo menos  5 equipes e 10 equipamento diferentes. 

DROP TABLE evento IF EXISTS;
CREATE TABLE evento (codigo LONG,
                    descricao VARCHAR(255),
                    data VARCHAR(255),
                    latitude int,
                    longitude int,
                    PRIMARY KEY(codigo)
                    );
   