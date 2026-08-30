--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptionsUpdate' definition.
--


--
-- SELECT template for table `CampaignBidOptionsUpdate`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers`, `update_mask` FROM `CampaignBidOptionsUpdate` WHERE 1;

--
-- INSERT template for table `CampaignBidOptionsUpdate`
--
INSERT INTO `CampaignBidOptionsUpdate`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptionsUpdate`
--
UPDATE `CampaignBidOptionsUpdate` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `freq_bid_multiplier_time_window` = ?, `frequency_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptionsUpdate`
--
DELETE FROM `CampaignBidOptionsUpdate` WHERE 0;

