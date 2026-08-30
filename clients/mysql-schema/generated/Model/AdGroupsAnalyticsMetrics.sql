--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupsAnalyticsMetrics' definition.
--


--
-- SELECT template for table `AdGroupsAnalyticsMetrics`
--
SELECT `AD_GROUP_ID`, `DATE` FROM `AdGroupsAnalyticsMetrics` WHERE 1;

--
-- INSERT template for table `AdGroupsAnalyticsMetrics`
--
INSERT INTO `AdGroupsAnalyticsMetrics`(`AD_GROUP_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupsAnalyticsMetrics`
--
UPDATE `AdGroupsAnalyticsMetrics` SET `AD_GROUP_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdGroupsAnalyticsMetrics`
--
DELETE FROM `AdGroupsAnalyticsMetrics` WHERE 0;

