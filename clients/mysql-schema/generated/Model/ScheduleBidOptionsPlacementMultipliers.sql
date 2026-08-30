--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleBidOptions_placement_multipliers' definition.
--


--
-- SELECT template for table `ScheduleBidOptions_placement_multipliers`
--
SELECT `browse`, `related_pins`, `search` FROM `ScheduleBidOptions_placement_multipliers` WHERE 1;

--
-- INSERT template for table `ScheduleBidOptions_placement_multipliers`
--
INSERT INTO `ScheduleBidOptions_placement_multipliers`(`browse`, `related_pins`, `search`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ScheduleBidOptions_placement_multipliers`
--
UPDATE `ScheduleBidOptions_placement_multipliers` SET `browse` = ?, `related_pins` = ?, `search` = ? WHERE 1;

--
-- DELETE template for table `ScheduleBidOptions_placement_multipliers`
--
DELETE FROM `ScheduleBidOptions_placement_multipliers` WHERE 0;

