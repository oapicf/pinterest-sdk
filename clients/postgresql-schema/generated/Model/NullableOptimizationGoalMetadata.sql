--
-- "Pinterest REST API"
-- Prepared SQL queries for 'NullableOptimizationGoalMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nullable_optimization_goal_metadata'
--
SELECT conversion_tag_v3_goal_metadata, frequency_goal_metadata, scrollup_goal_metadata FROM nullable_optimization_goal_metadata WHERE 1=1;

--
-- INSERT template for table 'nullable_optimization_goal_metadata'
--
INSERT INTO nullable_optimization_goal_metadata (conversion_tag_v3_goal_metadata, frequency_goal_metadata, scrollup_goal_metadata) VALUES (?, ?, ?);

--
-- UPDATE template for table 'nullable_optimization_goal_metadata'
--
UPDATE nullable_optimization_goal_metadata SET conversion_tag_v3_goal_metadata = ?, frequency_goal_metadata = ?, scrollup_goal_metadata = ? WHERE 1=2;

--
-- DELETE template for table 'nullable_optimization_goal_metadata'
--
DELETE FROM nullable_optimization_goal_metadata WHERE 1=2;

