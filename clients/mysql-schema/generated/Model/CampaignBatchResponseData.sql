--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBatchResponseData' definition.
--


--
-- SELECT template for table `CampaignBatchResponseData`
--
SELECT `ad_account_id`, `bid_options`, `created_time`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_carting`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `performance_plus_campaign_settings`, `start_time`, `status`, `summary_status`, `tracking_urls`, `type`, `updated_time` FROM `CampaignBatchResponseData` WHERE 1;

--
-- INSERT template for table `CampaignBatchResponseData`
--
INSERT INTO `CampaignBatchResponseData`(`ad_account_id`, `bid_options`, `created_time`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_carting`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `performance_plus_campaign_settings`, `start_time`, `status`, `summary_status`, `tracking_urls`, `type`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignBatchResponseData`
--
UPDATE `CampaignBatchResponseData` SET `ad_account_id` = ?, `bid_options` = ?, `created_time` = ?, `daily_spend_cap` = ?, `default_ad_group_budget_in_micro_currency` = ?, `end_time` = ?, `id` = ?, `intended_promotion_type` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_carting` = ?, `is_flexible_daily_budgets` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `lifetime_spend_cap` = ?, `name` = ?, `objective_type` = ?, `order_line_id` = ?, `performance_plus_campaign_settings` = ?, `start_time` = ?, `status` = ?, `summary_status` = ?, `tracking_urls` = ?, `type` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CampaignBatchResponseData`
--
DELETE FROM `CampaignBatchResponseData` WHERE 0;

