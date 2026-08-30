--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_create_request'
--
SELECT bid_options, intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, status, ad_account_id, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, lifetime_spend_cap, "name", order_line_id, start_time, tracking_urls FROM campaign_create_request WHERE 1=1;

--
-- INSERT template for table 'campaign_create_request'
--
INSERT INTO campaign_create_request (bid_options, intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, status, ad_account_id, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, lifetime_spend_cap, "name", order_line_id, start_time, tracking_urls) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_create_request'
--
UPDATE campaign_create_request SET bid_options = ?, intended_promotion_type = ?, is_automated_campaign = ?, is_campaign_budget_optimization = ?, is_flexible_daily_budgets = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, objective_type = ?, status = ?, ad_account_id = ?, daily_spend_cap = ?, default_ad_group_budget_in_micro_currency = ?, end_time = ?, lifetime_spend_cap = ?, "name" = ?, order_line_id = ?, start_time = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_create_request'
--
DELETE FROM campaign_create_request WHERE 1=2;

