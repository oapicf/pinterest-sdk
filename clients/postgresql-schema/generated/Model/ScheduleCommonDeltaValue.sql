--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleCommonDeltaValue' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_common_delta_value'
--
SELECT age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers FROM schedule_common_delta_value WHERE 1=1;

--
-- INSERT template for table 'schedule_common_delta_value'
--
INSERT INTO schedule_common_delta_value (age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_common_delta_value'
--
UPDATE schedule_common_delta_value SET age_bucket_multipliers = ?, app_type_multipliers = ?, audience_multipliers = ?, gender_multipliers = ?, placement_multipliers = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_common_delta_value'
--
DELETE FROM schedule_common_delta_value WHERE 1=2;

