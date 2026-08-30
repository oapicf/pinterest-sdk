--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignBatchUpdateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_batch_update_item'
--
SELECT ad_account_id, app_id, app_platform, bid_options, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, lifetime_spend_cap, "name", objective_type, order_line_id, performance_plus_campaign_settings, start_time, status, tracking_urls FROM campaign_batch_update_item WHERE 1=1;

--
-- INSERT template for table 'campaign_batch_update_item'
--
INSERT INTO campaign_batch_update_item (ad_account_id, app_id, app_platform, bid_options, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, lifetime_spend_cap, "name", objective_type, order_line_id, performance_plus_campaign_settings, start_time, status, tracking_urls) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_batch_update_item'
--
UPDATE campaign_batch_update_item SET ad_account_id = ?, app_id = ?, app_platform = ?, bid_options = ?, daily_spend_cap = ?, default_ad_group_budget_in_micro_currency = ?, end_time = ?, "id" = ?, intended_promotion_type = ?, is_automated_campaign = ?, is_campaign_budget_optimization = ?, is_flexible_daily_budgets = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, lifetime_spend_cap = ?, "name" = ?, objective_type = ?, order_line_id = ?, performance_plus_campaign_settings = ?, start_time = ?, status = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_batch_update_item'
--
DELETE FROM campaign_batch_update_item WHERE 1=2;

