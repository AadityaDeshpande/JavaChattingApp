-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2019 at 01:52 PM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chatusers`
--

-- --------------------------------------------------------

--
-- Table structure for table `aaditya`
--

CREATE TABLE `aaditya` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) NOT NULL,
  `message` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aaditya`
--

INSERT INTO `aaditya` (`id`, `msgfrom`, `message`) VALUES
(1, 'saish', 'hello');

-- --------------------------------------------------------

--
-- Table structure for table `anand`
--

CREATE TABLE `anand` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) NOT NULL,
  `message` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anand`
--

INSERT INTO `anand` (`id`, `msgfrom`, `message`) VALUES
(1, 'aaditya', 'kai re bhai'),
(2, 'saish', 'takala na bhai'),
(3, 'saish', 'he;llo'),
(4, 'anand', 'sup brohhh');

-- --------------------------------------------------------

--
-- Table structure for table `devashish`
--

CREATE TABLE `devashish` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) NOT NULL,
  `message` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `devashish`
--

INSERT INTO `devashish` (`id`, `msgfrom`, `message`) VALUES
(1, 'saish', 'hello');

-- --------------------------------------------------------

--
-- Table structure for table `fd`
--

CREATE TABLE `fd` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ijk`
--

CREATE TABLE `ijk` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `john`
--

CREATE TABLE `john` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `saish`
--

CREATE TABLE `saish` (
  `id` int(11) NOT NULL,
  `msgfrom` varchar(10) NOT NULL,
  `message` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saish`
--

INSERT INTO `saish` (`id`, `msgfrom`, `message`) VALUES
(1, 'aaditya', 'bro'),
(2, 'devashish', 'hello'),
(3, 'devashish', 'bye'),
(11, 'aaditya', 'msg from aaditya');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user`) VALUES
('aaditya'),
('saish'),
('devashish'),
('anand'),
('shri'),
('hite'),
('joshi'),
('josh'),
('jos'),
('jo'),
('sai'),
('aad'),
('mas'),
('abc'),
('kj'),
('name'),
('mas'),
('kj'),
('jh'),
('gf'),
('fd'),
('john'),
('ijk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aaditya`
--
ALTER TABLE `aaditya`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `anand`
--
ALTER TABLE `anand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `devashish`
--
ALTER TABLE `devashish`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fd`
--
ALTER TABLE `fd`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ijk`
--
ALTER TABLE `ijk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `john`
--
ALTER TABLE `john`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `saish`
--
ALTER TABLE `saish`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aaditya`
--
ALTER TABLE `aaditya`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `anand`
--
ALTER TABLE `anand`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `devashish`
--
ALTER TABLE `devashish`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `fd`
--
ALTER TABLE `fd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ijk`
--
ALTER TABLE `ijk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `john`
--
ALTER TABLE `john`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `saish`
--
ALTER TABLE `saish`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
