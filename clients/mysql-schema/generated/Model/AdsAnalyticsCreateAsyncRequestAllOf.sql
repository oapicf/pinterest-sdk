--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest_allOf' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncRequest_allOf`
--
SELECT `start_date`, `end_date`, `granularity`, `click_window_days`, `engagement_window_days`, `view_window_days`, `conversion_report_time`, `attribution_types` FROM `AdsAnalyticsCreateAsyncRequest_allOf` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncRequest_allOf`
--
INSERT INTO `AdsAnalyticsCreateAsyncRequest_allOf`(`start_date`, `end_date`, `granularity`, `click_window_days`, `engagement_window_days`, `view_window_days`, `conversion_report_time`, `attribution_types`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncRequest_allOf`
--
UPDATE `AdsAnalyticsCreateAsyncRequest_allOf` SET `start_date` = ?, `end_date` = ?, `granularity` = ?, `click_window_days` = ?, `engagement_window_days` = ?, `view_window_days` = ?, `conversion_report_time` = ?, `attribution_types` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncRequest_allOf`
--
DELETE FROM `AdsAnalyticsCreateAsyncRequest_allOf` WHERE 0;

