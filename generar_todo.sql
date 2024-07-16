-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `correo` varchar(20) NOT NULL,
  `nombre_cli` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`correo`);

CREATE TABLE `oferta` (
  `codigo` int(6) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(1000) NOT NULL,
  `fecha_term` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `oferta`
--
ALTER TABLE `oferta`
  MODIFY `codigo` int(6) NOT NULL AUTO_INCREMENT;


CREATE TABLE `producto` (
  `nro_producto` int(100) NOT NULL,
  `nomb_producto` varchar(20) NOT NULL,
  `precio` int(10) NOT NULL,
  `descripcion` varchar(500) NOT NULL,
  `stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`nro_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `nro_producto` int(100) NOT NULL AUTO_INCREMENT;
COMMIT;

INSERT INTO producto VALUES (1, 'Casco de bicicleta', 45.99, 'Casco de seguridad para ciclismo', 7);
INSERT INTO producto VALUES (2, 'Guantes de ciclismo', 20.00, 'Guantes con gel para ciclistas', 2);
INSERT INTO producto VALUES (3, 'Luz delantera LED', 15.50, 'Luz delantera LED recargable', 8);
INSERT INTO producto VALUES (4, 'Luz trasera LED', 10.75, 'Luz trasera LED recargable', 3);
INSERT INTO producto VALUES (5, 'Bidón de agua', 8.00, 'Botella de agua para bicicleta', 6);
INSERT INTO producto VALUES (6, 'Portabidón', 12.30, 'Portabidón de aluminio', 4);
INSERT INTO producto VALUES (7, 'Cadena de bicicleta', 25.00, 'Cadena de alta resistencia', 9);
INSERT INTO producto VALUES (8, 'Cámara de aire', 7.25, 'Cámara de aire para ruedas de 700c', 1);
INSERT INTO producto VALUES (9, 'Kit de parches', 5.00, 'Kit de parches autoadhesivos', 5);
INSERT INTO producto VALUES (10, 'Multiherramienta', 19.99, 'Herramienta multiusos para bicicletas', 0);
INSERT INTO producto VALUES (11, 'Bomba de aire portátil', 17.50, 'Bomba de aire compacta y portátil', 6);
INSERT INTO producto VALUES (12, 'Pedales antideslizantes', 30.00, 'Pedales de aluminio antideslizantes', 3);
INSERT INTO producto VALUES (13, 'Espejo retrovisor', 10.00, 'Espejo retrovisor para manillar', 4);
INSERT INTO producto VALUES (14, 'Cuentakilómetros', 22.99, 'Cuentakilómetros inalámbrico', 7);
INSERT INTO producto VALUES (15, 'Guardabarros', 14.50, 'Juego de guardabarros delantero y trasero', 2);
INSERT INTO producto VALUES (16, 'Cerradura de cable', 18.75, 'Cerradura de cable con combinación', 8);
INSERT INTO producto VALUES (17, 'Soporte para móvil', 16.99, 'Soporte universal para teléfono', 9);
INSERT INTO producto VALUES (18, 'Bolsa para sillín', 25.50, 'Bolsa para herramientas bajo el sillín', 1);
INSERT INTO producto VALUES (19, 'Pedales de clip', 55.00, 'Pedales de clip para ciclismo de carretera', 0);
INSERT INTO producto VALUES (20, 'Cinta de manillar', 12.99, 'Cinta de manillar antideslizante', 5);
INSERT INTO producto VALUES (21, 'Gafas de ciclismo', 35.00, 'Gafas con protección UV', 3);
INSERT INTO producto VALUES (22, 'Rodillo de entrenamiento', 150.00, 'Rodillo de entrenamiento para interior', 2);
INSERT INTO producto VALUES (23, 'Cubierta antipinchazos', 29.99, 'Cubierta para rueda antipinchazos', 6);
INSERT INTO producto VALUES (24, 'Portaequipajes', 45.50, 'Portaequipajes trasero de aluminio', 7);
INSERT INTO producto VALUES (25, 'Zapatillas de ciclismo', 80.00, 'Zapatillas con suela rígida para pedales de clip', 4);
INSERT INTO producto VALUES (26, 'Cinta reflectante', 5.50, 'Cinta adhesiva reflectante', 9);
INSERT INTO producto VALUES (27, 'Cubrezapatos', 22.00, 'Cubrezapatos impermeables', 1);
INSERT INTO producto VALUES (28, 'Portabicicletas', 100.00, 'Portabicicletas para coche', 3);
INSERT INTO producto VALUES (29, 'GPS para bicicleta', 150.00, 'Dispositivo GPS específico para ciclismo', 8);
INSERT INTO producto VALUES (30, 'Chaleco reflectante', 18.99, 'Chaleco de alta visibilidad', 6);
INSERT INTO producto VALUES (31, 'Mochila de hidratación', 45.00, 'Mochila con bolsa de agua integrada', 0);
INSERT INTO producto VALUES (32, 'Juego de luces', 25.00, 'Set de luces delantera y trasera', 5);
INSERT INTO producto VALUES (33, 'Funda para bicicleta', 30.00, 'Funda impermeable para bicicleta', 2);
INSERT INTO producto VALUES (34, 'Casco aero', 90.00, 'Casco aerodinámico para ciclismo de carretera', 7);
INSERT INTO producto VALUES (35, 'Soporte para bicicleta', 20.00, 'Soporte para almacenamiento de bicicletas', 1);
INSERT INTO producto VALUES (36, 'Guardabarros de carbono', 50.00, 'Guardabarros de carbono ultraligero', 0);
INSERT INTO producto VALUES (37, 'Bidón isotérmico', 20.00, 'Botella de agua isotérmica', 3);
INSERT INTO producto VALUES (38, 'Asiento ergonómico', 45.00, 'Asiento ergonómico para mayor comodidad', 9);
INSERT INTO producto VALUES (39, 'Cadena antirrobo', 30.00, 'Cadena antirrobo de alta seguridad', 4);
INSERT INTO producto VALUES (40, 'Juego de cables', 12.00, 'Juego de cables de freno y cambio', 6);
INSERT INTO producto VALUES (41, 'Llave dinamométrica', 75.00, 'Llave para ajustar con precisión', 7);
INSERT INTO producto VALUES (42, 'Faro delantero', 40.00, 'Faro delantero de alta potencia', 2);
INSERT INTO producto VALUES (43, 'Kit de limpieza', 20.00, 'Kit completo para limpieza de bicicleta', 8);
INSERT INTO producto VALUES (44, 'Neumáticos de montaña', 35.00, 'Neumáticos para bicicleta de montaña', 9);
INSERT INTO producto VALUES (45, 'Kit de primeros auxilios', 15.00, 'Kit de primeros auxilios compacto', 3);
INSERT INTO producto VALUES (46, 'Pedales automáticos', 60.00, 'Pedales automáticos para ciclismo de montaña', 4);
INSERT INTO producto VALUES (47, 'Camisa de ciclismo', 30.00, 'Camisa de ciclismo de manga larga', 0);
INSERT INTO producto VALUES (48, 'Casco infantil', 25.00, 'Casco de ciclismo para niños', 5);
INSERT INTO producto VALUES (49, 'Bolsa de manillar', 35.00, 'Bolsa para manillar de gran capacidad', 1);
INSERT INTO producto VALUES (50, 'Protector de cuadro', 12.00, 'Protector adhesivo para el cuadro', 6);

INSERT INTO cliente (correo, nombre_cli) VALUES
('juan.perez@example.com', 'Juan Perez'),
('maria.lopez@example.com', 'Maria Lopez'),
('carlos.gomez@example.com', 'Carlos Gomez'),
('ana.martinez@example.com', 'Ana Martinez'),
('luis.rodriguez@example.com', 'Luis Rodriguez'),
('laura.fernandez@example.com', 'Laura Fernandez'),
('jose.garcia@example.com', 'Jose Garcia'),
('carmen.sanchez@example.com', 'Carmen Sanchez'),
('miguel.ramos@example.com', 'Miguel Ramos'),
('patricia.moreno@example.com', 'Patricia Moreno'),
('francisco.ruiz@example.com', 'Francisco Ruiz'),
('alicia.silva@example.com', 'Alicia Silva'),
('roberto.torres@example.com', 'Roberto Torres'),
('julia.diaz@example.com', 'Julia Diaz'),
('fernando.mendez@example.com', 'Fernando Mendez'),
('andrea.rivera@example.com', 'Andrea Rivera'),
('pablo.vargas@example.com', 'Pablo Vargas'),
('sofia.molina@example.com', 'Sofia Molina'),
('ricardo.castro@example.com', 'Ricardo Castro'),
('laura.soto@example.com', 'Laura Soto'),
('daniel.ortega@example.com', 'Daniel Ortega'),
('sara.delgado@example.com', 'Sara Delgado'),
('manuel.gil@example.com', 'Manuel Gil'),
('irene.ramos@example.com', 'Irene Ramos'),
('jorge.romero@example.com', 'Jorge Romero'),
('natalia.martin@example.com', 'Natalia Martin'),
('sergio.herrera@example.com', 'Sergio Herrera'),
('claudia.flores@example.com', 'Claudia Flores'),
('adrian.diaz@example.com', 'Adrian Diaz'),
('diana.martinez@example.com', 'Diana Martinez');
