-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2025 a las 09:06:47
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos_nba`
--

CREATE TABLE `equipos_nba` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `conferencia` varchar(10) NOT NULL CHECK (`conferencia` in ('Este','Oeste'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `equipos_nba`
--


--Conferencia Este:
INSERT INTO `equipos_nba` (`id`, `nombre`, `conferencia`) VALUES
(1, 'Atlanta Hawks', 'Este'),
(2, 'Boston Celtics', 'Este'),
(3, 'Brooklyn Nets', 'Este'),
(4, 'Charlotte Hornets', 'Este'),
(5, 'Chicago Bulls', 'Este'),
(6, 'Cleveland Cavaliers', 'Este'),
(7, 'Detroit Pistons', 'Este'),
(8, 'Indiana Pacers', 'Este'),
(9, 'Miami Heat', 'Este'),
(10, 'Milwaukee Bucks', 'Este'),
(11, 'New York Knicks', 'Este'),
(12, 'Orlando Magic', 'Este'),
(13, 'Philadelphia 76ers', 'Este'),
(14, 'Toronto Raptors', 'Este'),
(15, 'Washington Wizards', 'Este'),

  --Conferencia Oeste:
(16, 'Dallas Mavericks', 'Oeste'),
(17, 'Denver Nuggets', 'Oeste'),
(18, 'Golden State Warriors', 'Oeste'),
(19, 'Houston Rockets', 'Oeste'),
(20, 'LA Clippers', 'Oeste'),
(21, 'Los Angeles Lakers', 'Oeste'),
(22, 'Memphis Grizzlies', 'Oeste'),
(23, 'Minnesota Timberwolves', 'Oeste'),
(24, 'New Orleans Pelicans', 'Oeste'),
(25, 'Oklahoma City Thunder', 'Oeste'),
(26, 'Phoenix Suns', 'Oeste'),
(27, 'Portland Trail Blazers', 'Oeste'),
(28, 'Sacramento Kings', 'Oeste'),
(29, 'San Antonio Spurs', 'Oeste'),
(30, 'Utah Jazz', 'Oeste');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipos_nba`
--
ALTER TABLE `equipos_nba`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipos_nba`
--
ALTER TABLE `equipos_nba`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
