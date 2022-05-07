--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTypeFilter' definition.
--


--
-- SELECT template for table `TargetingTypeFilter`
--
SELECT `targeting_types` FROM `TargetingTypeFilter` WHERE 1;

--
-- INSERT template for table `TargetingTypeFilter`
--
INSERT INTO `TargetingTypeFilter`(`targeting_types`) VALUES (?);

--
-- UPDATE template for table `TargetingTypeFilter`
--
UPDATE `TargetingTypeFilter` SET `targeting_types` = ? WHERE 1;

--
-- DELETE template for table `TargetingTypeFilter`
--
DELETE FROM `TargetingTypeFilter` WHERE 0;

