--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateCommon' definition.
--


--
-- SELECT template for table `CampaignCreateCommon`
--
SELECT `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization` FROM `CampaignCreateCommon` WHERE 1;

--
-- INSERT template for table `CampaignCreateCommon`
--
INSERT INTO `CampaignCreateCommon`(`ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`, `default_ad_group_budget_in_micro_currency`, `is_campaign_budget_optimization`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateCommon`
--
UPDATE `CampaignCreateCommon` SET `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_campaign_budget_optimization` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateCommon`
--
DELETE FROM `CampaignCreateCommon` WHERE 0;

