--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsAiContentDisclosure' definition.
--


--
-- SELECT template for table `CatalogsAiContentDisclosure`
--
SELECT `disclosure`, `url` FROM `CatalogsAiContentDisclosure` WHERE 1;

--
-- INSERT template for table `CatalogsAiContentDisclosure`
--
INSERT INTO `CatalogsAiContentDisclosure`(`disclosure`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsAiContentDisclosure`
--
UPDATE `CatalogsAiContentDisclosure` SET `disclosure` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `CatalogsAiContentDisclosure`
--
DELETE FROM `CatalogsAiContentDisclosure` WHERE 0;

