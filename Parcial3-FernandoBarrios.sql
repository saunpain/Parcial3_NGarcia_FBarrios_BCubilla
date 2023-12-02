create database Parcial3corregido

create table Titulos(
cod_titulos int constraint Titulos_cod_titulos_pk primary key,
titulos varchar(400)
)

create table Subtitulos(
cod_subtitulos varchar(10) constraint subtitulos_cod_subtitulos_pk primary key,
subtitulos varchar(5000),
cod_titulos int constraint Subtitulos_fk foreign key (cod_titulos)references  titulos(cod_titulos)
)



create table Texto (
cod_texto varchar(10) constraint texto_pk primary key,
texto varchar(2000),
cod_subtitulos varchar(10) constraint Texto_cod_subtitulos_fk foreign key(cod_subtitulos) references subtitulos (cod_subtitulos),
cod_titulos  int constraint Texto_Subtitulos_fk foreign key (cod_titulos)references  titulos(cod_titulos),
)

create table Imagenes(
	cod_imagenes varchar(10) constraint imagenes_cod_imagenes_pk primary key,
	imagenes varchar(1000),
	cod_subtitulos varchar(10) constraint imagenes_cod_subtitulos_fk foreign key(cod_subtitulos) references subtitulos (cod_subtitulos),
	cod_titulos int constraint Imagenes_Subtitulos_fk foreign key (cod_titulos)references  titulos(cod_titulos),
	cod_texto varchar(10) constraint Imagenes_cod_texto foreign key(cod_texto) references Texto(cod_texto)
)



insert into Titulos (cod_titulos, titulos)
values (1,'JuJutsu Kaisen'),
		(2,'GOJO'),
		(3,'La velada del año'),
		(4,'En caso de que Sukuna pierda estas maldiciones son las que lo apoyaran:'),
		(5, 'En caso de que Gojo pierda estos hechiceros son los que lo que se encargaran de matar a Sukuna:'),
		(6,'La muerte de Gojo'),
		(7,'Un nuevo contrincante'),
		(8,'La batalla sigue...'),
		(9,'Nuestros principales patrocinadores'),
		(10,'Lista de todos los personajes de Jujutsu Kaisen')



insert into subtitulos(cod_subtitulos,subtitulos,cod_titulos)
 values ('2-1','EL MÁS FUERTE',2),
		('2-2','LA MALDICION MÁS FUERTE',2),
		('5-1','Yuta',5),
		('5-2','Hiromi Higuruma',5),
		('5-3','Itadori Yuji',5),
		('5-4','Kashimo',5),
		('5-5','Hakari',5),
		('5-6','Hana Kurusu',5),
		('6-1','Cómo murió Gojo siendo el más fuerte?',6),
		('7-1','Kashimo',7),
		('7-2','Sukuna',7)


		

