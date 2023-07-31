-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 04, 2021 at 06:55 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shop_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `ordered_products`
--

CREATE TABLE `ordered_products` (
  `Invoice_id` varchar(100) NOT NULL,
  `Product_id` varchar(100) NOT NULL,
  `Order_id` varchar(100) NOT NULL,
  `Quantity` varchar(100) NOT NULL,
  `Price_each` varchar(100) NOT NULL,
  `Discount` varchar(100) NOT NULL,
  `Total_Price` varchar(100) NOT NULL,
  `Customer_Id` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordered_products`
--

INSERT INTO `ordered_products` (`Invoice_id`, `Product_id`, `Order_id`, `Quantity`, `Price_each`, `Discount`, `Total_Price`, `Customer_Id`) VALUES
('01', '1', '10', '1', '250', '20', '230.0', '1'),
('10', '1', '10', '1', '250', '20', '230.0', '1'),
('10', '1', '10', '1', '500', '40', '460.0', '1'),
('20', '1', '5', '10', '100', '5', '995.0', '1'),
('10', '1', '20', '5', '250', '30', '1220.0', '2');

-- --------------------------------------------------------

--
-- Table structure for table `product_information`
--

CREATE TABLE `product_information` (
  `Id` varchar(100) NOT NULL,
  `Product_location` varchar(500) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Vendor` varchar(100) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Qnt_in_stk` varchar(100) NOT NULL,
  `WholeSale_Price` varchar(100) NOT NULL,
  `Retail_Price` varchar(100) NOT NULL,
  `MRSP` varchar(10000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_information`
--

INSERT INTO `product_information` (`Id`, `Product_location`, `Name`, `Vendor`, `Description`, `Qnt_in_stk`, `WholeSale_Price`, `Retail_Price`, `MRSP`) VALUES
('1', 'row 5', 'The Jungle Book', 'Tonu', 'Book', '50', '250', '230', '200');

-- --------------------------------------------------------

--
-- Table structure for table `registration_table`
--

CREATE TABLE `registration_table` (
  `Id` varchar(100) NOT NULL,
  `personal id` varchar(100) NOT NULL,
  `First_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Credit_llimit` varchar(100) NOT NULL,
  `Billing_Address` varchar(1000) NOT NULL,
  `Shipping_Address` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration_table`
--

INSERT INTO `registration_table` (`Id`, `personal id`, `First_Name`, `Last_Name`, `Phone`, `Credit_llimit`, `Billing_Address`, `Shipping_Address`) VALUES
('1', '10', 'AA', 'B', '01614160421', '10000', 'Bangladesh', 'Bangladesh'),
('2', '11', 'AB', 'BB', '01614160422', '10000', 'Dhaka,Bangladesh', 'Dhaka,Bangladesh'),
('2', '02', 'Jam', 'Ja', '01234567895', '10000', 'Rajshahi', 'Rajshahi');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
