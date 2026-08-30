--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningConversionAttribution' definition.
--


--
-- SELECT template for table `CampaignPlanningConversionAttribution`
--
SELECT `click_window_days`, `engagement_window_days`, `view_window_days` FROM `CampaignPlanningConversionAttribution` WHERE 1;

--
-- INSERT template for table `CampaignPlanningConversionAttribution`
--
INSERT INTO `CampaignPlanningConversionAttribution`(`click_window_days`, `engagement_window_days`, `view_window_days`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningConversionAttribution`
--
UPDATE `CampaignPlanningConversionAttribution` SET `click_window_days` = ?, `engagement_window_days` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningConversionAttribution`
--
DELETE FROM `CampaignPlanningConversionAttribution` WHERE 0;

