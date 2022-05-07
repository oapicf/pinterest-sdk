--
-- Pinterest REST API.
-- Prepared SQL queries for 'AnalyticsMetricsResponse_daily_metrics' definition.
--


--
-- SELECT template for table `AnalyticsMetricsResponse_daily_metrics`
--
SELECT `data_status`, `date`, `metrics` FROM `AnalyticsMetricsResponse_daily_metrics` WHERE 1;

--
-- INSERT template for table `AnalyticsMetricsResponse_daily_metrics`
--
INSERT INTO `AnalyticsMetricsResponse_daily_metrics`(`data_status`, `date`, `metrics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AnalyticsMetricsResponse_daily_metrics`
--
UPDATE `AnalyticsMetricsResponse_daily_metrics` SET `data_status` = ?, `date` = ?, `metrics` = ? WHERE 1;

--
-- DELETE template for table `AnalyticsMetricsResponse_daily_metrics`
--
DELETE FROM `AnalyticsMetricsResponse_daily_metrics` WHERE 0;

