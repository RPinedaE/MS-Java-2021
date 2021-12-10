CREATE TABLE MEDICO (
  `ID_MEDICO` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `NOMBRES` VARCHAR(100) NULL COMMENT 'Nombres',
  `APELLIDOS` VARCHAR(60) NULL COMMENT 'Apellidos',
  `CMP` VARCHAR(8) NULL COMMENT 'Colegio Medico del Peru',
  `ESTADO` VARCHAR(1) NULL DEFAULT '1' COMMENT 'Estado del Registro'
  );
  
INSERT INTO MEDICO (NOMBRES, APELLIDOS, CMP, ESTADO) 
VALUES ('Pedro Antonio','Murillo Ulloa','54216','1');

INSERT INTO MEDICO (NOMBRES, APELLIDOS, CMP, ESTADO) 
VALUES ('Maria Cristhina','Horna Dulanto','50521','1');