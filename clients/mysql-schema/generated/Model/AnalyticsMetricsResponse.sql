--
-- Pinterest REST API.
-- Prepared SQL queries for 'AnalyticsMetricsResponse' definition.
--


--
-- SELECT template for table `AnalyticsMetricsResponse`
--
SELECT `summary_metrics`, `daily_metrics` FROM `AnalyticsMetricsResponse` WHERE 1;

--
-- INSERT template for table `AnalyticsMetricsResponse`
--
INSERT INTO `AnalyticsMetricsResponse`(`summary_metrics`, `daily_metrics`) VALUES (?, ?);

--
-- UPDATE template for table `AnalyticsMetricsResponse`
--
UPDATE `AnalyticsMetricsResponse` SET `summary_metrics` = ?, `daily_metrics` = ? WHERE 1;

--
-- DELETE template for table `AnalyticsMetricsResponse`
--
DELETE FROM `AnalyticsMetricsResponse` WHERE 0;

