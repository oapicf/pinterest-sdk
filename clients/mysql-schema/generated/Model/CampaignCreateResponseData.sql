--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateResponseData' definition.
--


--
-- SELECT template for table `CampaignCreateResponseData`
--
SELECT `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `id`, `objective_type`, `created_time`, `updated_time`, `type`, `is_campaign_budget_optimization`, `summary_status` FROM `CampaignCreateResponseData` WHERE 1;

--
-- INSERT template for table `CampaignCreateResponseData`
--
INSERT INTO `CampaignCreateResponseData`(`ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `id`, `objective_type`, `created_time`, `updated_time`, `type`, `is_campaign_budget_optimization`, `summary_status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateResponseData`
--
UPDATE `CampaignCreateResponseData` SET `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `is_flexible_daily_budgets` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_automated_campaign` = ?, `id` = ?, `objective_type` = ?, `created_time` = ?, `updated_time` = ?, `type` = ?, `is_campaign_budget_optimization` = ?, `summary_status` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateResponseData`
--
DELETE FROM `CampaignCreateResponseData` WHERE 0;

