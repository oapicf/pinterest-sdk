--
-- Pinterest REST API.
-- Prepared SQL queries for 'AnalyticsMetricsResponse' definition.
--


--
-- SELECT template for table `AnalyticsMetricsResponse`
--
SELECT `daily_metrics`, `summary_metrics` FROM `AnalyticsMetricsResponse` WHERE 1;

--
-- INSERT template for table `AnalyticsMetricsResponse`
--
INSERT INTO `AnalyticsMetricsResponse`(`daily_metrics`, `summary_metrics`) VALUES (?, ?);

--
-- UPDATE template for table `AnalyticsMetricsResponse`
--
UPDATE `AnalyticsMetricsResponse` SET `daily_metrics` = ?, `summary_metrics` = ? WHERE 1;

--
-- DELETE template for table `AnalyticsMetricsResponse`
--
DELETE FROM `AnalyticsMetricsResponse` WHERE 0;

