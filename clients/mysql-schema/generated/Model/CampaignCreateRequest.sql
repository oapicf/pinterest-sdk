--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateRequest' definition.
--


--
-- SELECT template for table `CampaignCreateRequest`
--
SELECT `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `bid_options`, `is_performance_plus`, `objective_type` FROM `CampaignCreateRequest` WHERE 1;

--
-- INSERT template for table `CampaignCreateRequest`
--
INSERT INTO `CampaignCreateRequest`(`ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `bid_options`, `is_performance_plus`, `objective_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateRequest`
--
UPDATE `CampaignCreateRequest` SET `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_campaign_budget_optimization` = ?, `bid_options` = ?, `is_performance_plus` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateRequest`
--
DELETE FROM `CampaignCreateRequest` WHERE 0;

