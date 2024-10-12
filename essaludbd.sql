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

CREATE TABLE paciente (
    idPaciente INT AUTO_INCREMENT PRIMARY KEY,
    nombrePac VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    dni VARCHAR(8) UNIQUE NOT NULL,
    fecha_nacimiento DATE,
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    correo VARCHAR(255),
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);
