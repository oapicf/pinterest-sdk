--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinAnalyticsMetricsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_analytics_metrics_response'
--
SELECT daily_metrics, lifetime_metrics, summary_metrics FROM pin_analytics_metrics_response WHERE 1=1;

--
-- INSERT template for table 'pin_analytics_metrics_response'
--
INSERT INTO pin_analytics_metrics_response (daily_metrics, lifetime_metrics, summary_metrics) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pin_analytics_metrics_response'
--
UPDATE pin_analytics_metrics_response SET daily_metrics = ?, lifetime_metrics = ?, summary_metrics = ? WHERE 1=2;

--
-- DELETE template for table 'pin_analytics_metrics_response'
--
DELETE FROM pin_analytics_metrics_response WHERE 1=2;

