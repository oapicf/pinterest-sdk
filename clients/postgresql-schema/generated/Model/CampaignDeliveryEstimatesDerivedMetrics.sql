--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignDeliveryEstimatesDerivedMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_delivery_estimates_derived_metrics'
--
SELECT cpc, cpc_lower, cpc_upper, cpm, cpm_lower, cpm_upper, lifetime_frequency, lifetime_frequency_lower, lifetime_frequency_upper, lifetime_impression, lifetime_impression_lower, lifetime_impression_upper, lifetime_reach, lifetime_reach_lower, lifetime_reach_upper, weekly_click, weekly_click_lower, weekly_click_upper, weekly_frequency, weekly_frequency_lower, weekly_frequency_upper, weekly_impression, weekly_impression_lower, weekly_impression_upper, weekly_reach, weekly_reach_lower, weekly_reach_upper FROM campaign_delivery_estimates_derived_metrics WHERE 1=1;

--
-- INSERT template for table 'campaign_delivery_estimates_derived_metrics'
--
INSERT INTO campaign_delivery_estimates_derived_metrics (cpc, cpc_lower, cpc_upper, cpm, cpm_lower, cpm_upper, lifetime_frequency, lifetime_frequency_lower, lifetime_frequency_upper, lifetime_impression, lifetime_impression_lower, lifetime_impression_upper, lifetime_reach, lifetime_reach_lower, lifetime_reach_upper, weekly_click, weekly_click_lower, weekly_click_upper, weekly_frequency, weekly_frequency_lower, weekly_frequency_upper, weekly_impression, weekly_impression_lower, weekly_impression_upper, weekly_reach, weekly_reach_lower, weekly_reach_upper) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_delivery_estimates_derived_metrics'
--
UPDATE campaign_delivery_estimates_derived_metrics SET cpc = ?, cpc_lower = ?, cpc_upper = ?, cpm = ?, cpm_lower = ?, cpm_upper = ?, lifetime_frequency = ?, lifetime_frequency_lower = ?, lifetime_frequency_upper = ?, lifetime_impression = ?, lifetime_impression_lower = ?, lifetime_impression_upper = ?, lifetime_reach = ?, lifetime_reach_lower = ?, lifetime_reach_upper = ?, weekly_click = ?, weekly_click_lower = ?, weekly_click_upper = ?, weekly_frequency = ?, weekly_frequency_lower = ?, weekly_frequency_upper = ?, weekly_impression = ?, weekly_impression_lower = ?, weekly_impression_upper = ?, weekly_reach = ?, weekly_reach_lower = ?, weekly_reach_upper = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_delivery_estimates_derived_metrics'
--
DELETE FROM campaign_delivery_estimates_derived_metrics WHERE 1=2;

