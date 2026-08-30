--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateItem' definition.
--


--
-- SELECT template for table `CampaignCreateItem`
--
SELECT `ad_account_id`, `app_id`, `app_platform`, `bid_options`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `start_time`, `status`, `tracking_urls` FROM `CampaignCreateItem` WHERE 1;

--
-- INSERT template for table `CampaignCreateItem`
--
INSERT INTO `CampaignCreateItem`(`ad_account_id`, `app_id`, `app_platform`, `bid_options`, `daily_spend_cap`, `default_ad_group_budget_in_micro_currency`, `end_time`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `lifetime_spend_cap`, `name`, `objective_type`, `order_line_id`, `start_time`, `status`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateItem`
--
UPDATE `CampaignCreateItem` SET `ad_account_id` = ?, `app_id` = ?, `app_platform` = ?, `bid_options` = ?, `daily_spend_cap` = ?, `default_ad_group_budget_in_micro_currency` = ?, `end_time` = ?, `intended_promotion_type` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_flexible_daily_budgets` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `lifetime_spend_cap` = ?, `name` = ?, `objective_type` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateItem`
--
DELETE FROM `CampaignCreateItem` WHERE 0;

