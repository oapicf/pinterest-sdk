--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupResponse' definition.
--


--
-- SELECT template for table `AdGroupResponse`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `id`, `ad_account_id`, `created_time`, `updated_time`, `type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id`, `dca_assets` FROM `AdGroupResponse` WHERE 1;

--
-- INSERT template for table `AdGroupResponse`
--
INSERT INTO `AdGroupResponse`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `id`, `ad_account_id`, `created_time`, `updated_time`, `type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id`, `dca_assets`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupResponse`
--
UPDATE `AdGroupResponse` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `optimization_goal_metadata` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `campaign_id` = ?, `billable_event` = ?, `bid_strategy_type` = ?, `id` = ?, `ad_account_id` = ?, `created_time` = ?, `updated_time` = ?, `type` = ?, `conversion_learning_mode_type` = ?, `summary_status` = ?, `feed_profile_id` = ?, `dca_assets` = ? WHERE 1;

--
-- DELETE template for table `AdGroupResponse`
--
DELETE FROM `AdGroupResponse` WHERE 0;

