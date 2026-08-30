--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleAgeBucketMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_age_bucket_multipliers'
--
SELECT age_bucket FROM schedule_age_bucket_multipliers WHERE 1=1;

--
-- INSERT template for table 'schedule_age_bucket_multipliers'
--
INSERT INTO schedule_age_bucket_multipliers (age_bucket) VALUES (?);

--
-- UPDATE template for table 'schedule_age_bucket_multipliers'
--
UPDATE schedule_age_bucket_multipliers SET age_bucket = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_age_bucket_multipliers'
--
DELETE FROM schedule_age_bucket_multipliers WHERE 1=2;

