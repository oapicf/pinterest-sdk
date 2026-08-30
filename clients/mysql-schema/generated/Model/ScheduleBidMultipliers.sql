--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleBidMultipliers' definition.
--


--
-- SELECT template for table `ScheduleBidMultipliers`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `ScheduleBidMultipliers` WHERE 1;

--
-- INSERT template for table `ScheduleBidMultipliers`
--
INSERT INTO `ScheduleBidMultipliers`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleBidMultipliers`
--
UPDATE `ScheduleBidMultipliers` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `ScheduleBidMultipliers`
--
DELETE FROM `ScheduleBidMultipliers` WHERE 0;

