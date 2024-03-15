--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `AdAccountAnalyticsResponse_inner`
--
SELECT `AD_ACCOUNT_ID`, `DATE` FROM `AdAccountAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `AdAccountAnalyticsResponse_inner`
--
INSERT INTO `AdAccountAnalyticsResponse_inner`(`AD_ACCOUNT_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdAccountAnalyticsResponse_inner`
--
UPDATE `AdAccountAnalyticsResponse_inner` SET `AD_ACCOUNT_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdAccountAnalyticsResponse_inner`
--
DELETE FROM `AdAccountAnalyticsResponse_inner` WHERE 0;

