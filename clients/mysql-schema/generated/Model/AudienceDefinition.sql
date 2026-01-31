--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceDefinition' definition.
--


--
-- SELECT template for table `AudienceDefinition`
--
SELECT `date`, `scope`, `type` FROM `AudienceDefinition` WHERE 1;

--
-- INSERT template for table `AudienceDefinition`
--
INSERT INTO `AudienceDefinition`(`date`, `scope`, `type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AudienceDefinition`
--
UPDATE `AudienceDefinition` SET `date` = ?, `scope` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `AudienceDefinition`
--
DELETE FROM `AudienceDefinition` WHERE 0;

