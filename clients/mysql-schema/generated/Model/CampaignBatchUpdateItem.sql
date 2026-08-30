--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBatchUpdateItem' definition.
--


--
-- SELECT template for table `CampaignBatchUpdateItem`
--
SELECT `ad_account_id`, `app_id`, `app_platform`, `bid_options`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `performance_plus_campaign_settings`, `start_time`, `status`, `tracking_urls` FROM `CampaignBatchUpdateItem` WHERE 1;

--
-- INSERT template for table `CampaignBatchUpdateItem`
--
INSERT INTO `CampaignBatchUpdateItem`(`ad_account_id`, `app_id`, `app_platform`, `bid_options`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `performance_plus_campaign_settings`, `start_time`, `status`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBatchUpdateItem`
--
UPDATE `CampaignBatchUpdateItem` SET `ad_account_id` = ?, `app_id` = ?, `app_platform` = ?, `bid_options` = ?, `daily_spend_cap` = ?, `default_ad_group_budget_in_micro_currency` = ?, `end_time` = ?, `id` = ?, `intended_promotion_type` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_flexible_daily_budgets` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `lifetime_spend_cap` = ?, `name` = ?, `objective_type` = ?, `order_line_id` = ?, `performance_plus_campaign_settings` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `CampaignBatchUpdateItem`
--
DELETE FROM `CampaignBatchUpdateItem` WHERE 0;

