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
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Kirk',37),(2,'Lucas',57),(3,'Fiona',50),(4,'Jessamine',45),(5,'Caryn',56),(6,'Willow',37),(7,'Sonya',41),(8,'Kylie',44),(9,'Ethan',53),(10,'Forrest',52),(11,'Kirby',52),(12,'Mohammad',39),(13,'Perry',59),(14,'Lara',53),(15,'Boris',45),(16,'Levi',56),(17,'Ivan',50),(18,'Rigel',60),(19,'Gillian',43),(20,'Dante',58),(21,'Victor',59),(22,'Regina',35),(23,'Claudia',48),(24,'Bertha',41),(25,'Dai',54),(26,'Otto',56),(27,'Caesar',32),(28,'Galena',36),(29,'Constance',55),(30,'Veda',30),(31,'Kessie',34),(32,'Quynn',49),(33,'Shoshana',44),(34,'Jonas',54),(35,'Adara',48),(36,'Leah',51),(37,'Ina',54),(38,'Haviva',39),(39,'Leonard',57),(40,'Briar',55),(41,'Micah',38),(42,'Tucker',41),(43,'Francis',37),(44,'Marsden',55),(45,'Mariam',40),(46,'Ashely',57),(47,'Jameson',45),(48,'Cora',48),(49,'Quin',48),(50,'Castor',51),(51,'Amaya',58),(52,'Desiree',35),(53,'Hu',41),(54,'Magee',38),(55,'Reuben',38),(56,'Rajah',35),(57,'Gregory',51),(58,'Warren',41),(59,'Elton',34),(60,'Desiree',57),(61,'Yolanda',54),(62,'Gage',34),(63,'Emma',31),(64,'Meredith',48),(65,'Jonas',52),(66,'Nathaniel',46),(67,'Kay',51),(68,'Maryam',49),(69,'Clarke',42),(70,'Amanda',44),(71,'MacKenzie',53),(72,'Iris',59),(73,'Medge',39),(74,'Nolan',35),(75,'Lacota',57),(76,'Jermaine',30),(77,'Hedy',54),(78,'Elaine',47),(79,'Britanney',47),(80,'Elliott',43),(81,'Lunea',44),(82,'Blaze',45),(83,'Elton',40),(84,'Alexis',47),(85,'Hayes',59),(86,'Leilani',51),(87,'Edward',37),(88,'Clarke',40),(89,'Axel',55),(90,'Kiona',36),(91,'Amir',43),(92,'Damian',48),(93,'Anastasia',40),(94,'Steel',57),(95,'Maryam',49),(96,'Derek',55),(97,'Guinevere',59),(98,'Alika',52),(99,'Aquila',36),(100,'Silas',38);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
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
