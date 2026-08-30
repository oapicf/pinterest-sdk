--
-- Pinterest REST API.
-- Prepared SQL queries for 'Schedule_delta_value' definition.
--


--
-- SELECT template for table `Schedule_delta_value`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `Schedule_delta_value` WHERE 1;

--
-- INSERT template for table `Schedule_delta_value`
--
INSERT INTO `Schedule_delta_value`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Schedule_delta_value`
--
UPDATE `Schedule_delta_value` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `Schedule_delta_value`
--
DELETE FROM `Schedule_delta_value` WHERE 0;

