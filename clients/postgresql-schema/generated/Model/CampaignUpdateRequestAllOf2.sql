--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignUpdateRequestAllOf2' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_update_request_all_of2'
--
SELECT bid_options, intended_promotion_type, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type FROM campaign_update_request_all_of2 WHERE 1=1;

--
-- INSERT template for table 'campaign_update_request_all_of2'
--
INSERT INTO campaign_update_request_all_of2 (bid_options, intended_promotion_type, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_update_request_all_of2'
--
UPDATE campaign_update_request_all_of2 SET bid_options = ?, intended_promotion_type = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, objective_type = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_update_request_all_of2'
--
DELETE FROM campaign_update_request_all_of2 WHERE 1=2;

