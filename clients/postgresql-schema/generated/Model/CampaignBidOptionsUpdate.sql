--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignBidOptionsUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_bid_options_update'
--
SELECT age_bucket_multipliers, app_type_multipliers, audience_multipliers, freq_bid_multiplier_time_window, frequency_multipliers, gender_multipliers, placement_multipliers, update_mask FROM campaign_bid_options_update WHERE 1=1;

--
-- INSERT template for table 'campaign_bid_options_update'
--
INSERT INTO campaign_bid_options_update (age_bucket_multipliers, app_type_multipliers, audience_multipliers, freq_bid_multiplier_time_window, frequency_multipliers, gender_multipliers, placement_multipliers, update_mask) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_bid_options_update'
--
UPDATE campaign_bid_options_update SET age_bucket_multipliers = ?, app_type_multipliers = ?, audience_multipliers = ?, freq_bid_multiplier_time_window = ?, frequency_multipliers = ?, gender_multipliers = ?, placement_multipliers = ?, update_mask = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_bid_options_update'
--
DELETE FROM campaign_bid_options_update WHERE 1=2;

