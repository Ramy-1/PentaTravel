-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 21, 2022 at 07:10 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pentatravel`
--

-- --------------------------------------------------------

--
-- Table structure for table `agence`
--

DROP TABLE IF EXISTS `agence`;
CREATE TABLE IF NOT EXISTS `agence` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_prop` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `numero` int(11) NOT NULL,
  `nb_etoile` int(11) NOT NULL,
  `address` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `agence`
--

INSERT INTO `agence` (`id`, `id_prop`, `nom`, `numero`, `nb_etoile`, `address`) VALUES
(1, 1, 'hana', 27000123, 5, 'tunis'),
(2, 1, 'taha', 27000123, 5, 'esprit');

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
CREATE TABLE IF NOT EXISTS `hotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_responsable` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `address` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `nb_etoile` int(11) NOT NULL,
  `phone` int(11) NOT NULL,
  `capacite` int(11) NOT NULL,
  `disponibilite` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`id`, `id_responsable`, `nom`, `address`, `type`, `nb_etoile`, `phone`, `capacite`, `disponibilite`) VALUES
(1, 1, 'ahmed', 'beja', 'Hotel', 4, 20888999, 500, 1),
(4, 1, 'ahmed', 'beja', 'Hotel', 4, 20888999, 500, 1),
(5, 1, 'ahmed', 'beja', 'Hotel', 4, 20888999, 500, 1);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(20) NOT NULL,
  `id_hotel` int(20) NOT NULL,
  `prix` int(8) NOT NULL,
  `entree` date NOT NULL,
  `sortie` date NOT NULL,
  `num_chambre` int(5) NOT NULL,
  `description` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id`, `id_user`, `id_hotel`, `prix`, `entree`, `sortie`, `num_chambre`, `description`) VALUES
(1, 1, 1, 600, '3921-03-05', '3921-03-15', 69, 'haja bahiya'),
(5, 2, 333, 77, '2021-03-05', '2021-03-15', 77, 'nour '),
(3, 1, 1, 600, '2021-03-05', '2021-03-15', 69, 'haja bahiya'),
(4, 1, 1, 600, '2021-03-05', '2021-03-15', 69, 'haja bahiya'),
(6, 1, 1, 600, '2021-03-05', '2021-03-15', 69, 'haja bahiya');

-- --------------------------------------------------------

--
-- Table structure for table `vol`
--

DROP TABLE IF EXISTS `vol`;
CREATE TABLE IF NOT EXISTS `vol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `company` varchar(20) NOT NULL,
  `depart` varchar(20) NOT NULL,
  `destination` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `prix` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vol`
--

INSERT INTO `vol` (`id`, `id_user`, `company`, `depart`, `destination`, `date`, `prix`) VALUES
(1, 1, 'tttt', 'aaaa', 'PRS', '2020-03-08', 850),
(2, 1, 'tunisair', 'TUN', 'PRS', '2020-03-08', 850);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
