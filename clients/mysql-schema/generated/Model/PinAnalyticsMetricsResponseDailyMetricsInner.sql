--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinAnalyticsMetricsResponse_daily_metrics_inner' definition.
--


--
-- SELECT template for table `PinAnalyticsMetricsResponse_daily_metrics_inner`
--
SELECT `data_status`, `date`, `metrics` FROM `PinAnalyticsMetricsResponse_daily_metrics_inner` WHERE 1;

--
-- INSERT template for table `PinAnalyticsMetricsResponse_daily_metrics_inner`
--
INSERT INTO `PinAnalyticsMetricsResponse_daily_metrics_inner`(`data_status`, `date`, `metrics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinAnalyticsMetricsResponse_daily_metrics_inner`
--
UPDATE `PinAnalyticsMetricsResponse_daily_metrics_inner` SET `data_status` = ?, `date` = ?, `metrics` = ? WHERE 1;

--
-- DELETE template for table `PinAnalyticsMetricsResponse_daily_metrics_inner`
--
DELETE FROM `PinAnalyticsMetricsResponse_daily_metrics_inner` WHERE 0;

