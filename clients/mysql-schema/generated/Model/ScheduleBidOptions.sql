--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleBidOptions' definition.
--


--
-- SELECT template for table `ScheduleBidOptions`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `ScheduleBidOptions` WHERE 1;

--
-- INSERT template for table `ScheduleBidOptions`
--
INSERT INTO `ScheduleBidOptions`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleBidOptions`
--
UPDATE `ScheduleBidOptions` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `ScheduleBidOptions`
--
DELETE FROM `ScheduleBidOptions` WHERE 0;

