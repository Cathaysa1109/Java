--===================================
-- MINIPROYECTO: SISTEMA DE MUSICA
--===================================
-- FASE 1: CREAR TABLAS BÁSICAS

-- BORRADO DE LAS TABLAS SI EXISTEN
DROP TABLE historial_reproducciones;
DROP TABLE artisplaylist_cancionestas;
DROP TABLE playlists;
DROP TABLE usuarios;
DROP TABLE canciones;
DROP TABLE albumes;
DROP TABLE generos;
DROP TABLE artistas;



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
    nombre VARCHAR2(50) NOT NULL CONSTRAINT uk_nombre_genero UNIQUE,
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

CREATE TABLE canciones (
    id_cancion NUMBER(10) CONSTRAINT pk_id_cancion PRIMARY KEY,
    titulo VARCHAR2(150) NOT NULL,
    id_album NUMBER(10),
    id_artista NUMBER(10) NOT NULL,
    id_genero NUMBER(2),
    duracion NUMBER(6) NOT NULL,
    numero_pista NUMBER(4),
    reproducciones NUMBER(12) DEFAULT 0,
    fecha_lanzamiento DATE,
    letra CLOB,
    CONSTRAINT fk_id_album FOREIGN KEY (id_album)
        REFERENCES albumes (id_album),
    CONSTRAINT fk_id_artista FOREIGN KEY (id_artista)
        REFERENCES artistas (id_artista),
    CONSTRAINT fk_id_genero FOREIGN KEY (id_genero)
        REFERENCES generos (id_genero)
);

CREATE TABLE usuarios (
    id_usuario NUMBER(10) CONSTRAINT pk_id_usuario PRIMARY KEY,
    nombre_usuario VARCHAR2(50) NOT NULL CONSTRAINT uk_nombre_usuario UNIQUE,
    email VARCHAR2(100) NOT NULL CONSTRAINT uk_email_usuario UNIQUE,
    nombre_completo VARCHAR2(100),
    fecha_registro DATE DEFAULT SYSDATE,
    tipo_suscripcion VARCHAR2(20) DEFAULT 'FREE' CONSTRAINT ck_tipo_suscripcion CHECK (tipo_suscripcion IN ('FREE', 'PREMIUM', 'FAMILY')),
    pais VARCHAR2(50)
);

CREATE TABLE playlists (
    id_playlist NUMBER(10) CONSTRAINT pk_id_playlist PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    id_usuario NUMBER(10) NOT NULL,
    descripcion VARCHAR2(500),
    publica CHAR(1) DEFAULT 'N' CONSTRAINT ck_publica CHECK (publica IN ('S','N')),
    fecha_creacion DATE DEFAULT SYSDATE,
    numero_canciones NUMBER(5) DEFAULT 0,

    CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario)
        REFERENCES usuarios (id_usuario)
);

CREATE TABLE playlist_canciones (
    id_playlist NUMBER(10),
    id_cancion NUMBER(10),
    orden NUMBER(5),
    fecha_agregada DATE DEFAULT SYSDATE,

    CONSTRAINT pk_playlist_canciones PRIMARY KEY (id_playlist, id_cancion),
    CONSTRAINT fk_id_playlist FOREIGN KEY (id_playlist)
        REFERENCES playlists (id_playlist) ON DELETE CASCADE,
    CONSTRAINT fk_id_cancion FOREIGN KEY (id_cancion)
        REFERENCES canciones (id_cancion) ON DELETE CASCADE
);

CREATE TABLE historial_reproducciones (
    id_reproduccion NUMBER(12) CONSTRAINT pk_id_reproduccion PRIMARY KEY,
    id_usuario NUMBER(10) NOT NULL,
    id_cancion NUMBER(10) NOT NULL,
    fecha_hora DATE DEFAULT SYSDATE,
    duracion_escuchada NUMBER(6),
    completada CHAR(1) DEFAULT 'N' CONSTRAINT ck_completada CHECK (completada IN ('S','N')),

    CONSTRAINT fk_id_usuario_historial FOREIGN KEY (id_usuario)
        REFERENCES usuarios_historial (id_usuario),
    CONSTRAINT fk_id_cancion_historial FOREIGN KEY (id_cancion)
        REFERENCES canciones_historial (id_cancion)
);
