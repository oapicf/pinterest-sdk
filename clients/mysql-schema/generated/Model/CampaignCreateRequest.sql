--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateRequest' definition.
--


--
-- SELECT template for table `CampaignCreateRequest`
--
SELECT `bid_options`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `status`, `ad_account_id`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `tracking_urls` FROM `CampaignCreateRequest` WHERE 1;

--
-- INSERT template for table `CampaignCreateRequest`
--
INSERT INTO `CampaignCreateRequest`(`bid_options`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `status`, `ad_account_id`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateRequest`
--
UPDATE `CampaignCreateRequest` SET `bid_options` = ?, `intended_promotion_type` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_flexible_daily_budgets` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `objective_type` = ?, `status` = ?, `ad_account_id` = ?, `daily_spend_cap` = ?, `default_ad_group_budget_in_micro_currency` = ?, `end_time` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateRequest`
--
DELETE FROM `CampaignCreateRequest` WHERE 0;

