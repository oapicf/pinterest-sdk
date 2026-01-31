--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCommon' definition.
--


--
-- SELECT template for table `CampaignCommon`
--
SELECT `ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls` FROM `CampaignCommon` WHERE 1;

--
-- INSERT template for table `CampaignCommon`
--
INSERT INTO `CampaignCommon`(`ad_account_id`, `daily_spend_cap`, `end_time`, `is_automated_campaign`, `is_flexible_daily_budgets`, `lifetime_spend_cap`, `name`, `order_line_id`, `start_time`, `status`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCommon`
--
UPDATE `CampaignCommon` SET `ad_account_id` = ?, `daily_spend_cap` = ?, `end_time` = ?, `is_automated_campaign` = ?, `is_flexible_daily_budgets` = ?, `lifetime_spend_cap` = ?, `name` = ?, `order_line_id` = ?, `start_time` = ?, `status` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `CampaignCommon`
--
DELETE FROM `CampaignCommon` WHERE 0;

