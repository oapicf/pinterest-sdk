--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AnalyticsMetricsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'analytics_metrics_response'
--
SELECT daily_metrics, summary_metrics FROM analytics_metrics_response WHERE 1=1;

--
-- INSERT template for table 'analytics_metrics_response'
--
INSERT INTO analytics_metrics_response (daily_metrics, summary_metrics) VALUES (?, ?);

--
-- UPDATE template for table 'analytics_metrics_response'
--
UPDATE analytics_metrics_response SET daily_metrics = ?, summary_metrics = ? WHERE 1=2;

--
-- DELETE template for table 'analytics_metrics_response'
--
DELETE FROM analytics_metrics_response WHERE 1=2;

