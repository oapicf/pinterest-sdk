--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsAnalyticsMetricsFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_analytics_metrics_filter'
--
SELECT field, "operator", "values" FROM ads_analytics_metrics_filter WHERE 1=1;

--
-- INSERT template for table 'ads_analytics_metrics_filter'
--
INSERT INTO ads_analytics_metrics_filter (field, "operator", "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'ads_analytics_metrics_filter'
--
UPDATE ads_analytics_metrics_filter SET field = ?, "operator" = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'ads_analytics_metrics_filter'
--
DELETE FROM ads_analytics_metrics_filter WHERE 1=2;

