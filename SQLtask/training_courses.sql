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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `studentId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'Zeus Hill','63'),(2,'Roary Cannon','34'),(3,'Wesley Webb','79'),(4,'Ulric Sweeney','32'),(5,'Ulric Berger','65'),(6,'Jordan Tucker','50'),(7,'Garrison Mcmahon','92'),(8,'Rylee Holmes','43'),(9,'Nicholas Ramsey','40'),(10,'Unity Whitehead','96'),(11,'Heidi Mcdowell','85'),(12,'Allen Delaney','96'),(13,'Slade Strong','24'),(14,'Dahlia Becker','88'),(15,'Shaeleigh Sanders','4'),(16,'Diana Bender','80'),(17,'Porter Church','34'),(18,'Rachel Bolton','99'),(19,'Anastasia Hale','19'),(20,'Griffin Lara','86'),(21,'Alexandra Drake','77'),(22,'Olga Grant','55'),(23,'Alec Dillon','46'),(24,'Stella Guzman','77'),(25,'Ulysses Hines','71'),(26,'Yoshi Hancock','41'),(27,'Jelani Ward','31'),(28,'Quyn Bentley','37'),(29,'Steven Harper','49'),(30,'Scarlet Gaines','88'),(31,'Mark Hughes','73'),(32,'Brynne David','52'),(33,'Hasad Peterson','94'),(34,'Lillith Diaz','27'),(35,'Hiram Parks','20'),(36,'Rafael Hendricks','9'),(37,'Hedley Gallagher','83'),(38,'Raven Petty','76'),(39,'Eric Murphy','51'),(40,'Ivory Nguyen','25'),(41,'Fredericka Johnston','20'),(42,'Anika Perry','84'),(43,'Kirestin Walker','11'),(44,'Jacob Kidd','26'),(45,'Nehru Macias','45'),(46,'Keith Snow','22'),(47,'Gay Hahn','2'),(48,'Fatima Mcdonald','62'),(49,'Debra Webster','96'),(50,'Georgia Melton','78'),(51,'Wallace Vinson','68'),(52,'Karen Rose','29'),(53,'Ciaran Campos','47'),(54,'Bethany Lyons','35'),(55,'Kasimir Flores','14'),(56,'Jaquelyn Frazier','22'),(57,'Luke Morrison','100'),(58,'Bree Conley','78'),(59,'Orlando Workman','79'),(60,'Vance Singleton','26'),(61,'Logan Wilkins','60'),(62,'Dean Howell','54'),(63,'Latifah Jordan','61'),(64,'Bruno Finley','89'),(65,'Justin Richards','13'),(66,'Clayton Stout','63'),(67,'Neve Roberson','25'),(68,'Jordan Potts','80'),(69,'Fleur Kidd','32'),(70,'Elliott Holt','45'),(71,'Constance Howard','4'),(72,'Hilel Benson','66'),(73,'Denton Yang','61'),(74,'Macey Castaneda','29'),(75,'Callum Holloway','69'),(76,'Dean Weber','91'),(77,'Timon Newton','20'),(78,'Mallory Rodgers','11'),(79,'Buckminster Rios','40'),(80,'Jana Weaver','81'),(81,'Yoshio Wooten','57'),(82,'Hall Dixon','93'),(83,'Ashton Jacobs','27'),(84,'Mary Santana','42'),(85,'Naida Lambert','17'),(86,'Finn Guy','6'),(87,'Montana Ewing','65'),(88,'Micah Pollard','67'),(89,'Zephr Freeman','82'),(90,'Rylee Solomon','90'),(91,'Wayne Mcneil','15'),(92,'Leo Chaney','6'),(93,'Timon Christian','92'),(94,'Asher Walter','60'),(95,'Ignatius Robertson','66'),(96,'Fredericka Boone','51'),(97,'Hall Haley','7'),(98,'Ishmael Barron','63'),(99,'Kane Jackson','77'),(100,'Hadassah Mcfarland','13');
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-13 11:46:07
