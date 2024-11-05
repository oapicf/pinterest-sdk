--
-- Pinterest REST API.
-- Prepared SQL queries for 'PlacementMultipliers' definition.
--


--
-- SELECT template for table `PlacementMultipliers`
--
SELECT `PLACEMENT` FROM `PlacementMultipliers` WHERE 1;

--
-- INSERT template for table `PlacementMultipliers`
--
INSERT INTO `PlacementMultipliers`(`PLACEMENT`) VALUES (?);

--
-- UPDATE template for table `PlacementMultipliers`
--
UPDATE `PlacementMultipliers` SET `PLACEMENT` = ? WHERE 1;

--
-- DELETE template for table `PlacementMultipliers`
--
DELETE FROM `PlacementMultipliers` WHERE 0;

