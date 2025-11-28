-- CREACIÓN DE SECUENCIAS --

CREATE SEQUENCE seq_artistas START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_generos START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_albumes START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_canciones START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_usuarios START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_playlists START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_playlist_canciones START WITH 1 INCREMENT BY 1 NOCACHE;
CREATE SEQUENCE seq_historial_reproducciones START WITH 1 INCREMENT BY 1 NOCACHE;

-- INSERTS DE LA TABLA ARTISTAS --

INSERT INTO artistas (id_artista, nombre, pais)
VALUES (seq_artistas.NEXTVAL, 'Coldplay', 'Reino Unido');

INSERT INTO artistas (id_artista, nombre, pais)
VALUES (seq_artistas.NEXTVAL, 'The Weeknd', 'Canadá');

INSERT INTO artistas (id_artista, nombre, pais, fecha_debut, biografia, verificado)
VALUES (seq_artistas.NEXTVAL, 'The Weeknd', 'Canadá', '28/11/2025', 'Artista nº a nivel mundial', 'S');
INSERT INTO artistas (id_artista, nombre, pais, fecha_debut, biografia, verificado) 
VALUES (seq_artistas.NEXTVAL, 'Bad Bunny', 'Puerto Rico', '15/03/2016', 'Cantante y compositor urbano reconocido internacionalmente', 'S'),
(seq_artistas.NEXTVAL, 'Dua Lipa', 'Reino Unido', '12/06/2015', 'Artista pop con múltiples premios musicales', 'S'),
(seq_artistas.NEXTVAL, 'Rosalía', 'España', '10/02/2017', 'Reconocida por fusionar flamenco con estilos modernos', 'S'),
(seq_artistas.NEXTVAL, 'BTS', 'Corea del Sur', '13/06/2013', 'Grupo de K-Pop con impacto global', 'S'),
(seq_artistas.NEXTVAL, 'Ed Sheeran', 'Reino Unido', '26/09/2011', 'Cantautor influente en la música pop y acústica', 'S'),
(seq_artistas.NEXTVAL, 'Karol G', 'Colombia', '04/07/2017', 'Cantante urbana destacada en la escena latina', 'S'),
(seq_artistas.NEXTVAL, 'Billie Eilish', 'Estados Unidos', '29/03/2016', 'Artista pop conocida por su estilo único', 'S'),
(seq_artistas.NEXTVAL, 'Adele', 'Reino Unido', '28/01/2008', 'Cantante de soul con múltiples premios Grammy', 'S'),
(seq_artistas.NEXTVAL, 'J Balvin', 'Colombia', '27/05/2009', 'Uno de los máximos exponentes del reggaetón', 'S'),
(seq_artistas.NEXTVAL, 'Shakira', 'Colombia', '24/10/1991', 'Artista latina con presencia mundial', 'S'),
(seq_artistas.NEXTVAL, 'Linkin Park', 'Estados Unidos', '24/10/2000', 'Banda de rock alternativo y nu metal con impacto global', 'S'),
(seq_artistas.NEXTVAL, 'Rauw Alejandro', 'Puerto Rico', '12/02/2017', 'Cantante de reggaetón y R&B contemporáneo', 'S'),
(seq_artistas.NEXTVAL, 'Justin Bieber', 'Canadá', '01/07/2009', 'Artista pop con gran impacto internacional', 'S'),
(seq_artistas.NEXTVAL, 'Taylor Swift', 'Estados Unidos', '19/10/2006', 'Cantautora multipremiada y una de las más influyentes', 'S'),
(seq_artistas.NEXTVAL, 'Sia', 'Australia', '15/08/1997', 'Cantautora con distintiva voz y estilo artístico', 'S'),
(seq_artistas.NEXTVAL, 'Maluma', 'Colombia', '01/06/2011', 'Artista urbano latino de alcance global', 'S'),
(seq_artistas.NEXTVAL, 'Harry Styles', 'Reino Unido', '12/05/2017', 'Cantante pop global y exmiembro de One Direction', 'S'),
(seq_artistas.NEXTVAL, 'Anitta', 'Brasil', '06/04/2013', 'Cantante brasileña influyente en la música latina', 'S'),
(seq_artistas.NEXTVAL, 'Maroon 5', 'Estados Unidos', '25/06/2002', 'Banda pop rock con múltiples éxitos mundiales', 'S'),
(seq_artistas.NEXTVAL, 'Imagine Dragons', 'Estados Unidos', '15/09/2012', 'Banda de rock alternativo con renombre global', 'S'),
(seq_artistas.NEXTVAL, 'Rihanna', 'Barbados', '30/08/2005', 'Cantante y empresaria con influencia mundial', 'S'),
(seq_artistas.NEXTVAL, 'Ozuna', 'Puerto Rico', '15/01/2016', 'Artista urbano con récords de ventas', 'S'),
(seq_artistas.NEXTVAL, 'Becky G', 'Estados Unidos', '04/04/2014', 'Cantante pop y urbana de origen latino', 'S'),
(seq_artistas.NEXTVAL, 'Sam Smith', 'Reino Unido', '23/10/2012', 'Artista pop y soul con voz distintiva', 'S'),
(seq_artistas.NEXTVAL, 'Luis Fonsi', 'Puerto Rico', '12/09/1998', 'Cantante pop y baladista reconocido globalmente', 'S'),
(seq_artistas.NEXTVAL, 'Sech', 'Panamá', '10/03/2017', 'Cantante urbano con estilo melódico', 'S'),
(seq_artistas.NEXTVAL, 'The Kid LAROI', 'Australia', '18/05/2019', 'Joven artista de rap y pop', 'S'),
(seq_artistas.NEXTVAL, 'TINI', 'Argentina', '18/03/2016', 'Cantante argentina con proyección internacional', 'S'),
(seq_artistas.NEXTVAL, 'Myke Towers', 'Puerto Rico', '11/01/2016', 'Rapper y cantante urbano destacado', 'S'),
(seq_artistas.NEXTVAL, 'Doja Cat', 'Estados Unidos', '05/04/2018', 'Artista pop/rap con éxitos globales', 'S'),
(seq_artistas.NEXTVAL, 'Post Malone', 'Estados Unidos', '20/08/2015', 'Rapper y cantante con estilo híbrido', 'S'),
(seq_artistas.NEXTVAL, 'Jhay Cortez', 'Puerto Rico', '15/07/2017', 'Artista urbano y compositor reconocido', 'S'),
(seq_artistas.NEXTVAL, 'Nathy Peluso', 'Argentina', '01/10/2017', 'Cantante y performer con estilo único', 'S'),
(seq_artistas.NEXTVAL, 'Lola Índigo', 'España', '14/01/2018', 'Artista pop y urbana española', 'S'),
(seq_artistas.NEXTVAL, 'QUEEN', 'Reino Unido', '13/07/1973', 'Mítica banda de rock', 'S'),
(seq_artistas.NEXTVAL, 'AC/DC', 'Australia', '31/12/1975', 'Legendaria banda de rock duro', 'S'),
(seq_artistas.NEXTVAL, 'Metallica', 'Estados Unidos', '06/03/1983', 'Banda icónica de heavy metal', 'S'),
(seq_artistas.NEXTVAL, 'Arctic Monkeys', 'Reino Unido', '23/01/2006', 'Banda de rock alternativo británica', 'S'),
(seq_artistas.NEXTVAL, 'Gorillaz', 'Reino Unido', '26/03/2001', 'Banda virtual de rock alternativo', 'S'),
(seq_artistas.NEXTVAL, 'Kendrick Lamar', 'Estados Unidos', '14/09/2012', 'Uno de los raperos más influyentes de su generación', 'S'),
(seq_artistas.NEXTVAL, 'Travis Scott', 'Estados Unidos', '16/10/2013', 'Rapper y productor musical', 'S'),
(seq_artistas.NEXTVAL, 'Queen Latifah', 'Estados Unidos', '15/11/1989', 'Pionera del rap femenino y actriz', 'S'),
(seq_artistas.NEXTVAL, 'Eminem', 'Estados Unidos', '23/02/1999', 'Uno de los raperos más exitosos del mundo', 'S'),
(seq_artistas.NEXTVAL, 'Drake', 'Canadá', '14/06/2006', 'Rapero y cantante con impacto global', 'S'),
(seq_artistas.NEXTVAL, 'C. Tangana', 'España', '17/10/2011', 'Artista español de música urbana y fusión', 'S'),
(seq_artistas.NEXTVAL, 'Maná', 'México', '02/02/1986', 'Banda mexicana de rock latino', 'S'),
(seq_artistas.NEXTVAL, 'Luis Miguel', 'México', '12/01/1982', 'Cantante latino legendario', 'S'),
(seq_artistas.NEXTVAL, 'CNCO', 'Estados Unidos', '26/01/2016', 'Boyband latina con éxitos globales', 'S'),
(seq_artistas.NEXTVAL, 'Morat', 'Colombia', '13/06/2015', 'Banda de pop/folk colombiana', 'S'),
(seq_artistas.NEXTVAL, 'Pablo Alborán', 'España', '10/11/2010', 'Cantautor español de baladas', 'S'),
(seq_artistas.NEXTVAL, 'Camila Cabello', 'Estados Unidos', '25/03/2015', 'Cantante pop de origen cubano', 'S'),
(seq_artistas.NEXTVAL, 'Selena Gomez', 'Estados Unidos', '19/07/2010', 'Cantante y actriz con reconocimiento global', 'S'),
(seq_artistas.NEXTVAL, 'Lali', 'Argentina', '04/09/2014', 'Artista pop argentina', 'S'),
(seq_artistas.NEXTVAL, 'Rels B', 'España', '09/05/2015', 'Cantante urbano español', 'S'),
(seq_artistas.NEXTVAL, 'Paulo Londra', 'Argentina', '02/01/2018', 'Artista de trap argentino', 'S'),
(seq_artistas.NEXTVAL, 'Feid', 'Colombia', '17/09/2016', 'Cantante urbano con estilo distintivo', 'S'),
(seq_artistas.NEXTVAL, 'Eladio Carrión', 'Estados Unidos', '02/02/2017', 'Rapero y cantante urbano', 'S');


