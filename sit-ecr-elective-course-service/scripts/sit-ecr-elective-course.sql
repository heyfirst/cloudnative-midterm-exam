-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 21, 2018 at 06:31 PM
-- Server version: 10.3.9-MariaDB-1:10.3.9+maria~bionic
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sit-ecr-elective-course`
--
CREATE DATABASE IF NOT EXISTS `sit-ecr-elective-course` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `sit-ecr-elective-course`;

-- --------------------------------------------------------

--
-- Table structure for table `elective_courses`
--

DROP TABLE IF EXISTS `elective_courses`;
CREATE TABLE `elective_courses` (
  `id` int(11) NOT NULL,
  `course_code` varchar(255) DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `lecturer` varchar(255) DEFAULT NULL,
  `max_enrolls` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `elective_courses`
--

TRUNCATE TABLE `elective_courses`;
--
-- Dumping data for table `elective_courses`
--

INSERT INTO `elective_courses` (`id`, `course_code`, `course_name`, `lecturer`, `max_enrolls`) VALUES
(1, 'INT491', 'Big Data', '-', 30),
(2, 'INT492', 'Big Data', '-', 30),
(13, 'INT492', 'Big Data', '-', 30),
(14, 'INT492', 'Big Data', '-', 30),
(15, 'INT492', 'Big Data', '-', 30),
(16, 'INT492', 'Big Data', '-', 30),
(19, 'INT492', 'Big Data', '-', 30),
(20, 'INT492', 'Big Data', '-', 30),
(21, 'INT492', 'Big Data', '-', 30);

-- --------------------------------------------------------

--
-- Table structure for table `enrolls`
--

DROP TABLE IF EXISTS `enrolls`;
CREATE TABLE `enrolls` (
  `id` int(11) NOT NULL,
  `course_id` int(11) DEFAULT NULL,
  `created` datetime NOT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `enrolls`
--

TRUNCATE TABLE `enrolls`;
--
-- Dumping data for table `enrolls`
--

INSERT INTO `enrolls` (`id`, `course_id`, `created`, `user_id`) VALUES
(7, 1, '2018-10-21 15:46:46', 1),
(12, 2, '2018-10-21 17:57:12', 24),
(9, 1, '2018-10-21 17:37:51', 2),
(10, 2, '2018-10-21 17:38:04', 1),
(11, 2, '2018-10-21 17:56:42', 2),
(17, 2, '2018-10-21 18:13:28', 23),
(18, 2, '2018-10-21 18:15:21', 22);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `hibernate_sequence`
--

TRUNCATE TABLE `hibernate_sequence`;
--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(22),
(22);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `elective_courses`
--
ALTER TABLE `elective_courses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `enrolls`
--
ALTER TABLE `enrolls`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
