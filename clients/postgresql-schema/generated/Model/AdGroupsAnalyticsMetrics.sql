--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupsAnalyticsMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_groups_analytics_metrics'
--
SELECT ad_group_id, "date" FROM ad_groups_analytics_metrics WHERE 1=1;

--
-- INSERT template for table 'ad_groups_analytics_metrics'
--
INSERT INTO ad_groups_analytics_metrics (ad_group_id, "date") VALUES (?, ?);

--
-- UPDATE template for table 'ad_groups_analytics_metrics'
--
UPDATE ad_groups_analytics_metrics SET ad_group_id = ?, "date" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_groups_analytics_metrics'
--
DELETE FROM ad_groups_analytics_metrics WHERE 1=2;

