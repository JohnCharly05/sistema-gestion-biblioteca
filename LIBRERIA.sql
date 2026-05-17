CREATE DATABASE LIBRERIA;
USE LIBRERIA;

CREATE TABLE MANGAS(
titulo VARCHAR (50) NOT NULL PRIMARY KEY,
genero VARCHAR(30) NOT NULL,
autorManga CHAR(30) NOT NULL,
precioCompra DECIMAL(10,2) NOT NULL,
precioVenta DECIMAL(10,2) NOT NULL,
numTom INT NOT NULL,
dibujante CHAR(30) NOT NULL,
numEjemplares BIGINT NOT NULL);




CREATE TABLE NOVELAS(
titulo VARCHAR (50) NOT NULL PRIMARY KEY,
genero VARCHAR(30) NOT NULL,
autor CHAR(30) NOT NULL,
precioCompra DECIMAL(10,2) NOT NULL,
precioVenta DECIMAL(10,2) NOT NULL,
tipoNovela VARCHAR (40) NOT NULL,
numVol INT NOT NULL,
numEjemplares BIGINT NOT NULL);



CREATE TABLE METODOPAGO(
ID_Met_Pag INT NOT NULL PRIMARY KEY,
formaPago VARCHAR(40) NOT NULL);




CREATE TABLE VENTA(
numVent INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
formaPago INT NOT NULL,
fec DATETIME NOT NULL,
FOREIGN KEY (formaPago) REFERENCES METODOPAGO (ID_Met_Pag));




CREATE TABLE PROVEEDOR(
ID_Proveedor INT NOT NULL PRIMARY KEY,
nombreEmpresa VARCHAR(100) NOT NULL,
nombreContacto CHAR(100) NOT NULL,
telContacto BIGINT NOT NULL,
titulosPedir VARCHAR (400));





CREATE TABLE PEDIDO(
tipoLibro VARCHAR(30) NOT NULL,
titulo VARCHAR (50) NOT NULL,
cantPedir BIGINT NOT NULL,
proveedor INT NOT NULL,
fechaPedido DATE NOT NULL,
FOREIGN KEY (proveedor) REFERENCES PROVEEDOR (ID_Proveedor));





CREATE TABLE REESTOCK(
pedido INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
fechaEntrega DATE NOT NULL,
precioxUnidad DECIMAL(10,2) NOT NULL,
CantPagar DECIMAL(10,2) NOT NULL);



CREATE TABLE EMPLEADO(
numEmp INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nomb_emp CHAR(30) NOT NULL,
contra VARCHAR(15) NOT NULL,
direcc VARCHAR(30) NOT NULL,
num BIGINT);






-- Población de la tabla MANGAS
INSERT INTO MANGAS (titulo, genero, autorManga, precioCompra, precioVenta, numTom, dibujante, numEjemplares) VALUES
('Naruto', 'Shonen', 'Masashi Kishimoto', 50.00, 75.00, 72, 'Masashi Kishimoto', 200),
('One Piece', 'Shonen', 'Eiichiro Oda', 55.00, 80.00, 100, 'Eiichiro Oda', 300),
('Attack on Titan', 'Action', 'Hajime Isayama', 60.00, 90.00, 34, 'Hajime Isayama', 150),
('Death Note', 'Thriller', 'Tsugumi Ohba', 45.00, 70.00, 12, 'Takeshi Obata', 100),
('Dragon Ball', 'Action', 'Akira Toriyama', 40.00, 65.00, 42, 'Akira Toriyama', 250),
('Bleach', 'Action', 'Tite Kubo', 48.00, 72.00, 74, 'Tite Kubo', 180),
('Demon Slayer', 'Shonen', 'Koyoharu Gotouge', 50.00, 75.00, 23, 'Koyoharu Gotouge', 220),
('Tokyo Ghoul', 'Seinen', 'Sui Ishida', 52.00, 78.00, 14, 'Sui Ishida', 140),
('Fullmetal Alchemist', 'Shonen', 'Hiromu Arakawa', 58.00, 87.00, 27, 'Hiromu Arakawa', 170),
('Hunter x Hunter', 'Adventure', 'Yoshihiro Togashi', 62.00, 90.00, 36, 'Yoshihiro Togashi', 200),
('Fairy Tail', 'Fantasy', 'Hiro Mashima', 50.00, 75.00, 63, 'Hiro Mashima', 120),
('My Hero Academia', 'Shonen', 'Kohei Horikoshi', 55.00, 80.00, 40, 'Kohei Horikoshi', 210),
('Berserk', 'Seinen', 'Kentaro Miura', 65.00, 95.00, 41, 'Kentaro Miura', 110),
('Black Clover', 'Fantasy', 'Yuki Tabata', 53.00, 77.00, 33, 'Yuki Tabata', 190),
('Chainsaw Man', 'Horror', 'Tatsuki Fujimoto', 50.00, 75.00, 11, 'Tatsuki Fujimoto', 160);





