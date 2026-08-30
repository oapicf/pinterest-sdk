--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBidOptions' definition.
--


--
-- SELECT template for table `CampaignBidOptions`
--
SELECT `age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers` FROM `CampaignBidOptions` WHERE 1;

--
-- INSERT template for table `CampaignBidOptions`
--
INSERT INTO `CampaignBidOptions`(`age_bucket_multipliers`, `app_type_multipliers`, `audience_multipliers`, `freq_bid_multiplier_time_window`, `frequency_multipliers`, `gender_multipliers`, `placement_multipliers`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBidOptions`
--
UPDATE `CampaignBidOptions` SET `age_bucket_multipliers` = ?, `app_type_multipliers` = ?, `audience_multipliers` = ?, `freq_bid_multiplier_time_window` = ?, `frequency_multipliers` = ?, `gender_multipliers` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `CampaignBidOptions`
--
DELETE FROM `CampaignBidOptions` WHERE 0;

