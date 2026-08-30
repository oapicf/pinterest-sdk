--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignBatchResponseData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_batch_response_data'
--
SELECT ad_account_id, bid_options, created_time, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_carting, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, lifetime_spend_cap, "name", objective_type, order_line_id, performance_plus_campaign_settings, start_time, status, summary_status, tracking_urls, "type", updated_time FROM campaign_batch_response_data WHERE 1=1;

--
-- INSERT template for table 'campaign_batch_response_data'
--
INSERT INTO campaign_batch_response_data (ad_account_id, bid_options, created_time, daily_spend_cap, default_ad_group_budget_in_micro_currency, end_time, "id", intended_promotion_type, is_automated_campaign, is_campaign_budget_optimization, is_carting, is_flexible_daily_budgets, is_ltv_optimized, is_performance_plus, is_top_of_search, lifetime_spend_cap, "name", objective_type, order_line_id, performance_plus_campaign_settings, start_time, status, summary_status, tracking_urls, "type", updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_batch_response_data'
--
UPDATE campaign_batch_response_data SET ad_account_id = ?, bid_options = ?, created_time = ?, daily_spend_cap = ?, default_ad_group_budget_in_micro_currency = ?, end_time = ?, "id" = ?, intended_promotion_type = ?, is_automated_campaign = ?, is_campaign_budget_optimization = ?, is_carting = ?, is_flexible_daily_budgets = ?, is_ltv_optimized = ?, is_performance_plus = ?, is_top_of_search = ?, lifetime_spend_cap = ?, "name" = ?, objective_type = ?, order_line_id = ?, performance_plus_campaign_settings = ?, start_time = ?, status = ?, summary_status = ?, tracking_urls = ?, "type" = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_batch_response_data'
--
DELETE FROM campaign_batch_response_data WHERE 1=2;

