--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkCampaignDeliveryEstimatesItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_campaign_delivery_estimates_item'
--
SELECT adgroup_audience_sizes, conversion_rate, conversion_rates, curves, derived_metrics, errors, estimate_id, max_potential_spend FROM bulk_campaign_delivery_estimates_item WHERE 1=1;

--
-- INSERT template for table 'bulk_campaign_delivery_estimates_item'
--
INSERT INTO bulk_campaign_delivery_estimates_item (adgroup_audience_sizes, conversion_rate, conversion_rates, curves, derived_metrics, errors, estimate_id, max_potential_spend) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_campaign_delivery_estimates_item'
--
UPDATE bulk_campaign_delivery_estimates_item SET adgroup_audience_sizes = ?, conversion_rate = ?, conversion_rates = ?, curves = ?, derived_metrics = ?, errors = ?, estimate_id = ?, max_potential_spend = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_campaign_delivery_estimates_item'
--
DELETE FROM bulk_campaign_delivery_estimates_item WHERE 1=2;

