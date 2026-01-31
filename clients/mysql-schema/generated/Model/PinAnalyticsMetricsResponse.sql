--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinAnalyticsMetricsResponse' definition.
--


--
-- SELECT template for table `PinAnalyticsMetricsResponse`
--
SELECT `daily_metrics`, `lifetime_metrics`, `summary_metrics` FROM `PinAnalyticsMetricsResponse` WHERE 1;

--
-- INSERT template for table `PinAnalyticsMetricsResponse`
--
INSERT INTO `PinAnalyticsMetricsResponse`(`daily_metrics`, `lifetime_metrics`, `summary_metrics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinAnalyticsMetricsResponse`
--
UPDATE `PinAnalyticsMetricsResponse` SET `daily_metrics` = ?, `lifetime_metrics` = ?, `summary_metrics` = ? WHERE 1;

--
-- DELETE template for table `PinAnalyticsMetricsResponse`
--
DELETE FROM `PinAnalyticsMetricsResponse` WHERE 0;

