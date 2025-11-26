--===================================
-- MINIPROYECTO: SISTEMA DE MUSICA
--===================================
-- FASE 1: CREAR TABLAS BÁSICAS


--1- TABLA DE ARTISTAS
CREATE TABLE artistas (
    id_artista NUMBER(10) CONSTRAINT pk_id_artista PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    pais VARCHAR2(50),
    fecha_debut DATE,
    biografia CLOB,
    verificado CHAR(1) DEFAULT 'N' CONSTRAINT ck_verificar CHECK (verificado IN ('S','N'))
);

--2 TABLA DE GENEROS
CREATE TABLE generos (
    id_genero NUMBER(2) CONSTRAINT pk_id_generos PRIMARY KEY,
    nombre VARCHAR2(50) NOT NULL CONSTRAINT uq_nombre_genero UNIQUE,
    descripcion VARCHAR2(200)
);

--3 TABLA DE ALBUMES

CREATE TABLE albumes (
    id_album NUMBER(10) CONSTRAINT pk_id_album PRIMARY KEY,
    titulo VARCHAR2(150) NOT NULL,
    id_artista NUMBER(10) NOT NULL,
    fecha_lanzamiento DATE,
    numero_canciones NUMBER,
    duracion_total NUMBER,


    CONSTRAINT fk_id_artista FOREIGN KEY (id_artista) 
        REFERENCES artistas (id_artista)
);