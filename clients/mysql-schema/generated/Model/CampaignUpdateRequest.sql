--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignUpdateRequest' definition.
--


--
-- SELECT template for table `CampaignUpdateRequest`
--
SELECT `id`, `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `is_campaign_budget_optimization`, `objective_type` FROM `CampaignUpdateRequest` WHERE 1;

--
-- INSERT template for table `CampaignUpdateRequest`
--
INSERT INTO `CampaignUpdateRequest`(`id`, `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `is_flexible_daily_budgets`, `default_ad_group_budget_in_micro_currency`, `is_automated_campaign`, `is_campaign_budget_optimization`, `objective_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignUpdateRequest`
--
UPDATE `CampaignUpdateRequest` SET `id` = ?, `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `is_flexible_daily_budgets` = ?, `default_ad_group_budget_in_micro_currency` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `CampaignUpdateRequest`
--
DELETE FROM `CampaignUpdateRequest` WHERE 0;

