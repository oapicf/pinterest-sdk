--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignDeliveryEstimatesCampaign' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_delivery_estimates_campaign'
--
SELECT ad_groups, budget_duration_type, daily_spend_cap, end_date, lifetime_spend_cap, objective_type, start_date FROM campaign_delivery_estimates_campaign WHERE 1=1;

--
-- INSERT template for table 'campaign_delivery_estimates_campaign'
--
INSERT INTO campaign_delivery_estimates_campaign (ad_groups, budget_duration_type, daily_spend_cap, end_date, lifetime_spend_cap, objective_type, start_date) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_delivery_estimates_campaign'
--
UPDATE campaign_delivery_estimates_campaign SET ad_groups = ?, budget_duration_type = ?, daily_spend_cap = ?, end_date = ?, lifetime_spend_cap = ?, objective_type = ?, start_date = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_delivery_estimates_campaign'
--
DELETE FROM campaign_delivery_estimates_campaign WHERE 1=2;

