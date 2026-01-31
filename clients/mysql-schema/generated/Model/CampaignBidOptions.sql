--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptions' definition.
--


--
-- SELECT template for table `CampaignBidOptions`
--
SELECT `app_type_multipliers`, `audience_multipliers`, `placement_multipliers` FROM `CampaignBidOptions` WHERE 1;

--
-- INSERT template for table `CampaignBidOptions`
--
INSERT INTO `CampaignBidOptions`(`app_type_multipliers`, `audience_multipliers`, `placement_multipliers`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptions`
--
UPDATE `CampaignBidOptions` SET `app_type_multipliers` = ?, `audience_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptions`
--
DELETE FROM `CampaignBidOptions` WHERE 0;

