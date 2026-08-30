--
-- Pinterest REST API.
-- Prepared SQL queries for 'SchedulePlacementMultipliers' definition.
--


--
-- SELECT template for table `SchedulePlacementMultipliers`
--
SELECT `browse`, `related_pins`, `search` FROM `SchedulePlacementMultipliers` WHERE 1;

--
-- INSERT template for table `SchedulePlacementMultipliers`
--
INSERT INTO `SchedulePlacementMultipliers`(`browse`, `related_pins`, `search`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SchedulePlacementMultipliers`
--
UPDATE `SchedulePlacementMultipliers` SET `browse` = ?, `related_pins` = ?, `search` = ? WHERE 1;

--
-- DELETE template for table `SchedulePlacementMultipliers`
--
DELETE FROM `SchedulePlacementMultipliers` WHERE 0;

