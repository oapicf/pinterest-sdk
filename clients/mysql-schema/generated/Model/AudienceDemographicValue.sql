--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceDemographicValue' definition.
--


--
-- SELECT template for table `AudienceDemographicValue`
--
SELECT `key`, `name`, `ratio` FROM `AudienceDemographicValue` WHERE 1;

--
-- INSERT template for table `AudienceDemographicValue`
--
INSERT INTO `AudienceDemographicValue`(`key`, `name`, `ratio`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AudienceDemographicValue`
--
UPDATE `AudienceDemographicValue` SET `key` = ?, `name` = ?, `ratio` = ? WHERE 1;

--
-- DELETE template for table `AudienceDemographicValue`
--
DELETE FROM `AudienceDemographicValue` WHERE 0;

