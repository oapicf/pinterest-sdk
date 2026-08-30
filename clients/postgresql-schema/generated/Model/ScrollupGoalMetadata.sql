--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScrollupGoalMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'scrollup_goal_metadata'
--
SELECT scrollup_goal_value_in_micro_currency FROM scrollup_goal_metadata WHERE 1=1;

--
-- INSERT template for table 'scrollup_goal_metadata'
--
INSERT INTO scrollup_goal_metadata (scrollup_goal_value_in_micro_currency) VALUES (?);

--
-- UPDATE template for table 'scrollup_goal_metadata'
--
UPDATE scrollup_goal_metadata SET scrollup_goal_value_in_micro_currency = ? WHERE 1=2;

--
-- DELETE template for table 'scrollup_goal_metadata'
--
DELETE FROM scrollup_goal_metadata WHERE 1=2;

