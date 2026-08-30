--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleCommonDeltaValue' definition.
--


--
-- SELECT template for table `ScheduleCommonDeltaValue`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `ScheduleCommonDeltaValue` WHERE 1;

--
-- INSERT template for table `ScheduleCommonDeltaValue`
--
INSERT INTO `ScheduleCommonDeltaValue`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleCommonDeltaValue`
--
UPDATE `ScheduleCommonDeltaValue` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `ScheduleCommonDeltaValue`
--
DELETE FROM `ScheduleCommonDeltaValue` WHERE 0;

