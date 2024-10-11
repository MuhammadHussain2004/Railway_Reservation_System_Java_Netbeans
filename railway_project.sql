-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2023 at 11:46 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `railway_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `signup_info`
--

CREATE TABLE `signup_info` (
  `Full Name` text NOT NULL,
  `Phone Number` int(11) NOT NULL,
  `Email` text NOT NULL,
  `Cnic` int(15) NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `signup_info`
--

INSERT INTO `signup_info` (`Full Name`, `Phone Number`, `Email`, `Cnic`, `Password`) VALUES
('full name', 466, 'email', 234, 'password'),
('Full name', 65767, 'Email', 878678976, 'comp');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `signup_info`
--
ALTER TABLE `signup_info`
  ADD PRIMARY KEY (`Cnic`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
