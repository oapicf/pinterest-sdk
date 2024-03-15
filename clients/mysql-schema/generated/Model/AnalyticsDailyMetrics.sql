--
-- Pinterest REST API.
-- Prepared SQL queries for 'AnalyticsDailyMetrics' definition.
--


--
-- SELECT template for table `AnalyticsDailyMetrics`
--
SELECT `data_status`, `date`, `metrics` FROM `AnalyticsDailyMetrics` WHERE 1;

--
-- INSERT template for table `AnalyticsDailyMetrics`
--
INSERT INTO `AnalyticsDailyMetrics`(`data_status`, `date`, `metrics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AnalyticsDailyMetrics`
--
UPDATE `AnalyticsDailyMetrics` SET `data_status` = ?, `date` = ?, `metrics` = ? WHERE 1;

--
-- DELETE template for table `AnalyticsDailyMetrics`
--
DELETE FROM `AnalyticsDailyMetrics` WHERE 0;

