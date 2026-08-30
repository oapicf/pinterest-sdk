--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignBidOptionsCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_bid_options_create'
--
SELECT age_bucket_multipliers, app_type_multipliers, audience_multipliers, freq_bid_multiplier_time_window, frequency_multipliers, gender_multipliers, placement_multipliers FROM campaign_bid_options_create WHERE 1=1;

--
-- INSERT template for table 'campaign_bid_options_create'
--
INSERT INTO campaign_bid_options_create (age_bucket_multipliers, app_type_multipliers, audience_multipliers, freq_bid_multiplier_time_window, frequency_multipliers, gender_multipliers, placement_multipliers) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_bid_options_create'
--
UPDATE campaign_bid_options_create SET age_bucket_multipliers = ?, app_type_multipliers = ?, audience_multipliers = ?, freq_bid_multiplier_time_window = ?, frequency_multipliers = ?, gender_multipliers = ?, placement_multipliers = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_bid_options_create'
--
DELETE FROM campaign_bid_options_create WHERE 1=2;

