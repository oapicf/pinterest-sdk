--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncResponse' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncResponse`
--
SELECT `report_status`, `token`, `message` FROM `AdsAnalyticsCreateAsyncResponse` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncResponse`
--
INSERT INTO `AdsAnalyticsCreateAsyncResponse`(`report_status`, `token`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncResponse`
--
UPDATE `AdsAnalyticsCreateAsyncResponse` SET `report_status` = ?, `token` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncResponse`
--
DELETE FROM `AdsAnalyticsCreateAsyncResponse` WHERE 0;

