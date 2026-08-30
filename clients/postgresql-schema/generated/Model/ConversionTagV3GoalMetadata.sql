--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionTagV3GoalMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_tag_v3_goal_metadata'
--
SELECT attribution_windows, conversion_event, conversion_tag_id, cpa_goal_value_in_micro_currency, is_roas_optimized, reporting_event FROM conversion_tag_v3_goal_metadata WHERE 1=1;

--
-- INSERT template for table 'conversion_tag_v3_goal_metadata'
--
INSERT INTO conversion_tag_v3_goal_metadata (attribution_windows, conversion_event, conversion_tag_id, cpa_goal_value_in_micro_currency, is_roas_optimized, reporting_event) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_tag_v3_goal_metadata'
--
UPDATE conversion_tag_v3_goal_metadata SET attribution_windows = ?, conversion_event = ?, conversion_tag_id = ?, cpa_goal_value_in_micro_currency = ?, is_roas_optimized = ?, reporting_event = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_tag_v3_goal_metadata'
--
DELETE FROM conversion_tag_v3_goal_metadata WHERE 1=2;

