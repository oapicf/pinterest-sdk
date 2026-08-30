--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningConversionRate' definition.
--


--
-- SELECT template for table `CampaignPlanningConversionRate`
--
SELECT `attribution_windows`, `conversion_event`, `conversion_rate` FROM `CampaignPlanningConversionRate` WHERE 1;

--
-- INSERT template for table `CampaignPlanningConversionRate`
--
INSERT INTO `CampaignPlanningConversionRate`(`attribution_windows`, `conversion_event`, `conversion_rate`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningConversionRate`
--
UPDATE `CampaignPlanningConversionRate` SET `attribution_windows` = ?, `conversion_event` = ?, `conversion_rate` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningConversionRate`
--
DELETE FROM `CampaignPlanningConversionRate` WHERE 0;

