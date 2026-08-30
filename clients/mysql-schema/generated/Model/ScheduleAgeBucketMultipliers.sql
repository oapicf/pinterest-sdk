--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleAgeBucketMultipliers' definition.
--


--
-- SELECT template for table `ScheduleAgeBucketMultipliers`
--
SELECT `AGE_BUCKET` FROM `ScheduleAgeBucketMultipliers` WHERE 1;

--
-- INSERT template for table `ScheduleAgeBucketMultipliers`
--
INSERT INTO `ScheduleAgeBucketMultipliers`(`AGE_BUCKET`) VALUES (?);

--
-- UPDATE template for table `ScheduleAgeBucketMultipliers`
--
UPDATE `ScheduleAgeBucketMultipliers` SET `AGE_BUCKET` = ? WHERE 1;

--
-- DELETE template for table `ScheduleAgeBucketMultipliers`
--
DELETE FROM `ScheduleAgeBucketMultipliers` WHERE 0;