insert into Texto (cod_texto,texto,cod_subtitulos,cod_titulos)
values('2-1','Es uno de los hechizeros mas fuertes del mundo de JuJutsu Kaisen, 
						teniendo en su poder el conjuro de "Limitless, Tiene una gran 
                        fuerza física, lo que le permite destacar en el combate cuerpo 
                        a cuerpo. Sin embargo, él es del tipo que suele usar ataques a 
                        distancia. Es capaz de arrancar extremidades, infligir violencia 
                        a otros con mucha facilidad y con simples golpes puede arrojar a 
                        su oponente a varios metros de distancia. Su fuerza le permite 
                        hacer frente a maldiciones, incluso en grandes cantidades, sin 
                        mucha dificultad.','2-1',2),

('2-2','El poder se somete ante mí. Aquellos que desafíen mi 
                    voluntad conocerán el sabor de la verdadera desesperación.','2-2',2),
('2-3','Según la leyenda, Sukuna era un demonio con apariencia humana que 
                    existió durante la época dorada del jujutsu hace unos 1000 años, 
                    los hechiceros que perfeccionaron sus habilidades lograron 
                    derrotarlo. Tras su muerte, su cuerpo no pudo ser destruido y 
                    pasó de generación en generación en forma de objetos malditos 
                    representados por un total de 20 dedos. Sin embargo, años más 
                    tarde, en la época moderna, Yuji Itadori se encuentra en posesión 
                    del dedo y se lo traga, intentando ayudar a las personas que lo 
                    rodean, gracias a lo cual Sukune logra encarnar en su cuerpo.','2-2',2),

('3-1','La gran batalla entre el rey de las maldiciones, Ryomen Sukuna y 
                        el hechicero más poderoso de la historia, Satoru Gojo, ha llegado 
                        a su final en el capítulo 235. <br>
                        Luego de salir de su prisión confinadora gracias a Angel Satoru, 
                        Gojo sale con ansias de hacerle frente a Geto, pero Sukuna se 
                        interpone en su camino.',null,3),
('3-2','Poderes:
                        Anular (解 Kai?) (literalmente, Liberación): Con un sencillo 
                        gesto de sus dedos, puede provocar la aparición de un ataque 
                        afilado convencional. Este corte se emplea para dirigirse a 
                        objetos inanimados.
                        "Partir" es una técnica que ajusta la energía maldita en función 
                        del oponente y se utiliza principalmente contra seres vivos, 
                        siendo similar a un corte estándar.',null,3),
('4-1',' Todas estas maldiciones son las que estan espectando la batalla 
                    entre Sukuna y gojo, desde lo lejos, apoyan a Sukuna para poder 
                    crear su nuevo mundo, estan esperando paciente mente cuales son 
                    los resultados de la rigida batalla, algunas estan obsorbidas 
                    por Satoru Geto ',null,4),
('5-1','La habilidad maldita de Yuta se conoce como Técnica de Mimetismo. Esta técnica le otorga la capacidad de replicar y utilizar otros rituales según su voluntad.
','5-1',5),
('5-2', 'Su shikigami toma la forma de un gran cuerpo negro con dos apéndices a cada lado, además de uno en la parte inferior que funciona como brazos y una pierna.
','5-2',5),
('5-3','no posee ningun tipo de tecnica maldita pero tiene un gran fisico y puede imbuir sus golpes con energia maldita
','5-3',5),
('5-4','Tiene la habilidad maldita de controlar la energia, puede cargar a sus enemigos con nergia negativa con cada golpe y lanzarle un rayo de energia positiva que es autodirigido por las cargas opuestas
','5-4',5),
('5-5','tiene la habilidad de apostar, y si le sale el bloque ganador en la maquina se vuelve invencible por 4:11 ya que puede generar energia maldita ilimitada','5-5',5),
('5-6',' tiene la capacidad de anular cualquier maldicion o conjuro, ademas de lanzar barreras de luz capaz de aplastar a sus enemigos','5-6',5),
('6-1','El misterio que rodea la muerte de 
                    Gojo se encuentra en la compleja estrategia de Sukuna, quien tenía un as bajo la 
                    manga: Mahoraga. Desde los primeros momentos de la pelea, era evidente que Sukuna 
                    estaba tramando un golpe maestro, apoyado en el extraordinario poder de Mahoraga. 
                    Utilizando las habilidades únicas de esta entidad, Sukuna planeó neutralizar la 
                    imbatible "Técnica Infinita" de Gojo.','6-1',6),
('7-1','Luego de la muerte de Satoru Gojo, entra nuestro nuevo contrincante, Kashimo
                    para intentar frenar a Sukuna, el rey de las maldiciones.','7-1',7),
('7-2','Sukuna está preparado para todo, piensa enfrentar a Kashimo con todo lo que tiene, 
                    para demostrar que es la forma de vida más fuerte.','7-2',7),
('9-1','Home',null,9),
('9-2','|',null,9),
('9-3','About',null,9),
('9-4','Support',null,9),
('9-5','Advertising',null,9),
('9-6','FAQ',null,9),
('9-7','Terms',null,9),
('9-8','Privacy',null,9),
('9-9','Cookie',null,9),
('9-10','|',null,9),
('9-11','Licenses',null,9),
('9-12','Parcial 2',null,9),
('9-13','Nadim García',null,9),
('9-14','Fernando Barrios',null,9),
('9-15','Brian Cubilla',null,9),
('9-16','MyParcial3.net is a property of MyParcial3 Co.,Ltd. ©2023 All Rights Reserved. <br>
                    This site is protected by reCAPTCHA and the Google Privacy Policy and Terms of Service apply.',null,9)

insert into Imagenes(cod_imagenes,imagenes,cod_subtitulos,cod_titulos,cod_texto)
values('1-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/barra-de-menus.png?raw=true',null,1,null),
		('1-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/gojoo-removebg-preview.png?raw=true',null,1,null),
		('2-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/imagen%20de%20gojo.jpg?raw=true','2-1',2,'2-1'),
		('2-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/sukuna%20icon.png?raw=true','2-2',2,'2-2'),  --logo de sukina chikito
		('2-3','"https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/sukuna2tierragamer.png?raw=true','2-2',2,'2-3'),
		('3-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/gojo%20vs%20sukuna.jpg?raw=true',null,3,'3-1'),
		('3-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/gojo%20vs%20sukuna(sukuna).jpg?raw=true',null,3,'3-2'),
		('4-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/geto-division4.jpg?raw=true',null,4,'4-1'),
		('4-2', 'https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/Urame-division4.png?raw=true',null ,4,'4-1'),
		('4-3','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/yorozu-division.png?raw=true',null,4,'4-1'),
		('4-4','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/mahito-division4.png?raw=true',null,4,'4-1'),
		('5-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/okotsu.png?raw=true','5-1',5,'5-1'),
		('5-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/el%20abogado.png?raw=true','5-2',5,'5-2'),
		('5-3','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/itadori.png?raw=true','5-3',5,'5-3'),
		('5-4','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/kashimo.png?raw=true','5-4',5,'5-4'),
		('5-5','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/hakari.png?raw=true','5-5',5,'5-5'),
		('5-6','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/angel.png?raw=true','5-6',5,'5-6'),
		('6-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/muerte-gojo.png?raw=true','6-1',6,'6-1'),
		('7-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/kashimo-icon.jpg?raw=true','7-1',7,'7-1'),
		('7-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/sukuna-icon.jpg?raw=true,','7-2',7,'7-2'),
		('8-1','https://raw.githubusercontent.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/main/media/pelea1.avif',null,8,null),
		('8-2','https://raw.githubusercontent.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/main/media/pelea2.avif',null,8,null),
		('8-3','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/pelea3.jpg?raw=true',null,8,null),
		('8-4','https://raw.githubusercontent.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/main/media/pelea4.avif',null,8,null),
		('9-1','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/crunchyroll-logo.png?raw=true',null,9,null),
		('9-2','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/Funimation.png?raw=true',null,9,null),
		('9-3','https://github.com/saunpain/Parcial2_NGarcia_FBarrios_BCubilla/blob/main/media/plutotv.png?raw=true',null,9,null)




create view nav
as
SELECT a.cod_titulos,a.titulos,i.cod_imagenes, i.imagenes
FROM Titulos a 
JOIN Imagenes i ON a.cod_titulos = i.cod_titulos
WHERE a.cod_titulos = 1


CREATE VIEW Part2 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, s.cod_subtitulos as COD_subtitulo, s.subtitulos as subtitulos, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Subtitulos s ON a.cod_titulos = s.cod_titulos
JOIN Texto t ON s.cod_subtitulos = t.cod_subtitulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  s.cod_subtitulos = '2-1' or
s.cod_subtitulos = '2-2' 

CREATE VIEW Part3 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Texto t ON a.cod_titulos = t.cod_titulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  t.cod_texto = '3-1' or
t.cod_texto = '3-2'

CREATE VIEW Part4 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Texto t ON a.cod_titulos = t.cod_titulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  t.cod_texto = '4-1'


CREATE VIEW Part5 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, s.cod_subtitulos as COD_subtitulo, s.subtitulos as subtitulos, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Subtitulos s ON a.cod_titulos = s.cod_titulos
JOIN Texto t ON s.cod_subtitulos = t.cod_subtitulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  s.cod_subtitulos = '5-1' or
s.cod_subtitulos = '5-2' or
s.cod_subtitulos = '5-3' or
s.cod_subtitulos = '5-4' or
s.cod_subtitulos = '5-5' or
s.cod_subtitulos = '5-6' 

CREATE VIEW Part6 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, s.cod_subtitulos as COD_subtitulo, s.subtitulos as subtitulos, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Subtitulos s ON a.cod_titulos = s.cod_titulos
JOIN Texto t ON s.cod_subtitulos = t.cod_subtitulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  s.cod_subtitulos = '6-1' 

CREATE VIEW Part7 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, s.cod_subtitulos as COD_subtitulo, s.subtitulos as subtitulos, t.cod_texto as 'Codigo del texto',t.texto as texto ,i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Subtitulos s ON a.cod_titulos = s.cod_titulos
JOIN Texto t ON s.cod_subtitulos = t.cod_subtitulos
JOIN Imagenes i ON t.cod_texto = i.cod_texto
where  s.cod_subtitulos = '7-1' or
s.cod_subtitulos = '7-2'

CREATE VIEW Part8 as
SELECT distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as 'Titulo', i.cod_imagenes as 'codigo imagenes', i.imagenes as Imagenes
FROM Titulos a 
JOIN Imagenes i ON a.cod_titulos = i.cod_titulos
where a.cod_titulos = 8

create view footerImagenes as
select distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, i.cod_imagenes as 'codigo imagenes', i.imagenes as 'Imagenes'
from Titulos a join Imagenes i on a.cod_titulos = i.cod_titulos
where a.cod_titulos = 9

create view footerTexto as
select distinct  a.cod_titulos as 'Codigo del titulo' ,a.titulos as Titulo, t.cod_texto as 'Codigo del texto', t.texto as 'Texto'
from Titulos a join Texto t on a.cod_titulos = t.cod_titulos
where a.cod_titulos = 9



