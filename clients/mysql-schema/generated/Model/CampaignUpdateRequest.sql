--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignUpdateRequest' definition.
--


--
-- SELECT template for table `CampaignUpdateRequest`
--
SELECT `id`, `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `bid_options`, `is_performance_plus`, `objective_type` FROM `CampaignUpdateRequest` WHERE 1;

--
-- INSERT template for table `CampaignUpdateRequest`
--
INSERT INTO `CampaignUpdateRequest`(`id`, `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`, `bid_options`, `is_performance_plus`, `objective_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignUpdateRequest`
--
UPDATE `CampaignUpdateRequest` SET `id` = ?, `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_campaign_budget_optimization` = ?, `bid_options` = ?, `is_performance_plus` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `CampaignUpdateRequest`
--
DELETE FROM `CampaignUpdateRequest` WHERE 0;

