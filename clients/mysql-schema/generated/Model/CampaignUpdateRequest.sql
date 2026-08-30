--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignUpdateRequest' definition.
--


--
-- SELECT template for table `CampaignUpdateRequest`
--
SELECT `bid_options`, `intended_promotion_type`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `ad_account_id`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls` FROM `CampaignUpdateRequest` WHERE 1;

--
-- INSERT template for table `CampaignUpdateRequest`
--
INSERT INTO `CampaignUpdateRequest`(`bid_options`, `intended_promotion_type`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `ad_account_id`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `id`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignUpdateRequest`
--
UPDATE `CampaignUpdateRequest` SET `bid_options` = ?, `intended_promotion_type` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `objective_type` = ?, `ad_account_id` = ?, `daily_spend_cap` = ?, `default_ad_group_budget_in_micro_currency` = ?, `end_time` = ?, `id` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `CampaignUpdateRequest`
--
DELETE FROM `CampaignUpdateRequest` WHERE 0;

