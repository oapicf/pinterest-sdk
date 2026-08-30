--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AnalyticsDailyMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'analytics_daily_metrics'
--
SELECT data_status, "date", metrics FROM analytics_daily_metrics WHERE 1=1;

--
-- INSERT template for table 'analytics_daily_metrics'
--
INSERT INTO analytics_daily_metrics (data_status, "date", metrics) VALUES (?, ?, ?);

--
-- UPDATE template for table 'analytics_daily_metrics'
--
UPDATE analytics_daily_metrics SET data_status = ?, "date" = ?, metrics = ? WHERE 1=2;

--
-- DELETE template for table 'analytics_daily_metrics'
--
DELETE FROM analytics_daily_metrics WHERE 1=2;

