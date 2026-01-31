--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsGetAsyncResponse' definition.
--


--
-- SELECT template for table `AdsAnalyticsGetAsyncResponse`
--
SELECT `report_status`, `size`, `url` FROM `AdsAnalyticsGetAsyncResponse` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsGetAsyncResponse`
--
INSERT INTO `AdsAnalyticsGetAsyncResponse`(`report_status`, `size`, `url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsGetAsyncResponse`
--
UPDATE `AdsAnalyticsGetAsyncResponse` SET `report_status` = ?, `size` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsGetAsyncResponse`
--
DELETE FROM `AdsAnalyticsGetAsyncResponse` WHERE 0;

