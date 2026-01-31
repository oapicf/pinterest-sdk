--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateResponseData' definition.
--


--
-- SELECT template for table `CampaignCreateResponseData`
--
SELECT `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `id`, `bid_options`, `created_time`, `is_performance_plus`, `objective_type`, `summary_status`, `type`, `updated_time` FROM `CampaignCreateResponseData` WHERE 1;

--
-- INSERT template for table `CampaignCreateResponseData`
--
INSERT INTO `CampaignCreateResponseData`(`ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `id`, `bid_options`, `created_time`, `is_performance_plus`, `objective_type`, `summary_status`, `type`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateResponseData`
--
UPDATE `CampaignCreateResponseData` SET `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_campaign_budget_optimization` = ?, `id` = ?, `bid_options` = ?, `created_time` = ?, `is_performance_plus` = ?, `objective_type` = ?, `summary_status` = ?, `type` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateResponseData`
--
DELETE FROM `CampaignCreateResponseData` WHERE 0;

