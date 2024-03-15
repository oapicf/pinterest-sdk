--
-- Pinterest REST API.
-- Prepared SQL queries for 'GenderFilter' definition.
--


--
-- SELECT template for table `GenderFilter`
--
SELECT `GENDER` FROM `GenderFilter` WHERE 1;

--
-- INSERT template for table `GenderFilter`
--
INSERT INTO `GenderFilter`(`GENDER`) VALUES (?);

--
-- UPDATE template for table `GenderFilter`
--
UPDATE `GenderFilter` SET `GENDER` = ? WHERE 1;

--
-- DELETE template for table `GenderFilter`
--
DELETE FROM `GenderFilter` WHERE 0;

