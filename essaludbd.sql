create database essaludbd

use essaludbd


CREATE TABLE rol (
    idrol INT AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    CONSTRAINT roles_pk PRIMARY KEY (idrol)
);


CREATE TABLE usuario (
    id INT AUTO_INCREMENT NOT NULL,
    codigo VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(300) NOT NULL,
    email VARCHAR(200) NOT NULL UNIQUE,
    activo BOOL NOT NULL DEFAULT TRUE,
    CONSTRAINT users_pk PRIMARY KEY (id)
);


CREATE TABLE rol_usuario (
    id INT NOT NULL,
    idrol INT NOT NULL,
    CONSTRAINT user_role_pk PRIMARY KEY (id, idrol),
    CONSTRAINT user_role_FK FOREIGN KEY (id) REFERENCES usuario(id) ON DELETE CASCADE,
    CONSTRAINT user_role_FK_1 FOREIGN KEY (idrol) REFERENCES rol(idrol) ON DELETE CASCADE
);


