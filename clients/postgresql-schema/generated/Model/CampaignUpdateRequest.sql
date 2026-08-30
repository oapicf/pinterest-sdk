--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_update_request'
--
SELECT bid_options, intended_promotion_type, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, ad_account_id, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, lifetime_spend_cap, "name", order_line_id, start_time, status, tracking_urls FROM campaign_update_request WHERE 1=1;

--
-- INSERT template for table 'campaign_update_request'
--
INSERT INTO campaign_update_request (bid_options, intended_promotion_type, is_ltv_optimized, is_performance_plus, is_top_of_search, objective_type, ad_account_id, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, lifetime_spend_cap, "name", order_line_id, start_time, status, tracking_urls) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_update_request'
--
UPDATE campaign_update_request SET bid_options = ?, intended_promotion_type = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, objective_type = ?, ad_account_id = ?, daily_spend_cap = ?, default_ad_group_budget_in_micro_currency = ?, end_time = ?, "id" = ?, is_automated_campaign = ?, is_campaign_budget_optimization = ?, is_flexible_daily_budgets = ?, lifetime_spend_cap = ?, "name" = ?, order_line_id = ?, start_time = ?, status = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_update_request'
--
DELETE FROM campaign_update_request WHERE 1=2;

