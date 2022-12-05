/*
Navicat MySQL Data Transfer

Source Server         : Zoey
Source Server Version : 100408
Source Host           : localhost:3306
Source Database       : perpustakaan_sma

Target Server Type    : MYSQL
Target Server Version : 100408
File Encoding         : 65001

Date: 2022-12-05 00:45:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for anggota
-- ----------------------------
DROP TABLE IF EXISTS `anggota`;
CREATE TABLE `anggota` (
  `id_anggota` int(20) NOT NULL,
  `nama` char(20) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of anggota
-- ----------------------------

-- ----------------------------
-- Table structure for buku
-- ----------------------------
DROP TABLE IF EXISTS `buku`;
CREATE TABLE `buku` (
  `id_buku` int(20) NOT NULL AUTO_INCREMENT,
  `judul_buku` varchar(20) NOT NULL,
  `kategori_buku` varchar(20) NOT NULL,
  `penerbit_buku` varchar(20) NOT NULL,
  `pengarang_buku` varchar(20) NOT NULL,
  `tahun_buku` date NOT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of buku
-- ----------------------------

-- ----------------------------
-- Table structure for peminjaman
-- ----------------------------
DROP TABLE IF EXISTS `peminjaman`;
CREATE TABLE `peminjaman` (
  `id_peminjaman` varchar(20) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  PRIMARY KEY (`id_peminjaman`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of peminjaman
-- ----------------------------

-- ----------------------------
-- Table structure for petugas
-- ----------------------------
DROP TABLE IF EXISTS `petugas`;
CREATE TABLE `petugas` (
  `no_petugas` int(20) NOT NULL AUTO_INCREMENT,
  `nama` char(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`no_petugas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of petugas
-- ----------------------------
