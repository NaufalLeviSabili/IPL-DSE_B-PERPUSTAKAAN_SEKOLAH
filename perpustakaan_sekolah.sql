/*
Navicat MySQL Data Transfer

Source Server         : Zoey
Source Server Version : 100408
Source Host           : localhost:3306
Source Database       : perpustakaan_sekolah

Target Server Type    : MYSQL
Target Server Version : 100408
File Encoding         : 65001

Date: 2023-01-15 21:57:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for anggota_perpus
-- ----------------------------
DROP TABLE IF EXISTS `anggota_perpus`;
CREATE TABLE `anggota_perpus` (
  `id` int(25) NOT NULL AUTO_INCREMENT,
  `nis` varchar(25) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of anggota_perpus
-- ----------------------------
INSERT INTO `anggota_perpus` VALUES ('1', '3411201050', 'Afuza Dwi', 'bandung', '888779914');
INSERT INTO `anggota_perpus` VALUES ('2', '3411201056', 'Diky Fadhillah', 'Baros', '88994455');
INSERT INTO `anggota_perpus` VALUES ('3', '565688', 'Erlangga', 'Garut', '89776644');

-- ----------------------------
-- Table structure for daftar_buku
-- ----------------------------
DROP TABLE IF EXISTS `daftar_buku`;
CREATE TABLE `daftar_buku` (
  `kode_buku` varchar(25) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `penulis` varchar(45) NOT NULL,
  `penerbit` varchar(45) NOT NULL,
  `tahun_terbit` varchar(7) NOT NULL,
  `status` varchar(15) NOT NULL DEFAULT '',
  PRIMARY KEY (`kode_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of daftar_buku
-- ----------------------------
INSERT INTO `daftar_buku` VALUES ('A0001', 'Matematika', 'Batas Gerbang', 'Gramedia', '2001', 'Dipinjam');
INSERT INTO `daftar_buku` VALUES ('A0002', 'Bahasa Indonesia', 'Ebiet G', 'Gramedia', '2010', 'Dipinjam');
INSERT INTO `daftar_buku` VALUES ('A0003', 'Bahasa Sunda', 'Asep Sudirman', 'Erlangga', '2022', 'Tersedia');

-- ----------------------------
-- Table structure for peminjaman
-- ----------------------------
DROP TABLE IF EXISTS `peminjaman`;
CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT,
  `kode_buku` varchar(25) DEFAULT NULL,
  `judul_buku` varchar(50) DEFAULT NULL,
  `penulis` varchar(45) DEFAULT NULL,
  `penerbit` varchar(45) DEFAULT NULL,
  `tahun_terbit` varchar(7) DEFAULT NULL,
  `nis` varchar(25) DEFAULT NULL,
  `nama_peminjam` varchar(35) DEFAULT NULL,
  `date` varchar(11) DEFAULT NULL,
  `due` varchar(11) DEFAULT NULL,
  `total_hari` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_peminjaman`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of peminjaman
-- ----------------------------
INSERT INTO `peminjaman` VALUES ('3', 'A0001', 'Matematika', 'Batas Gerbang', 'Gramedia', '2001', '3411201050', 'Afuza Dwi', '2023/01/10', '2023/01/13', '3');
INSERT INTO `peminjaman` VALUES ('4', 'A0002', 'Bahasa Indonesia', 'Ebiet G', 'Gramedia', '2010', '3411201056', 'Diky Fadhillah', '2023/01/14', '2023/01/18', '4');

-- ----------------------------
-- Table structure for pengembalian_buku
-- ----------------------------
DROP TABLE IF EXISTS `pengembalian_buku`;
CREATE TABLE `pengembalian_buku` (
  `id_pengembalian` int(11) NOT NULL AUTO_INCREMENT,
  `kode_buku` varchar(25) NOT NULL,
  `judul_buku` varchar(50) NOT NULL,
  `penulis` varchar(45) NOT NULL DEFAULT '',
  `penerbit` varchar(45) DEFAULT '',
  `tahun_terbit` varchar(7) DEFAULT '',
  `nis` varchar(25) DEFAULT '',
  `nama_peminjam` varchar(35) DEFAULT '',
  `return_date` varchar(11) NOT NULL,
  `elp` int(11) NOT NULL,
  `fine` int(11) NOT NULL,
  PRIMARY KEY (`id_pengembalian`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of pengembalian_buku
-- ----------------------------
INSERT INTO `pengembalian_buku` VALUES ('28', 'A0001', 'Matematika', 'Batas Gerbang', 'Gramedia', '2001', '3411201050', 'Afuza Dwi', '2023/01/24', '0', '0');
INSERT INTO `pengembalian_buku` VALUES ('29', 'A0001', 'Matematika', 'Batas Gerbang', 'Gramedia', '2001', '3411201050', 'Afuza Dwi', '2023/01/13', '2', '10000');
