--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignDeliveryEstimatesCampaign' definition.
--


--
-- SELECT template for table `CampaignDeliveryEstimatesCampaign`
--
SELECT `ad_groups`, `budget_duration_type`, `daily_spend_cap`, `end_date`, `lifetime_spend_cap`, `objective_type`, `start_date` FROM `CampaignDeliveryEstimatesCampaign` WHERE 1;

--
-- INSERT template for table `CampaignDeliveryEstimatesCampaign`
--
INSERT INTO `CampaignDeliveryEstimatesCampaign`(`ad_groups`, `budget_duration_type`, `daily_spend_cap`, `end_date`, `lifetime_spend_cap`, `objective_type`, `start_date`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignDeliveryEstimatesCampaign`
--
UPDATE `CampaignDeliveryEstimatesCampaign` SET `ad_groups` = ?, `budget_duration_type` = ?, `daily_spend_cap` = ?, `end_date` = ?, `lifetime_spend_cap` = ?, `objective_type` = ?, `start_date` = ? WHERE 1;

--
-- DELETE template for table `CampaignDeliveryEstimatesCampaign`
--
DELETE FROM `CampaignDeliveryEstimatesCampaign` WHERE 0;

