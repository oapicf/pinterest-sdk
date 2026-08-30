--
-- "Pinterest REST API"
-- Prepared SQL queries for 'FrequencyGoalMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'frequency_goal_metadata'
--
SELECT frequency, timerange FROM frequency_goal_metadata WHERE 1=1;

--
-- INSERT template for table 'frequency_goal_metadata'
--
INSERT INTO frequency_goal_metadata (frequency, timerange) VALUES (?, ?);

--
-- UPDATE template for table 'frequency_goal_metadata'
--
UPDATE frequency_goal_metadata SET frequency = ?, timerange = ? WHERE 1=2;

--
-- DELETE template for table 'frequency_goal_metadata'
--
DELETE FROM frequency_goal_metadata WHERE 1=2;

