

-- Dumping database structure for test_qazi
CREATE DATABASE IF NOT EXISTS `test_qazi` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `test_qazi`;

-- Dumping structure for table test_qazi.department
CREATE TABLE IF NOT EXISTS `department` (
  `department_id` int(11) DEFAULT NULL,
  `department_name` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table test_qazi.department: ~2 rows (approximately)
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` (`department_id`, `department_name`) VALUES
	(1, 'IT'),
	(2, 'Sales');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;

-- Dumping structure for table test_qazi.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `emp_id` double DEFAULT NULL,
  `first_name` varchar(10) DEFAULT NULL,
  `last_name` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `salary` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table test_qazi.employee: ~8 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`emp_id`, `first_name`, `last_name`, `gender`, `position`, `department_id`, `salary`) VALUES
	(10001, 'Super', 'Man', 'M', 'QA', 1, 45000),
	(10002, 'Jessica', 'Liyers', 'F', 'Architect', 1, 60000),
	(10003, 'Bonnie', 'Adams', 'F', 'Product Manager', 1, 80000),
	(10004, 'James', 'Madison', 'M', 'Software developer', 1, 75000),
	(10005, 'Michael', 'Greenback', 'M', 'Sales Assistant', 2, 85000),
	(10006, 'Leslie', 'Peters', 'F', 'Sales engineer', 2, 76000),
	(10007, 'Max', 'Powel', 'M', 'Sales Representative', 2, 59000),
	(10008, 'Stacy', 'Jacobs', 'F', 'Sales Manager', 2, 73000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
