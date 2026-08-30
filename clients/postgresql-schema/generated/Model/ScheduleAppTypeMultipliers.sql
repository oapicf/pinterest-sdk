--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleAppTypeMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_app_type_multipliers'
--
SELECT app_type FROM schedule_app_type_multipliers WHERE 1=1;

--
-- INSERT template for table 'schedule_app_type_multipliers'
--
INSERT INTO schedule_app_type_multipliers (app_type) VALUES (?);

--
-- UPDATE template for table 'schedule_app_type_multipliers'
--
UPDATE schedule_app_type_multipliers SET app_type = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_app_type_multipliers'
--
DELETE FROM schedule_app_type_multipliers WHERE 1=2;

