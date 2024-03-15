--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCommon' definition.
--


--
-- SELECT template for table `CampaignCommon`
--
SELECT `ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status` FROM `CampaignCommon` WHERE 1;

--
-- INSERT template for table `CampaignCommon`
--
INSERT INTO `CampaignCommon`(`ad_account_id`, `name`, `status`, `lifetime_spend_cap`, `daily_spend_cap`, `order_line_id`, `tracking_urls`, `start_time`, `end_time`, `summary_status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCommon`
--
UPDATE `CampaignCommon` SET `ad_account_id` = ?, `name` = ?, `status` = ?, `lifetime_spend_cap` = ?, `daily_spend_cap` = ?, `order_line_id` = ?, `tracking_urls` = ?, `start_time` = ?, `end_time` = ?, `summary_status` = ? WHERE 1;

--
-- DELETE template for table `CampaignCommon`
--
DELETE FROM `CampaignCommon` WHERE 0;

