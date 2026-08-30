--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinAnalyticsDailyMetrics' definition.
--


--
-- SELECT template for table `PinAnalyticsDailyMetrics`
--
SELECT `data_status`, `date`, `metrics` FROM `PinAnalyticsDailyMetrics` WHERE 1;

--
-- INSERT template for table `PinAnalyticsDailyMetrics`
--
INSERT INTO `PinAnalyticsDailyMetrics`(`data_status`, `date`, `metrics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinAnalyticsDailyMetrics`
--
UPDATE `PinAnalyticsDailyMetrics` SET `data_status` = ?, `date` = ?, `metrics` = ? WHERE 1;

--
-- DELETE template for table `PinAnalyticsDailyMetrics`
--
DELETE FROM `PinAnalyticsDailyMetrics` WHERE 0;

