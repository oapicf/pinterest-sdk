--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleAudienceMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_audience_multipliers'
--
SELECT audience_id FROM schedule_audience_multipliers WHERE 1=1;

--
-- INSERT template for table 'schedule_audience_multipliers'
--
INSERT INTO schedule_audience_multipliers (audience_id) VALUES (?);

--
-- UPDATE template for table 'schedule_audience_multipliers'
--
UPDATE schedule_audience_multipliers SET audience_id = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_audience_multipliers'
--
DELETE FROM schedule_audience_multipliers WHERE 1=2;

