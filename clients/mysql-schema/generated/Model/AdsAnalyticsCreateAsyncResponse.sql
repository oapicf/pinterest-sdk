--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncResponse' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncResponse`
--
SELECT `message`, `report_status`, `token` FROM `AdsAnalyticsCreateAsyncResponse` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncResponse`
--
INSERT INTO `AdsAnalyticsCreateAsyncResponse`(`message`, `report_status`, `token`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncResponse`
--
UPDATE `AdsAnalyticsCreateAsyncResponse` SET `message` = ?, `report_status` = ?, `token` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncResponse`
--
DELETE FROM `AdsAnalyticsCreateAsyncResponse` WHERE 0;

