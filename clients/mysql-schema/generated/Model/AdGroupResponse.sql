--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupResponse' definition.
--


--
-- SELECT template for table `AdGroupResponse`
--
SELECT `auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `ad_account_id`, `bid_multiplier`, `conversion_learning_mode_type`, `created_time`, `dca_assets`, `feed_profile_id`, `id`, `summary_status`, `type`, `updated_time` FROM `AdGroupResponse` WHERE 1;

--
-- INSERT template for table `AdGroupResponse`
--
INSERT INTO `AdGroupResponse`(`auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `ad_account_id`, `bid_multiplier`, `conversion_learning_mode_type`, `created_time`, `dca_assets`, `feed_profile_id`, `id`, `summary_status`, `type`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupResponse`
--
UPDATE `AdGroupResponse` SET `auto_targeting_enabled` = ?, `bid_in_micro_currency` = ?, `bid_strategy_type` = ?, `billable_event` = ?, `budget_in_micro_currency` = ?, `budget_type` = ?, `campaign_id` = ?, `end_time` = ?, `is_creative_optimization` = ?, `lifetime_frequency_cap` = ?, `name` = ?, `optimization_goal_metadata` = ?, `pacing_delivery_type` = ?, `placement_group` = ?, `promotion_application_level` = ?, `promotion_id` = ?, `start_time` = ?, `status` = ?, `targeting_spec` = ?, `targeting_template_ids` = ?, `tracking_urls` = ?, `ad_account_id` = ?, `bid_multiplier` = ?, `conversion_learning_mode_type` = ?, `created_time` = ?, `dca_assets` = ?, `feed_profile_id` = ?, `id` = ?, `summary_status` = ?, `type` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AdGroupResponse`
--
DELETE FROM `AdGroupResponse` WHERE 0;

