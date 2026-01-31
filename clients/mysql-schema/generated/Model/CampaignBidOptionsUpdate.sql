--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptionsUpdate' definition.
--


--
-- SELECT template for table `CampaignBidOptionsUpdate`
--
SELECT `app_type_multipliers`, `audience_multipliers`, `placement_multipliers`, `update_mask` FROM `CampaignBidOptionsUpdate` WHERE 1;

--
-- INSERT template for table `CampaignBidOptionsUpdate`
--
INSERT INTO `CampaignBidOptionsUpdate`(`app_type_multipliers`, `audience_multipliers`, `placement_multipliers`, `update_mask`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptionsUpdate`
--
UPDATE `CampaignBidOptionsUpdate` SET `app_type_multipliers` = ?, `audience_multipliers` = ?, `placement_multipliers` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptionsUpdate`
--
DELETE FROM `CampaignBidOptionsUpdate` WHERE 0;

