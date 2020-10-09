create database api_car;
use api_car;

CREATE TABLE tb_car (
    id INTEGER NOT NULL AUTO_INCREMENT,
    veiculo VARCHAR(255) NOT NULL,
    ano INTEGER NOT NULL,
    marca VARCHAR(255) NOT NULL,
    vendido BOOL,
    created DATETIME,
    updated DATETIME,
    descricao VARCHAR(255) NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tb_marca (
    marca VARCHAR(255) NOT NULL,
    PRIMARY KEY (marca)
);
COMMIT;

insert into tb_marca (marca) 
values ('CHEVROLET');
insert into tb_marca (marca) 
values ('FORD');
insert into tb_marca (marca) 
values ('HYUNDAI');
insert into tb_marca (marca) 
values ('RENAULT');
insert into tb_marca (marca) 
values ('PEUGEOT');
insert into tb_marca (marca) 
values ('VOLKSWAGEN');
insert into tb_marca (marca) 
values ('FIAT');

INSERT INTO tb_car (`veiculo`,`ano`,`marca`,`vendido`,`created`,`updated`,`descricao`) VALUES ('KA2',2018,'FORD',0,'2020-10-09 02:31:31','2020-10-09 02:31:31','CARRO NOVINHO');
INSERT INTO tb_car (`veiculo`,`ano`,`marca`,`vendido`,`created`,`updated`,`descricao`) VALUES ('HB20',2012,'HYUNDAI',1,'2020-10-09 04:25:40','2020-10-09 04:25:40','CARRO BOM');
INSERT INTO tb_car (`veiculo`,`ano`,`marca`,`vendido`,`created`,`updated`,`descricao`) VALUES ('SANDERO',2015,'RENAULT',1,'2020-10-04 04:25:40','2020-10-04 04:25:40','CARRO BOM MUITO BOM');
INSERT INTO tb_car (`veiculo`,`ano`,`marca`,`vendido`,`created`,`updated`,`descricao`) VALUES ('MAREA',1990,'FIAT',0,'2020-10-09 05:27:10','2020-10-09 05:27:10','CARRO RUIM');
INSERT INTO tb_car (`veiculo`,`ano`,`marca`,`vendido`,`created`,`updated`,`descricao`) VALUES ('GOLF',2005,'VOLKSWAGEN',0,'2020-10-09 05:27:10','2020-10-09 05:27:10','CARRO BOM');


COMMIT;


