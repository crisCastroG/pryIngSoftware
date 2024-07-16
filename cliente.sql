-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-07-2024 a las 06:18:31
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bicicletadb`
--

-- --------------------------------------------------------

--
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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

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