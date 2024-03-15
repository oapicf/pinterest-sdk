--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignResponse' definition.
--


--
-- SELECT template for table `CampaignResponse`
--
SELECT `id`, `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status`, `objective_type`, `created_time`, `updated_time`, `type`, `is_flexible_daily_budgets`, `is_campaign_budget_optimization` FROM `CampaignResponse` WHERE 1;

--
-- INSERT template for table `CampaignResponse`
--
INSERT INTO `CampaignResponse`(`id`, `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status`, `objective_type`, `created_time`, `updated_time`, `type`, `is_flexible_daily_budgets`, `is_campaign_budget_optimization`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignResponse`
--
UPDATE `CampaignResponse` SET `id` = ?, `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `summary_status` = ?, `objective_type` = ?, `created_time` = ?, `updated_time` = ?, `type` = ?, `is_flexible_daily_budgets` = ?, `is_campaign_budget_optimization` = ? WHERE 1;

--
-- DELETE template for table `CampaignResponse`
--
DELETE FROM `CampaignResponse` WHERE 0;

