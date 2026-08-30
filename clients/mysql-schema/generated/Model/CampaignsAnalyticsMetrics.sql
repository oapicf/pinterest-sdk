--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignsAnalyticsMetrics' definition.
--


--
-- SELECT template for table `CampaignsAnalyticsMetrics`
--
SELECT `CAMPAIGN_ID`, `DATE` FROM `CampaignsAnalyticsMetrics` WHERE 1;

--
-- INSERT template for table `CampaignsAnalyticsMetrics`
--
INSERT INTO `CampaignsAnalyticsMetrics`(`CAMPAIGN_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignsAnalyticsMetrics`
--
UPDATE `CampaignsAnalyticsMetrics` SET `CAMPAIGN_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `CampaignsAnalyticsMetrics`
--
DELETE FROM `CampaignsAnalyticsMetrics` WHERE 0;

