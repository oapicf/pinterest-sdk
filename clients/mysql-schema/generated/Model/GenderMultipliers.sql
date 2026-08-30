--
-- Pinterest REST API.
-- Prepared SQL queries for 'GenderMultipliers' definition.
--


--
-- SELECT template for table `GenderMultipliers`
--
SELECT `GENDER` FROM `GenderMultipliers` WHERE 1;

--
-- INSERT template for table `GenderMultipliers`
--
INSERT INTO `GenderMultipliers`(`GENDER`) VALUES (?);

--
-- UPDATE template for table `GenderMultipliers`
--
UPDATE `GenderMultipliers` SET `GENDER` = ? WHERE 1;

--
-- DELETE template for table `GenderMultipliers`
--
DELETE FROM `GenderMultipliers` WHERE 0;

