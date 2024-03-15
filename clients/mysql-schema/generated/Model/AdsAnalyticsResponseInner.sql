--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `AdsAnalyticsResponse_inner`
--
SELECT `AD_ID`, `DATE` FROM `AdsAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsResponse_inner`
--
INSERT INTO `AdsAnalyticsResponse_inner`(`AD_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdsAnalyticsResponse_inner`
--
UPDATE `AdsAnalyticsResponse_inner` SET `AD_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsResponse_inner`
--
DELETE FROM `AdsAnalyticsResponse_inner` WHERE 0;

