-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: btl
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `sound`
--

DROP TABLE IF EXISTS `sound`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sound` (
  `id` int NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `length` int DEFAULT NULL,
  `script` varchar(45) DEFAULT NULL,
  `level` int DEFAULT NULL,
  `lesson` int DEFAULT NULL,
  `part` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sound`
--

LOCK TABLES `sound` WRITE;
/*!40000 ALTER TABLE `sound` DISABLE KEYS */;
INSERT INTO `sound` VALUES (111,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 1\\lesson 1 part 1.wav',23,'D:\\Eclipse\\Script\\Level 1\\Lesson 1\\part 1.txt',1,1,1),(112,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 1\\lesson 1 part 2.wav',10,'D:\\Eclipse\\Script\\Level 1\\Lesson 1\\part 2.txt',1,1,2),(113,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 1\\lesson 1 part 3.wav',19,'D:\\Eclipse\\Script\\Level 1\\Lesson 1\\part 3.txt',1,1,3),(121,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 2\\lesson 2 part 1.wav',11,'D:\\Eclipse\\Script\\Level 1\\Lesson 2\\part 1.txt',1,2,1),(122,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 2\\lesson 2 part 2.wav',12,'D:\\Eclipse\\Script\\Level 1\\Lesson 2\\part 2.txt',1,2,2),(123,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 2\\lesson 2 part 3.wav',13,'D:\\Eclipse\\Script\\Level 1\\Lesson 2\\part 3.txt',1,2,3),(131,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 3\\lesson 3 part 1.wav',15,'D:\\Eclipse\\Script\\Level 1\\Lesson 3\\part 1.txt',1,3,1),(132,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 3\\lesson 3 part 2.wav',8,'D:\\Eclipse\\Script\\Level 1\\Lesson 3\\part 2.txt',1,3,2),(133,'D:\\Eclipse\\AudioEdited\\level 1\\lesson 3\\lesson 3 part 3.wav',8,'D:\\Eclipse\\Script\\Level 1\\Lesson 3\\part 4.txt',1,3,3),(211,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 1\\lesson 1 part 1.wav',15,'D:\\Eclipse\\Script\\Level 2\\Lesson 1\\part 1.txt',2,1,1),(212,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 1\\lesson 1 part 2.wav',12,'D:\\Eclipse\\Script\\Level 2\\Lesson 1\\part 2.txt',2,1,2),(213,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 1\\lesson 1 part 3.wav',16,'D:\\Eclipse\\Script\\Level 2\\Lesson 1\\part 3.txt',2,1,3),(221,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 2\\lesson 2 part 1.wav',17,'D:\\Eclipse\\Script\\Level 2\\Lesson 2\\part 1.txt',2,2,1),(222,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 2\\lesson 2 part 2.wav',26,'D:\\Eclipse\\Script\\Level 2\\Lesson 2\\part 2.txt',2,2,2),(223,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 2\\lesson 2 part 3.wav',25,'D:\\Eclipse\\Script\\Level 2\\Lesson 2\\part 3.txt',2,2,3),(231,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 3\\lesson 3 part 1.wav',15,'D:\\Eclipse\\Script\\Level 2\\Lesson 3\\part 1.txt',2,3,1),(232,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 3\\lesson 3 part 2.wav',12,'D:\\Eclipse\\Script\\Level 2\\Lesson 3\\part 2.txt',2,3,2),(233,'D:\\Eclipse\\AudioEdited\\level 2\\lesson 3\\lesson 3 part 3.wav',8,'D:\\Eclipse\\Script\\Level 2\\Lesson 3\\part 3.txt',2,3,3),(311,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 1\\lesson 1 part 1.wav',22,'D:\\Eclipse\\Script\\Level 3\\Lesson 1\\part 1.txt',3,1,1),(312,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 1\\lesson 1 part 2.wav',28,'D:\\Eclipse\\Script\\Level 3\\Lesson 1\\part 2.txt',3,1,2),(313,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 1\\lesson 1 part 3.wav',32,'D:\\Eclipse\\Script\\Level 3\\Lesson 1\\part 3.txt',3,1,3),(321,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 2\\lesson 2 part 1.wav',28,'D:\\Eclipse\\Script\\Level 3\\Lesson 2\\part 1.txt',3,2,1),(322,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 2\\lesson 2 part 2.wav',30,'D:\\Eclipse\\Script\\Level 3\\Lesson 2\\part 2.txt',3,2,2),(323,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 2\\lesson 2 part 3.wav',33,'D:\\Eclipse\\Script\\Level 3\\Lesson 2\\part 3.txt',3,2,3),(331,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 3\\lesson 3 part 1.wav',27,'D:\\Eclipse\\Script\\Level 3\\Lesson 3\\part 1.txt',3,3,1),(332,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 3\\lesson 3 part 2.wav',24,'D:\\Eclipse\\Script\\Level 3\\Lesson 3\\part 2.txt',3,3,2),(333,'D:\\Eclipse\\AudioEdited\\level 3\\lesson 3\\lesson 3 part 3.wav',21,'D:\\Eclipse\\Script\\Level 3\\Lesson 3\\part 3.txt',3,3,3);
/*!40000 ALTER TABLE `sound` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-10 23:34:31
