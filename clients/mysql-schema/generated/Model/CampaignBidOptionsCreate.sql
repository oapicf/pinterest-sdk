--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptionsCreate' definition.
--


--
-- SELECT template for table `CampaignBidOptionsCreate`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `CampaignBidOptionsCreate` WHERE 1;

--
-- INSERT template for table `CampaignBidOptionsCreate`
--
INSERT INTO `CampaignBidOptionsCreate`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptionsCreate`
--
UPDATE `CampaignBidOptionsCreate` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `freq_bid_multiplier_time_window` = ?, `frequency_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptionsCreate`
--
DELETE FROM `CampaignBidOptionsCreate` WHERE 0;

