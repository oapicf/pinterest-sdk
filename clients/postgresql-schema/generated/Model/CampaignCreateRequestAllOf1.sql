--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignCreateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_create_request_all_of1'
--
SELECT bid_options, intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, status FROM campaign_create_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'campaign_create_request_all_of1'
--
INSERT INTO campaign_create_request_all_of1 (bid_options, intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_create_request_all_of1'
--
UPDATE campaign_create_request_all_of1 SET bid_options = ?, intended_promotion_type = ?, is_automated_campaign = ?, is_campaign_budget_optimization = ?, is_flexible_daily_budgets = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, objective_type = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_create_request_all_of1'
--
DELETE FROM campaign_create_request_all_of1 WHERE 1=2;

