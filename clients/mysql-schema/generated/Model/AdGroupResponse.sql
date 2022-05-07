--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupResponse' definition.
--


--
-- SELECT template for table `AdGroupResponse`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id`, `campaign_id`, `billable_event`, `id`, `type`, `ad_account_id`, `created_time`, `updated_time` FROM `AdGroupResponse` WHERE 1;

--
-- INSERT template for table `AdGroupResponse`
--
INSERT INTO `AdGroupResponse`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id`, `campaign_id`, `billable_event`, `id`, `type`, `ad_account_id`, `created_time`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupResponse`
--
UPDATE `AdGroupResponse` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `conversion_learning_mode_type` = ?, `summary_status` = ?, `feed_profile_id` = ?, `campaign_id` = ?, `billable_event` = ?, `id` = ?, `type` = ?, `ad_account_id` = ?, `created_time` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AdGroupResponse`
--
DELETE FROM `AdGroupResponse` WHERE 0;

