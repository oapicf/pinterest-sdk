--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignDeliveryEstimatesResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_delivery_estimates_response'
--
SELECT curves, derived_metrics, max_potential_spend FROM campaign_delivery_estimates_response WHERE 1=1;

--
-- INSERT template for table 'campaign_delivery_estimates_response'
--
INSERT INTO campaign_delivery_estimates_response (curves, derived_metrics, max_potential_spend) VALUES (?, ?, ?);

--
-- UPDATE template for table 'campaign_delivery_estimates_response'
--
UPDATE campaign_delivery_estimates_response SET curves = ?, derived_metrics = ?, max_potential_spend = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_delivery_estimates_response'
--
DELETE FROM campaign_delivery_estimates_response WHERE 1=2;

