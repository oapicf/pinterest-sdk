--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateCommon' definition.
--


--
-- SELECT template for table `CampaignCreateCommon`
--
SELECT `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign` FROM `CampaignCreateCommon` WHERE 1;

--
-- INSERT template for table `CampaignCreateCommon`
--
INSERT INTO `CampaignCreateCommon`(`ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateCommon`
--
UPDATE `CampaignCreateCommon` SET `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `is_flexible_daily_budgets` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_automated_campaign` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateCommon`
--
DELETE FROM `CampaignCreateCommon` WHERE 0;

