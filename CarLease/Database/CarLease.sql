-- Dumping database structure for dvddb
DROP DATABASE IF EXISTS `CarLease`;
CREATE DATABASE IF NOT EXISTS `CarLease`;
USE `CarLease`;

-- Dumping structure for table CarLease.Cars
DROP TABLE IF EXISTS `Cars`;
CREATE TABLE IF NOT EXISTS `Cars` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Manufacture` varchar(255) NOT NULL DEFAULT '0',
  `Model` varchar(50) NULL ,
  `Year` int(4) NOT NULL DEFAULT '0',
  `Description` varchar(255) NULL ,
  `Registration` varchar(50) NULL ,
  `Colour` varchar(50) NOT NULL DEFAULT '0',
  `ContractEnd` date NULL,
  `Term` int(2) NOT NULL DEFAULT '0',
  `HighestRecordedMileage` int(4) NULL ,
  `HRMDate` date NULL,
  `FuelType` varchar(50) NOT NULL default 'Electric',
  `EngineSize` varchar(50) NULL ,
  `DayRate` decimal(6,2) NULL ,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table Cars
INSERT INTO `Cars` (`ID`, `Manufacture`, `Model`, `Year` , `Description` , `Registration` , `Colour` , `ContractEnd` , 
						`Term` , `HighestRecordedMileage` , `HRMDate` ,  `FuelType` , `EngineSize` , `DayRate`) VALUES
	(1, 'VW', 'Golf' , 2019 , 'Vw Golf Hatchback 1.4 Tsi Gte 5dr Dsg' , NULL , 'Red' , '2025-12-20' ,
    36 , NULL , '2019-01-19' , 'Hybrid' , NULL , 10),
	
    (2, 'LX', 'Prime' , 2019 , 'Lx Es Saloon 300h 2.5 4dr Cvt [Premium Pack]' , NULL , 'Silver' , '2023-10-01' ,
    48 , 42638 , '2019-01-19' , 'Hybrid' , NULL, 20),
	
    (3, 'MI', 'Outlander' , 2019 , 'Mi Outlander Estate 2.4 Phev 4h 5dr Auto' , NULL , 'Black' , '2025-12-20' ,
    12 , NULL , '2019-01-19' , 'Hybrid' , '2.0' , NULL);

-- Creating table structure for table CarLease.Customers
DROP TABLE IF EXISTS `Customers`;
CREATE TABLE IF NOT EXISTS `Customers` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Address1` varchar(50) NOT NULL,
  `Address2` varchar(50) NULL,
  `Postcode` varchar(50) NOT NULL,
  `LicenceNumber` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table CarLease.Customers
INSERT INTO `Customers` (`ID`, `FirstName`, `LastName`, `Address1` , `Address2`  , `Postcode` , `LicenceNumber`) VALUES
	(1, 'Saad', 'Toseef', 'Address1' , 'Address2' , 'PC1 2CE' , '12345ST1323PFR2'),
    (2, 'Yvonne', 'Woodward', 'Address1' , 'Address2' , 'PC1 2CE' , '12345YW1323PFR2'),
	(3, 'Josh', 'Bray', 'Address1' , 'Address2' , 'PC1 2CE' , '12345MP1323PFR2'),
	(4, 'David', 'Rockall', 'Address1' , 'Address2' , 'PC1 2CE' , '12345MP1323PFR2'),
    (5, 'Faizal', 'Patel', 'Address1' , 'Address2' , 'PC1 2CE' , '12345MP1323PFR2');

-- Creating table structure for table CarLease.Plans
DROP TABLE IF EXISTS `Plans`;
CREATE TABLE IF NOT EXISTS `Plans` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(50) NOT NULL,
  `Duration` int(2) NOT NULL,
  `PlanValue` DECIMAL(6,2) NULL,
  `AdminFee` DECIMAL(4,2) NULL,
  `Discount` DECIMAL(4,2) NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table CarLease.Customers
INSERT INTO `Plans` (`ID`, `Description`, `Duration`, `PlanValue` , `AdminFee` , `Discount`) VALUES
	(1, 'Flex Monthly Rolling', 30, 500 , 30 , NULL),
    (2, 'Pay As You Drive', 1 , NULL , 20 , NULL);
    