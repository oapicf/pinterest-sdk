--
-- Pinterest REST API.
-- Prepared SQL queries for 'FrequencyMultipliers' definition.
--


--
-- SELECT template for table `FrequencyMultipliers`
--
SELECT `IMPRESSION_COUNT` FROM `FrequencyMultipliers` WHERE 1;

--
-- INSERT template for table `FrequencyMultipliers`
--
INSERT INTO `FrequencyMultipliers`(`IMPRESSION_COUNT`) VALUES (?);

--
-- UPDATE template for table `FrequencyMultipliers`
--
UPDATE `FrequencyMultipliers` SET `IMPRESSION_COUNT` = ? WHERE 1;

--
-- DELETE template for table `FrequencyMultipliers`
--
DELETE FROM `FrequencyMultipliers` WHERE 0;

