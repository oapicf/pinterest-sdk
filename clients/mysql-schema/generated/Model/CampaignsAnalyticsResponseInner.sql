--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignsAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `CampaignsAnalyticsResponse_inner`
--
SELECT `CAMPAIGN_ID`, `DATE` FROM `CampaignsAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `CampaignsAnalyticsResponse_inner`
--
INSERT INTO `CampaignsAnalyticsResponse_inner`(`CAMPAIGN_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignsAnalyticsResponse_inner`
--
UPDATE `CampaignsAnalyticsResponse_inner` SET `CAMPAIGN_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `CampaignsAnalyticsResponse_inner`
--
DELETE FROM `CampaignsAnalyticsResponse_inner` WHERE 0;