-- Población de la tabla NOVELAS
INSERT INTO NOVELAS (titulo, genero, autor, precioCompra, precioVenta, tipoNovela, numVol, numEjemplares) VALUES
('Dune', 'Sci-Fi', 'Frank Herbert', 80.00, 120.00, 'Novela Larga', 1, 100),
('El Señor de los Anillos', 'Fantasy', 'J.R.R. Tolkien', 95.00, 150.00, 'Saga', 3, 80),
('Juego de Tronos', 'Fantasy', 'George R.R. Martin', 85.00, 130.00, 'Saga', 5, 70),
('1984', 'Dystopia', 'George Orwell', 50.00, 75.00, 'Novela Larga', 1, 200),
('El Alquimista', 'Inspirational', 'Paulo Coelho', 40.00, 60.00, 'Novela Corta', 1, 300),
('Crónica de una Muerte Anunciada', 'Drama', 'Gabriel García Márquez', 45.00, 70.00, 'Novela Corta', 1, 150),
('Harry Potter', 'Fantasy', 'J.K. Rowling', 60.00, 90.00, 'Saga', 7, 400),
('Orgullo y Prejuicio', 'Romance', 'Jane Austen', 55.00, 80.00, 'Novela Larga', 1, 100),
('Cien Años de Soledad', 'Magical Realism', 'Gabriel García Márquez', 70.00, 105.00, 'Novela Larga', 1, 90),
('Drácula', 'Horror', 'Bram Stoker', 50.00, 75.00, 'Novela Larga', 1, 120),
('La Metamorfosis', 'Absurdism', 'Franz Kafka', 40.00, 60.00, 'Novela Corta', 1, 180),
('Don Quijote', 'Classic', 'Miguel de Cervantes', 100.00, 150.00, 'Novela Larga', 2, 70),
('Los Miserables', 'Drama', 'Victor Hugo', 90.00, 135.00, 'Novela Larga', 1, 60),
('Sherlock Holmes', 'Mystery', 'Arthur Conan Doyle', 65.00, 95.00, 'Saga', 4, 110),
('El Principito', 'Children', 'Antoine de Saint-Exupéry', 35.00, 50.00, 'Novela Corta', 1, 500);





-- Población de la tabla METODOPAGO
INSERT INTO METODOPAGO (ID_Met_Pag, formaPago) VALUES
(1, 'Efectivo'),
(2, 'Tarjeta de Crédito'),
(3, 'Tarjeta de Débito'),
(4, 'Transferencia Bancaria'),
(5, 'PayPal'),
(6, 'Bitcoin'),
(7, 'Cheque'),
(8, 'Tarjeta de Regalo'),
(9, 'Pago Contra Entrega'),
(10, 'Apple Pay'),
(11, 'Google Pay'),
(12, 'Stripe'),
(13, 'Crédito Empresarial'),
(14, 'Depósito Bancario'),
(15, 'Dinero Móvil');





