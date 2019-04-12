-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2019 at 04:27 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_reservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `email` varchar(30) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `pass` varchar(12) DEFAULT NULL,
  `nomor_telepon` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`email`, `nama`, `pass`, `nomor_telepon`) VALUES
('azhar@gmail.com', 'azhar', '123', '08989778444'),
('test123@gmail.com', 'test', '123', '081281234422');

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id_kamar` varchar(7) NOT NULL,
  `tipe_kamar` varchar(15) DEFAULT NULL,
  `tarif` varchar(20) DEFAULT NULL,
  `status_ruangan` tinyint(1) DEFAULT NULL,
  `kode_receptionist` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`id_kamar`, `tipe_kamar`, `tarif`, `status_ruangan`, `kode_receptionist`) VALUES
('D02', 'deluxe', '510000', 0, 'KZR'),
('D03', 'deluxe', '510000', 0, 'KZR'),
('D21', 'deluxe', '520000', 1, 'KZR'),
('D22', 'deluxe', '520000', 1, 'KZR'),
('S10', 'standard', '250000', 0, 'KZR'),
('S11', 'standard', '250000', 0, 'KZR'),
('S12', 'standard', '250000', 0, 'KZR'),
('S13', 'standard', '215000', 1, 'KZR'),
('S14', 'standard', '217000', 1, 'KZR');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(7) NOT NULL,
  `tanggal_pembayaran` date DEFAULT NULL,
  `sub_total` int(11) DEFAULT NULL,
  `total_tarif` int(11) DEFAULT NULL,
  `id_pesanan` int(12) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(12) NOT NULL,
  `id_kamar` varchar(7) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `lama_nginap` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `id_kamar`, `email`, `lama_nginap`) VALUES
(1, 'S11', 'test123@gmail.com', 4),
(2, 'D22', 'test123@gmail.com', 5),
(3, 'D02', 'test123@gmail.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `kode_receptionist` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`kode_receptionist`) VALUES
('KZR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id_kamar`),
  ADD KEY `kode_receptionist` (`kode_receptionist`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `id_pesanan` (`id_pesanan`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesanan`),
  ADD KEY `id_kamar` (`id_kamar`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`kode_receptionist`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kamar`
--
ALTER TABLE `kamar`
  ADD CONSTRAINT `kamar_ibfk_1` FOREIGN KEY (`kode_receptionist`) REFERENCES `receptionist` (`kode_receptionist`),
  ADD CONSTRAINT `kamar_ibfk_2` FOREIGN KEY (`kode_receptionist`) REFERENCES `receptionist` (`kode_receptionist`) ON DELETE CASCADE;

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`),
  ADD CONSTRAINT `pembayaran_ibfk_2` FOREIGN KEY (`email`) REFERENCES `customer` (`email`);

--
-- Constraints for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD CONSTRAINT `pesanan_ibfk_1` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`id_kamar`),
  ADD CONSTRAINT `pesanan_ibfk_2` FOREIGN KEY (`email`) REFERENCES `customer` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
