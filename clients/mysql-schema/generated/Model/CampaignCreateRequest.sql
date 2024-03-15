--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateRequest' definition.
--


--
-- SELECT template for table `CampaignCreateRequest`
--
SELECT `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `objective_type` FROM `CampaignCreateRequest` WHERE 1;

--
-- INSERT template for table `CampaignCreateRequest`
--
INSERT INTO `CampaignCreateRequest`(`ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `objective_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateRequest`
--
UPDATE `CampaignCreateRequest` SET `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `summary_status` = ?, `is_flexible_daily_budgets` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_automated_campaign` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateRequest`
--
DELETE FROM `CampaignCreateRequest` WHERE 0;

