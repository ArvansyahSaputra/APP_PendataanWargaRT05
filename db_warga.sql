-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jan 2026 pada 07.35
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_warga`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datawarga`
--

CREATE TABLE `datawarga` (
  `nik` varchar(16) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jk` enum('Laki-laki','Perempuan') NOT NULL,
  `tl` varchar(100) DEFAULT NULL,
  `tg` date DEFAULT NULL,
  `noTlp` varchar(20) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `kwg` varchar(50) DEFAULT 'Indonesia',
  `pendidikan` varchar(100) DEFAULT NULL,
  `pekerjaan` varchar(100) DEFAULT NULL,
  `agama` varchar(50) DEFAULT NULL,
  `statusW` varchar(50) DEFAULT NULL,
  `tglMasuk` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `datawarga`
--

INSERT INTO `datawarga` (`nik`, `nama`, `jk`, `tl`, `tg`, `noTlp`, `alamat`, `kwg`, `pendidikan`, `pekerjaan`, `agama`, `statusW`, `tglMasuk`) VALUES
('3175070308610005', 'Agus Pramono', 'Laki-laki', 'Jombang', '1961-08-03', '081311110005', 'Jl. Mangga No. 67', 'Indonesia', 'D4', 'Wartawan', 'Islam', 'Aktif', '2025-12-28'),
('3175076104530005', 'Ita Kusumiranti', 'Perempuan', 'Jakarta', '1959-04-21', '081311110006', 'Jl. Mangga No. 67', 'Indonesia', 'D4', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-28'),
('3671110305740003', 'Retno Restianingsih', 'Perempuan', 'Jakarta', '2025-12-24', '085628722744', 'JL.Manggis Raya No 59', 'Indonesia', 'SMA/SMK', 'Ibu Rumah Tangga', 'Islam', 'Kawin', '2025-12-24'),
('3671110306640004', 'Purwono', 'Laki-laki', 'Bogor', '2025-12-24', '081398718054', 'JL.Manggis Raya No 59', 'Indonesia', 'SMA/SMK', 'Karyawan Swasta', 'Islam', 'Kawin', '2025-12-24'),
('3671110511650002', 'Haryono', 'Laki-laki', 'Jakarta', '1965-11-05', '081311110018', 'Jl. Manggis II No. 88A', 'Indonesia', 'SMA/SMK', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671110608870001', 'Abdul Muslim Fadli', 'Laki-laki', 'Jakarta', '1987-08-06', '081311110021', 'Jl. Manggis Raya No. 55', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671110908430001', 'Koesmono Rekky', 'Laki-laki', 'Cilacap', '2025-12-24', '089503949998', 'Jl.Manggis Raya No 59', 'Indonesia', 'D3', 'Pensiunan', 'Islam', 'Kawin', '2025-12-24'),
('3671111011520007', 'Yanto', 'Laki-laki', 'Tangerang', '1952-11-10', '081311110011', 'Jl. Mangga No. 95', 'Indonesia', 'SMA/SMK', 'Wiraswasta', 'Islam', 'Aktif', '2025-12-28'),
('3671111091300007', 'Faqieh Rekky Pratama', 'Laki-laki', 'Depok', '2013-09-11', '081234567807', 'Jl. Mangga No. 92', 'Indonesia', 'SMP', 'Pelajar', 'Islam', 'Aktif', '2025-12-25'),
('3671111104880004', 'Ertanto Aditomo', 'Laki-laki', 'Tangerang', '2025-12-24', '09876899973', 'Jl.Manggis IV No 78', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Belum Kawin', '2025-12-24'),
('3671111201030004', 'Hasyid Abiy Husainy', 'Laki-laki', 'Jakarta', '2025-12-24', '085156276215', 'JL.Manggis Raya No 59', 'Indonesia', 'S1', 'Mahasiswa', 'Islam', 'Belum Kawin', '2025-12-24'),
('3671111701530001', 'Sutrisno Budi', 'Laki-laki', 'Kebumen', '2025-12-24', '098767899987', 'Jl.Manggis IV No 78', 'Indonesia', 'SMA/SMK', 'Pensiunan', 'Islam', 'Cerai Mati', '2025-12-24'),
('3671112050500004', 'Muhammad Aidil Umar', 'Laki-laki', 'Tangerang', '2005-05-12', '081234567803', 'Jl. Mangga No. 92', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-25'),
('367111210200002', 'Alfarizq Zayn Kafabillah', 'Laki-laki', 'Tangerang', '2020-10-21', '081311110025', 'Jl. Manggis Raya No. 55', 'Indonesia', 'Belum Sekolah', 'Belum Sekolah', 'Islam', 'Aktif', '2025-12-28'),
('3671112102970003', 'Bagus Dwi Restiono', 'Laki-laki', 'Jakarta', '2025-12-24', '089514382972', 'JL.Manggis Raya No 59', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Kawin', '2025-12-24'),
('3671112104680003', 'Aprilsya Pasmah WP', 'Laki-laki', 'Jakarta', '1968-04-21', '081311110014', 'Jl. Mangga No. 63', 'Indonesia', 'D3', 'Wiraswasta', 'Islam', 'Aktif', '2025-12-28'),
('367111210700003', 'Praditya Bayu Triono', 'Laki-laki', 'Jakarta', '2025-12-24', '089509972379', 'JL.Manggis Raya No 59', 'Indonesia', 'S1', 'Ibu Rumah Tangga', 'Islam', 'Belum Kawin', '2025-12-24'),
('3671112510750002', 'Nunspiet Fitira Ady', 'Laki-laki', 'Jakarta', '1975-10-25', '081234567801', 'Jl. Mangga No. 92', 'Indonesia', 'D4', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-25'),
('3671112906830002', 'Agiel Poncho Handoko', 'Laki-laki', 'Jakarta', '1983-06-29', '081234567805', 'Jl. Mangga No. 92', 'Indonesia', 'D4', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-25'),
('3671112907530001', 'Sutardjo Wahyu Susilo', 'Laki-laki', 'Mojokerto', '1953-07-29', '081311110003', 'Jl. Mangga No. 60', 'Indonesia', 'S2', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671113003140001', 'Athallah Zhafran Raff Syahm', 'Laki-laki', 'Tangerang', '2014-03-30', '081311110023', 'Jl. Manggis Raya No. 55', 'Indonesia', 'SD', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671113009100007', 'Muhammad Nur Rifky', 'Laki-laki', 'Tangerang', '2010-09-30', '081234567804', 'Jl. Mangga No. 92', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-25'),
('3671113009300004', 'Adli Muhammad Azhar', 'Laki-laki', 'Tangerang', '2003-09-30', '081311110017', 'Jl. Manggis II No. 76', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('367111405620002', 'Masruri Abdullah', 'Laki-laki', 'Pati', '1982-05-14', '081311110007', 'Jl. Mangga No. 88', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671114108830003', 'Fitirani Lubis', 'Perempuan', 'Jakarta', '1983-08-01', '081234567806', 'Jl. Mangga No. 92', 'Indonesia', 'SMA/SMK', 'Wiraswasta', 'Islam', 'Aktif', '2025-12-25'),
('3671114205690005', 'Win Rahayu', 'Perempuan', 'Boyolali', '1959-05-02', '081234567808', 'Jl. Mangga No. 66', 'Indonesia', 'SMA/SMK', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-25'),
('3671114206510001', 'Utiek Sukartie', 'Perempuan', 'Solo', '2025-12-24', '098789876677', 'JL.Mangga Blok D', 'Indonesia', 'SMA/SMK', 'Pensiunan', 'Islam', 'Kawin', '2025-12-24'),
('3671114308050006', 'Sabrina Nurul Azizah', 'Perempuan', 'Tangerang', '2025-12-24', '089503942925', 'Jl.Manggis Raya No 59', 'Indonesia', 'SMA/SMK', 'Mahasiswa', 'Islam', 'Belum Kawin', '2025-12-24'),
('3671114408970002', 'Anna Zahrotas Sholihah', 'Perempuan', 'Tangerang', '1997-08-04', '081311110009', 'Jl. Mangga No. 88', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671114505160005', 'Zhafira Hana Althonissa', 'Perempuan', 'Tangerang', '2016-05-05', '081311110024', 'Jl. Manggis Raya No. 55', 'Indonesia', 'SD', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('367111461650003', 'Istiqomah', 'Perempuan', 'Pati', '1985-11-06', '081311110008', 'Jl. Mangga No. 88', 'Indonesia', 'SMA/SMK', 'Guru', 'Islam', 'Aktif', '2025-12-28'),
('3671114702690003', 'Giyanti', 'Perempuan', 'Solo', '1969-02-07', '081311110019', 'Jl. Manggis II No. 88A', 'Indonesia', 'SMA/SMK', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-28'),
('367111471270004', 'Yayuk Sulistiwati', 'Perempuan', 'Jakarta', '1970-12-07', '081311110015', 'Jl. Mangga No. 63', 'Indonesia', 'D3', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671115206990002', 'Olivia Maulita Sugiharto', 'Perempuan', 'Jakarta', '1999-06-12', '081311110001', 'Jl. Mangga No. 66', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671115502600003', 'Frederika Lipilay', 'Perempuan', 'Palembang', '1960-02-15', '081311110004', 'Jl. Mangga No. 60', 'Indonesia', 'D4', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-28'),
('3671115705830003', 'Dhalisah', 'Perempuan', 'Tangerang', '1983-05-17', '081234567802', 'Jl. Mangga No. 92', 'Indonesia', 'SMA/SMK', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-25'),
('3671115708840011', 'Indah PuspitaSari', 'Perempuan', 'Jakarta', '1984-08-17', '081311110022', 'Jl. Manggis Raya No. 55', 'Indonesia', 'S1', 'Karyawan Swasta', 'Islam', 'Aktif', '2025-12-28'),
('3671115803040007', 'Indira Sekar Rahmawati', 'Perempuan', 'Tangerang', '2004-03-18', '081311110002', 'Jl. Mangga No. 66', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671116403000002', 'Gianita Salsabilla', 'Perempuan', 'Tangerang', '2003-03-24', '081311110020', 'Jl. Manggis II No. 88A', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671116708050009', 'Anis Mahlatin', 'Perempuan', 'Tangerang', '2005-08-27', '081311110010', 'Jl. Mangga No. 88', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-28'),
('3671116709950003', 'Septiyani Rahayu Putri Wulandari', 'Perempuan', 'Jakarta', '1995-07-27', '081234567809', 'Jl. Mangga No. 66', 'Indonesia', 'SMA/SMK', 'Pelajar', 'Islam', 'Aktif', '2025-12-25'),
('3671116909720003', 'Listiyani', 'Perempuan', 'Demak', '1972-09-25', '081311110016', 'Jl. Manggis II No. 76', 'Indonesia', 'S1', 'Karyawan BUMN', 'Islam', 'Aktif', '2025-12-28'),
('367111712650009', 'Sumirah', 'Perempuan', 'Tangerang', '1965-12-31', '081311110012', 'Jl. Mangga No. 95', 'Indonesia', 'SMA/SMK', 'Ibu Rumah Tangga', 'Islam', 'Aktif', '2025-12-28'),
('367111902970005', 'Eko Suryo Saputro', 'Laki-laki', 'Semarang', '1997-02-19', '081311110013', 'Jl. Mangga No. 95', 'Indonesia', 'SMA/SMK', 'Buruh Harian Lepas', 'Islam', 'Aktif', '2025-12-28');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_fasilitas`
--

CREATE TABLE `data_fasilitas` (
  `id_fas` int(11) NOT NULL,
  `nama_fas` varchar(100) DEFAULT NULL,
  `jenis_fas` varchar(100) DEFAULT NULL,
  `kondisi_fas` varchar(50) DEFAULT NULL,
  `kapasitas` int(11) DEFAULT NULL,
  `lokasi_fas` varchar(255) DEFAULT NULL,
  `status_fas` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_fasilitas`
--

INSERT INTO `data_fasilitas` (`id_fas`, `nama_fas`, `jenis_fas`, `kondisi_fas`, `kapasitas`, `lokasi_fas`, `status_fas`) VALUES
(1, 'Posyandu', 'Bangunan', 'Baik', 30, 'Jl. Manggis I', 'Aktif'),
(2, 'Masjid Nurul Iman', 'Bangunan', 'Baik', 100, 'Jl. Balita VII', 'Aktif'),
(3, 'Gedung Serbaguna', 'Bangunan', 'Baik', 300, 'Jl. Belimbing', 'Aktif'),
(4, 'Pos Ronda', 'Bangunan', 'Baik', 5, 'Jl. Manggis Raya', 'Aktif'),
(5, 'Kursi', 'Barang', 'Baik', 50, 'Jl. Manggis Raya', 'Aktif'),
(6, 'Tenda', 'Barang', 'Baik', 50, 'Jl. Manggis Raya', 'Aktif'),
(7, 'Sound System', 'Barang', 'Baik', 1, 'Jl. Manggis Raya', 'Aktif'),
(8, 'Motor Viar', 'Kendaraan', 'Baik', 200, 'Jl. Manggis Raya', 'Aktif'),
(9, 'Perkakas', 'Barang', 'Baik', 2, 'Jl. Manggis Raya', 'Aktif'),
(10, 'Umbul-umbul', 'Barang', 'Baik', 20, 'Jl. Manggis Raya', 'Aktif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_kegiatan`
--

CREATE TABLE `data_kegiatan` (
  `id_kegiatan` int(11) NOT NULL,
  `id_pengurus` int(11) DEFAULT NULL,
  `nama_pengurus` varchar(100) DEFAULT NULL,
  `id_fas` int(11) DEFAULT NULL,
  `nama_fas` varchar(100) DEFAULT NULL,
  `nama_kegiatan` varchar(255) DEFAULT NULL,
  `jenis_kegiatan` varchar(100) DEFAULT NULL,
  `tanggal_kegiatan` date DEFAULT NULL,
  `jam` varchar(10) DEFAULT NULL,
  `jumlah_peserta` int(11) DEFAULT NULL,
  `status_k` varchar(50) DEFAULT NULL,
  `Keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_kegiatan`
--

INSERT INTO `data_kegiatan` (`id_kegiatan`, `id_pengurus`, `nama_pengurus`, `id_fas`, `nama_fas`, `nama_kegiatan`, `jenis_kegiatan`, `tanggal_kegiatan`, `jam`, `jumlah_peserta`, `status_k`, `Keterangan`) VALUES
(1, 2, 'Listiyani, S.E', 3, 'Gedung Serbaguna', 'arisan warga', 'silaturahmi', '2025-03-01', '08.00', 30, 'Selesai', '-'),
(2, 1, 'Ir. Purwono', 1, 'Posyandu', 'cek kesehatan', 'kesehatan', '2025-12-03', '08.00', 400, 'Selesai', '-'),
(3, 1, 'Ir. Purwono', 3, 'Gedung Serbaguna', 'pemilu', 'politik', '2024-01-14', '08.00', 400, 'Selesai', '-'),
(4, 1, 'Ir. Purwono', 3, 'Gedung Serbaguna', 'hut Ri 80', 'perayaan', '2025-08-17', '08.00', 300, 'Selesai', '-'),
(5, 1, 'Ir. Purwono', 2, 'Masjid Nurul Iman', 'maulid nabi', 'keagamaan', '2025-09-04', '19.00', 100, 'Selesai', '-'),
(6, 1, 'Ir. Purwono', 1, 'Posyandu', 'cek kesehatan lansia', 'kesehatan', '2025-12-03', '08.00', 100, 'Selesai', '-');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_kematian`
--

CREATE TABLE `data_kematian` (
  `id_kematian` int(11) NOT NULL,
  `nik` varchar(16) DEFAULT NULL,
  `nama_penduduk` varchar(255) DEFAULT NULL,
  `id_fas` int(11) DEFAULT NULL,
  `nama_fas` varchar(100) DEFAULT NULL,
  `tanggal_meninggal` date DEFAULT NULL,
  `waktu_meninggal` varchar(10) DEFAULT NULL,
  `lokasi_pemakaman` text DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_kematian`
--

INSERT INTO `data_kematian` (`id_kematian`, `nik`, `nama_penduduk`, `id_fas`, `nama_fas`, `tanggal_meninggal`, `waktu_meninggal`, `lokasi_pemakaman`, `keterangan`) VALUES
(1, '367111405620002', 'Masruri Abdullah', 2, 'Masjid Nurul Iman', '2024-02-20', '19.00', 'TPU', '-'),
(2, '3671111011520007', 'Yanto', 2, 'Masjid Nurul Iman', '2023-01-19', '09.00', 'TPU', '-'),
(3, '367111712650009', 'Sumirah', 2, 'Masjid Nurul Iman', '2024-06-03', '13.00', 'TPU', '-'),
(4, '3671112104680003', 'Aprilsya Pasmah WP', 2, 'Masjid Nurul Iman', '2025-06-16', '13.00', 'TPU', '-'),
(5, '3671112510750002', 'Nunspiet Fitira Ady', 2, 'Masjid Nurul Iman', '2023-07-02', '18.00', 'TPU', '-');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pengurus`
--

CREATE TABLE `data_pengurus` (
  `id_pengurus` int(11) NOT NULL,
  `nama_pengurus` varchar(100) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `no_hp` varchar(20) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `jabatan` varchar(100) DEFAULT NULL,
  `wilayah_rt` varchar(10) DEFAULT NULL,
  `wilayah_rw` varchar(10) DEFAULT NULL,
  `mulai_menjabat` date DEFAULT NULL,
  `selesai_menjabat` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_pengurus`
--

INSERT INTO `data_pengurus` (`id_pengurus`, `nama_pengurus`, `jenis_kelamin`, `no_hp`, `alamat`, `jabatan`, `wilayah_rt`, `wilayah_rw`, `mulai_menjabat`, `selesai_menjabat`) VALUES
(1, 'Ir. Purwono', 'Laki-laki', '6285883773428', 'Jl. Manggis Raya No. 59', 'Ketua RT', '5', '5', '2025-10-24', '2028-10-24'),
(2, 'Listiyani, S.E', 'Perempuan', '6281213499751', 'Jl. Manggis II No. 76', 'Bendahara', '5', '5', '2025-10-24', '2028-10-24'),
(3, 'Aldianto, S.T', 'Laki-laki', '6282113504773', 'Jl. Manggis Raya No. 49', 'Sekretaris', '5', '5', '2025-10-24', '2028-10-24'),
(4, 'Ir. Purwono', 'Laki-laki', '6285771123984', 'Jl. Manggis Raya No. 59', 'Ketua RT', '5', '5', '2022-09-23', '2025-10-24'),
(5, 'Listiyani, S.E', 'Perempuan', '6281387654129', 'Jl. Manggis II No. 76', 'Bendahara', '5', '5', '2022-09-23', '2025-10-24'),
(6, 'Ocha Lia', 'Perempuan', '6281283475789', 'Jl. Manggis II', 'Sekretaris', '5', '5', '2022-09-23', '2025-10-24'),
(7, 'Kalyubi Hasan', 'Laki-laki', '6285627121201', 'Jl. Manggis Raya', 'Ketua RT', '5', '5', '2019-09-24', '2022-09-23'),
(8, 'Oktaviani', 'Perempuan', '6281357721984', 'Jl. Mangga', 'Bendahara', '5', '5', '2019-09-24', '2022-09-23'),
(9, 'Bakriyanto', 'Laki-laki', '6281198843776', 'Jl. Manggis IV', 'Sekretaris', '5', '5', '2019-09-24', '2022-09-23'),
(10, 'Kalyubi Hasan', 'Laki-laki', '6285719923401', 'Jl. Manggis Raya', 'Ketua RT', '5', '5', '2016-10-23', '2019-09-24'),
(11, 'Oktaviani', 'Perempuan', '6281345519982', 'Jl. Mangga', 'Bendahara', '5', '5', '2016-10-23', '2019-09-24'),
(12, 'Bakriyanto', 'Laki-laki', '6281276643901', 'Jl. Manggis IV', 'Sekretaris', '5', '5', '2016-10-23', '2019-09-24'),
(13, 'Dedi Supriadi', 'Laki-laki', '6281399982341', 'Jl. Manggis IV', 'Ketua RT', '5', '5', '2013-10-23', '2016-10-23'),
(14, 'Sutrisno Budi', 'Laki-laki', '6281211119034', 'Jl. Manggis IV No. 78', 'Bendahara', '5', '5', '2013-10-23', '2016-10-23'),
(15, 'Bakriyanto', 'Laki-laki', '6281387765432', 'Jl. Manggis IV', 'Sekretaris', '5', '5', '2013-10-23', '2016-10-23');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pindah`
--

CREATE TABLE `data_pindah` (
  `id_pindah` int(50) NOT NULL,
  `nik` varchar(16) DEFAULT NULL,
  `nama_penduduk` varchar(100) DEFAULT NULL,
  `id_pengurus` int(11) DEFAULT NULL,
  `nama_pengurus` varchar(100) DEFAULT NULL,
  `tanggal_pindah` date DEFAULT NULL,
  `alamat_tujuan` text DEFAULT NULL,
  `kota_tujuan` varchar(100) DEFAULT NULL,
  `alasan_pindah` varchar(255) DEFAULT NULL,
  `status_pindah` varchar(50) DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_pindah`
--

INSERT INTO `data_pindah` (`id_pindah`, `nik`, `nama_penduduk`, `id_pengurus`, `nama_pengurus`, `tanggal_pindah`, `alamat_tujuan`, `kota_tujuan`, `alasan_pindah`, `status_pindah`, `keterangan`) VALUES
(1, '3671110908430001', 'Koesmono Rekky', 1, 'Ir. Purwono', '2025-12-05', 'Jl.Merdeka Blok D', 'Purwakarta', 'Pekerjaan', 'Diverivikasi', '-'),
(2, '3671110608870001', 'Abdul Muslim Fadli', 1, 'Ir. Purwono', '2024-07-02', 'Jl.Setiabudi', 'Jakarta Utara', 'Pekerjaan', 'Diverivikasi', '-'),
(3, '3671112906830002', 'Agiel Poncho Handoko', 2, 'Listiyani, S.E', '2024-10-28', 'Jalan Raya Ahmad Yani', 'Malang', 'Pekerjaan', 'Diverivikasi', '-'),
(4, '3671113009100007', 'Muhammad Nur Rifky', 1, 'Ir. Purwono', '2022-01-11', '-', 'Jambi', 'Keluarga', 'Diverivikasi', '--');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_wargabaru`
--

CREATE TABLE `data_wargabaru` (
  `id_wargabaru` int(11) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `id_pengurus` int(11) DEFAULT NULL,
  `nama_pengurus` varchar(100) DEFAULT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `alasan_masuk` varchar(255) DEFAULT NULL,
  `asal_daerah` varchar(100) DEFAULT NULL,
  `status_keluarga` varchar(50) DEFAULT NULL,
  `jumlah_keluarga` int(11) DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_wargabaru`
--

INSERT INTO `data_wargabaru` (`id_wargabaru`, `nik`, `nama`, `id_pengurus`, `nama_pengurus`, `tanggal_masuk`, `alasan_masuk`, `asal_daerah`, `status_keluarga`, `jumlah_keluarga`, `keterangan`) VALUES
(1, '367111902970005', 'Eko Suryo Saputro', 1, 'Ir. Purwono', '2025-12-11', 'Pekerjaan', 'Depok', 'Suami ', 1, '-'),
(2, '3671116708050009', 'Anis Mahlatin', 1, 'Ir. Purwono', '2025-12-11', 'keluarga', 'Depok', 'Istri', 1, '--'),
(3, '3671115803040007', 'Indira Sekar Rahmawati', 1, 'Ir. Purwono', '2025-06-06', 'keluarga', 'Aceh', 'Istri', 1, '--'),
(4, '3671112102970003', 'Bagus Dwi Restiono', 1, 'Ir. Purwono', '2025-05-10', 'pekerjaan', 'Bogor', 'Suami ', 1, '--'),
(5, '3671112510750002', 'Nunspiet Fitira Ady', 1, 'Ir. Purwono', '2025-06-03', 'Pekerjaan', 'Medan', 'Suami ', 1, '--');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `datawarga`
--
ALTER TABLE `datawarga`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `data_fasilitas`
--
ALTER TABLE `data_fasilitas`
  ADD PRIMARY KEY (`id_fas`);

--
-- Indeks untuk tabel `data_kegiatan`
--
ALTER TABLE `data_kegiatan`
  ADD PRIMARY KEY (`id_kegiatan`),
  ADD KEY `id_pengurus` (`id_pengurus`),
  ADD KEY `id_fas` (`id_fas`);

--
-- Indeks untuk tabel `data_kematian`
--
ALTER TABLE `data_kematian`
  ADD PRIMARY KEY (`id_kematian`),
  ADD KEY `nik` (`nik`),
  ADD KEY `id_fas` (`id_fas`);

--
-- Indeks untuk tabel `data_pengurus`
--
ALTER TABLE `data_pengurus`
  ADD PRIMARY KEY (`id_pengurus`);

--
-- Indeks untuk tabel `data_pindah`
--
ALTER TABLE `data_pindah`
  ADD PRIMARY KEY (`id_pindah`),
  ADD KEY `nik` (`nik`),
  ADD KEY `id_pengurus` (`id_pengurus`);

--
-- Indeks untuk tabel `data_wargabaru`
--
ALTER TABLE `data_wargabaru`
  ADD PRIMARY KEY (`id_wargabaru`),
  ADD UNIQUE KEY `nik` (`nik`),
  ADD KEY `id_pengurus` (`id_pengurus`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_fasilitas`
--
ALTER TABLE `data_fasilitas`
  MODIFY `id_fas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `data_kegiatan`
--
ALTER TABLE `data_kegiatan`
  MODIFY `id_kegiatan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `data_kematian`
--
ALTER TABLE `data_kematian`
  MODIFY `id_kematian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `data_pengurus`
--
ALTER TABLE `data_pengurus`
  MODIFY `id_pengurus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT untuk tabel `data_pindah`
--
ALTER TABLE `data_pindah`
  MODIFY `id_pindah` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `data_wargabaru`
--
ALTER TABLE `data_wargabaru`
  MODIFY `id_wargabaru` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `data_kegiatan`
--
ALTER TABLE `data_kegiatan`
  ADD CONSTRAINT `data_kegiatan_ibfk_1` FOREIGN KEY (`id_pengurus`) REFERENCES `data_pengurus` (`id_pengurus`),
  ADD CONSTRAINT `data_kegiatan_ibfk_2` FOREIGN KEY (`id_fas`) REFERENCES `data_fasilitas` (`id_fas`);

--
-- Ketidakleluasaan untuk tabel `data_kematian`
--
ALTER TABLE `data_kematian`
  ADD CONSTRAINT `data_kematian_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `datawarga` (`nik`),
  ADD CONSTRAINT `data_kematian_ibfk_2` FOREIGN KEY (`id_fas`) REFERENCES `data_fasilitas` (`id_fas`);

--
-- Ketidakleluasaan untuk tabel `data_pindah`
--
ALTER TABLE `data_pindah`
  ADD CONSTRAINT `data_pindah_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `datawarga` (`nik`),
  ADD CONSTRAINT `data_pindah_ibfk_2` FOREIGN KEY (`id_pengurus`) REFERENCES `data_pengurus` (`id_pengurus`);

--
-- Ketidakleluasaan untuk tabel `data_wargabaru`
--
ALTER TABLE `data_wargabaru`
  ADD CONSTRAINT `data_wargabaru_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `datawarga` (`nik`),
  ADD CONSTRAINT `data_wargabaru_ibfk_2` FOREIGN KEY (`id_pengurus`) REFERENCES `data_pengurus` (`id_pengurus`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
