--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignResponse' definition.
--


--
-- SELECT template for table `CampaignResponse`
--
SELECT `id`, `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `bid_options`, `created_time`, `is_campaign_budget_optimization`, `is_performance_plus`, `objective_type`, `summary_status`, `type`, `updated_time` FROM `CampaignResponse` WHERE 1;

--
-- INSERT template for table `CampaignResponse`
--
INSERT INTO `CampaignResponse`(`id`, `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `bid_options`, `created_time`, `is_campaign_budget_optimization`, `is_performance_plus`, `objective_type`, `summary_status`, `type`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignResponse`
--
UPDATE `CampaignResponse` SET `id` = ?, `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ?, `bid_options` = ?, `created_time` = ?, `is_campaign_budget_optimization` = ?, `is_performance_plus` = ?, `objective_type` = ?, `summary_status` = ?, `type` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CampaignResponse`
--
DELETE FROM `CampaignResponse` WHERE 0;

