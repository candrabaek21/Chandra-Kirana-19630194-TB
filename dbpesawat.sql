-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jan 2022 pada 05.51
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbpesawat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datajadwalpenerbangan`
--

CREATE TABLE `datajadwalpenerbangan` (
  `maskapai` varchar(50) NOT NULL,
  `nopenerbangan` varchar(50) NOT NULL,
  `waktu` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `bagasi` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `ekonomi` int(50) NOT NULL,
  `bisnis` int(50) NOT NULL,
  `firstclass` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datajadwalpenerbangan`
--

INSERT INTO `datajadwalpenerbangan` (`maskapai`, `nopenerbangan`, `waktu`, `tujuan`, `bagasi`, `keterangan`, `ekonomi`, `bisnis`, `firstclass`) VALUES
('Citilink', 'JT 610', '13:20,27 Desember', 'Jakarta - Banjarmasin', '06', 'Mendarat', 799200, 2032200, 5100200),
('Lion Air', 'JT 610', '13:20,27 Desember', 'Jakarta - Banjarmasin', '06', 'Berangkat', 799200, 2032200, 5100200);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`, `level`) VALUES
('candra', '123456', 'admin'),
('lana', '11111', 'pengguna'),
('candra', '123456', 'admin'),
('lana', '11111', 'pengguna');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penumpang`
--

CREATE TABLE `penumpang` (
  `namapenumpang` varchar(50) NOT NULL,
  `nik` varchar(50) NOT NULL,
  `warganegara` varchar(50) NOT NULL,
  `jk` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telepon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penumpang`
--

INSERT INTO `penumpang` (`namapenumpang`, `nik`, `warganegara`, `jk`, `alamat`, `telepon`) VALUES
('Agatha Putri', '620101010101010', 'Indonesia', 'Perempuan', 'Danau Panggang', '082252292903'),
('Chandra Kirana', '620101010', 'Indonesia', 'Laki-Laki', 'Banjarmasin', '085753925783');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiket`
--

CREATE TABLE `tiket` (
  `nama` varchar(50) NOT NULL,
  `nik` varchar(50) NOT NULL,
  `nama_maskapai` varchar(50) NOT NULL,
  `no_penerbangan` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggal_keberangkatan` varchar(50) NOT NULL,
  `jam_keberangkatan` varchar(50) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `harga` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tiket`
--

INSERT INTO `tiket` (`nama`, `nik`, `nama_maskapai`, `no_penerbangan`, `tujuan`, `tanggal_keberangkatan`, `jam_keberangkatan`, `kelas`, `harga`) VALUES
('Candra', '12345', 'Lion Air', 'JT 610', 'Jakarta - Banjarmasin', 'Dec 31,2021', '13:20', 'Ekonomi', 200000),
('Armand Maulana', '620303030303030', 'Lion Air', 'JT 610', 'Banjarmasin - Jakarta', 'Jan 4,2022', '16:10', 'First Class', 5000000),
('Chandra', '6201010101', 'Lion Air', 'JT 610', 'Banjarmasin - Jakarta', 'Jan 8,2022', '16:10', 'Ekonomi', 2000000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
