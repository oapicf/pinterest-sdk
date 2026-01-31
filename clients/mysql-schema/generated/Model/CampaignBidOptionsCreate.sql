--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptionsCreate' definition.
--


--
-- SELECT template for table `CampaignBidOptionsCreate`
--
SELECT `app_type_multipliers`, `audience_multipliers`, `placement_multipliers` FROM `CampaignBidOptionsCreate` WHERE 1;

--
-- INSERT template for table `CampaignBidOptionsCreate`
--
INSERT INTO `CampaignBidOptionsCreate`(`app_type_multipliers`, `audience_multipliers`, `placement_multipliers`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptionsCreate`
--
UPDATE `CampaignBidOptionsCreate` SET `app_type_multipliers` = ?, `audience_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptionsCreate`
--
DELETE FROM `CampaignBidOptionsCreate` WHERE 0;