-- Población de la tabla VENTA
INSERT INTO VENTA (formaPago, fec) VALUES
(1, '2023-12-01 10:30:00'),
(2, '2023-12-02 14:00:00'),
(3, '2023-12-03 18:45:00'),
(4, '2023-12-04 11:15:00'),
(5, '2023-12-05 16:20:00'),
(6, '2023-12-06 13:00:00'),
(7, '2023-12-07 19:30:00'),
(8, '2023-12-08 09:10:00'),
(9, '2023-12-09 20:45:00'),
(10, '2023-12-10 15:00:00'),
(11, '2023-12-11 17:30:00'),
(12, '2023-12-12 12:00:00'),
(13, '2023-12-13 08:45:00'),
(14, '2023-12-14 14:15:00'),
(15, '2023-12-15 10:10:00');






-- Población de la tabla PROVEEDOR
INSERT INTO PROVEEDOR (ID_Proveedor, nombreEmpresa, nombreContacto, telContacto, titulosPedir) VALUES
(1, 'MangaHouse', 'Carlos Sánchez', 5512345678, 'Naruto, One Piece, Bleach'),
(2, 'NovelPlanet', 'María López', 5523456789, 'Dune, Juego de Tronos, 1984'),
(3, 'OtakuStore', 'Jorge Ramírez', 5534567890, 'Dragon Ball, Fairy Tail, Hunter x Hunter'),
(4, 'Books&More', 'Ana García', 5545678901, 'El Alquimista, Orgullo y Prejuicio, Don Quijote'),
(5, 'AnimeBooks', 'Lucía Fernández', 5556789012, 'Berserk, Chainsaw Man, Tokyo Ghoul'),
(6, 'EditorialG', 'Pedro Pérez', 5567890123, 'Cien Años de Soledad, Drácula, Sherlock Holmes'),
(7, 'KyoBooks', 'Raúl Torres', 5578901234, 'Black Clover, My Hero Academia, Death Note'),
(8, 'MangaWorld', 'Elena Ruiz', 5589012345, 'Fullmetal Alchemist, Demon Slayer, Attack on Titan'),
(9, 'LiteratureCo', 'Sofía Gómez', 5590123456, 'Los Miserables, Crónica de una Muerte Anunciada, El Principito'),
(10, 'BestReads', 'Andrés Silva', 5501234567, 'La Metamorfosis, Harry Potter, Dune'),
(11, 'FantasyBooks', 'Gabriela Ortega', 5512345678, 'El Señor de los Anillos, Juego de Tronos, Drácula'),
(12, 'NovelaTop', 'Luis Martínez', 5523456789, 'Cien Años de Soledad, Don Quijote, Orgullo y Prejuicio'),
(13, 'OtakuStyle', 'Verónica Peña', 5534567890, 'Naruto, One Piece, Death Note'),
(14, 'WorldManga', 'Ricardo Ríos', 5545678901, 'Dragon Ball, Bleach, Fairy Tail'),
(15, 'LibrosAnime', 'Paula Vega', 5556789012, 'Attack on Titan, Berserk, Black Clover');


INSERT INTO EMPLEADO (nomb_emp, contra, direcc, num) VALUES
('Juan Pérez', 'abc123', 'Av. Principal 123', 5551234567),
('Ana Gómez', 'password1', 'Calle Secundaria 8', 5559876543),
('Luis Torres', 'contra456', 'Av. Central 45', 5557654321),
('Carlos Ruiz', 'panini2023', 'Boulevard 12', 5553216548),
('María López', 'securepass', 'Callejón 67', 5559871123),
('Elena García', 'manga2023', 'Carrera 8', 5555632147),
('Roberto Díaz', 'admin123', 'Camino Real 10', 5554321678),
('Laura Castillo', 'miContra7', 'Avenida 13', 5556789432),
('Pedro Fernández', 'libros10', 'Ruta 23', 5553492785),
('Clara Martínez', 'manga2020', 'Pasaje 4', 5551239874),
('Tomás Ramírez', '1234abcd', 'Plaza 12', 5558765432),
('Valeria Vega', 'panini45', 'Callejón Azul', 5554321897),
('Mateo Herrera', 'clave321', 'Av. Roja 9', 5553948271),
('Carolina Reyes', 'segura456', 'Diagonal Norte 2', 5552148390),
('Javier Torres', 'contra111', 'Calle Grande 56', 5559837421);





