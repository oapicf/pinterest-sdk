--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupsAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `AdGroupsAnalyticsResponse_inner`
--
SELECT `AD_GROUP_ID`, `DATE` FROM `AdGroupsAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `AdGroupsAnalyticsResponse_inner`
--
INSERT INTO `AdGroupsAnalyticsResponse_inner`(`AD_GROUP_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupsAnalyticsResponse_inner`
--
UPDATE `AdGroupsAnalyticsResponse_inner` SET `AD_GROUP_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdGroupsAnalyticsResponse_inner`
--
DELETE FROM `AdGroupsAnalyticsResponse_inner` WHERE 0;

