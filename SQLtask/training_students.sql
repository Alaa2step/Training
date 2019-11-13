-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: training
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `supervisorId` varchar(45) DEFAULT NULL,
  `coursesId` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Ali','13','21'),(2,'Xander','1','50'),(3,'Zephr','19','7'),(4,'Hannah','3','20'),(5,'Clare','11','33'),(6,'Jesse','9','47'),(7,'Christopher','16','15'),(8,'Travis','10','28'),(9,'James','5','38'),(10,'Avram','4','27'),(11,'Olivia','13','41'),(12,'Ina','9','34'),(13,'Mary','1','12'),(14,'Kaseem','12','47'),(15,'Stuart','6','27'),(16,'Mia','5','2'),(17,'Cullen','18','9'),(18,'Jamal','1','6'),(19,'Raja','2','30'),(20,'Matthew','8','50'),(21,'Yoko','14','29'),(22,'Camden','14','15'),(23,'Kalia','12','46'),(24,'Vaughan','7','18'),(25,'Hu','3','49'),(26,'Patricia','3','2'),(27,'Jayme','17','17'),(28,'Kylynn','17','30'),(29,'Jacqueline','19','48'),(30,'John','7','25'),(31,'Oscar','18','17'),(32,'Thor','8','32'),(33,'Alisa','6','28'),(34,'Paki','4','43'),(35,'Maite','3','49'),(36,'Wyoming','17','46'),(37,'Emmanuel','10','11'),(38,'Odette','20','32'),(39,'Diana','2','32'),(40,'Susan','2','38'),(41,'Lillian','2','30'),(42,'Francis','18','25'),(43,'Sandra','5','12'),(44,'Maya','15','12'),(45,'Hyatt','19','8'),(46,'Perry','3','14'),(47,'Amethyst','2','3'),(48,'Addison','7','12'),(49,'Yardley','9','44'),(50,'Odysseus','2','150'),(51,'Flavia','15','48'),(52,'Jenette','3','4'),(53,'Nina','2','46'),(54,'Ralph','1','5'),(55,'Cadman','3','20'),(56,'Jelani','8','5'),(57,'Heather','6','34'),(58,'Susan','17','20'),(59,'Jenna','12','33'),(60,'Yen','19','34'),(61,'Fletcher','19','47'),(62,'Emery','13','22'),(63,'Theodore','11','11'),(64,'Tatiana','8','8'),(65,'Haviva','19','12'),(66,'Tamekah','3','29'),(67,'Norman','1','16'),(68,'Stephen','2','48'),(69,'Lucas','20','37'),(70,'Ulla','11','27'),(71,'Mia','4','40'),(72,'Zahir','4','46'),(73,'Portia','18','33'),(74,'Neil','7','15'),(75,'Britanni','9','14'),(76,'Veronica','11','8'),(77,'September','20','17'),(78,'Eliana','17','37'),(79,'Darrel','5','36'),(80,'Norman','17','50'),(81,'Arden','4','27'),(82,'Forrest','19','40'),(83,'Beatrice','19','3'),(84,'Armando','3','5'),(85,'Alvin','19','8'),(86,'Dorothy','20','32'),(87,'Brian','20','41'),(88,'Akeem','13','22'),(89,'Xerxes','15','2'),(90,'Chloe','20','15'),(91,'Alec','19','18'),(92,'Macon','11','15'),(93,'Gay','13','22'),(94,'Lillian','15','15'),(95,'Conan','5','43'),(96,'Sebastian','7','7'),(97,'Caesar','4','10'),(98,'Lareina','5','47'),(99,'Gannon','17','38'),(100,'Lillith','16','14');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-13 11:46:06
