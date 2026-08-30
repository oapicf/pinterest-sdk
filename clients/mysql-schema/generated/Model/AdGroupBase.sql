--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupBase' definition.
--


--
-- SELECT template for table `AdGroupBase`
--
SELECT `ad_account_id`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `campaign_id`, `conversion_learning_mode_type`, `created_time`, `customer_segment_id`, `dca_assets`, `end_time`, `ext_features`, `feed_profile_id`, `id`, `is_creative_optimization`, `is_local_inventory`, `lifetime_frequency_cap`, `local_inventory_radius_in_miles`, `name`, `optimization_goal_metadata`, `performance_plus_campaign_settings`, `placement_group`, `placement_traffic_type`, `promotion_application_level`, `promotion_id`, `promotion_ids`, `start_time`, `status`, `summary_status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `type`, `updated_time` FROM `AdGroupBase` WHERE 1;

--
-- INSERT template for table `AdGroupBase`
--
INSERT INTO `AdGroupBase`(`ad_account_id`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `campaign_id`, `conversion_learning_mode_type`, `created_time`, `customer_segment_id`, `dca_assets`, `end_time`, `ext_features`, `feed_profile_id`, `id`, `is_creative_optimization`, `is_local_inventory`, `lifetime_frequency_cap`, `local_inventory_radius_in_miles`, `name`, `optimization_goal_metadata`, `performance_plus_campaign_settings`, `placement_group`, `placement_traffic_type`, `promotion_application_level`, `promotion_id`, `promotion_ids`, `start_time`, `status`, `summary_status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `type`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupBase`
--
UPDATE `AdGroupBase` SET `ad_account_id` = ?, `bid_in_micro_currency` = ?, `bid_strategy_type` = ?, `billable_event` = ?, `budget_in_micro_currency` = ?, `campaign_id` = ?, `conversion_learning_mode_type` = ?, `created_time` = ?, `customer_segment_id` = ?, `dca_assets` = ?, `end_time` = ?, `ext_features` = ?, `feed_profile_id` = ?, `id` = ?, `is_creative_optimization` = ?, `is_local_inventory` = ?, `lifetime_frequency_cap` = ?, `local_inventory_radius_in_miles` = ?, `name` = ?, `optimization_goal_metadata` = ?, `performance_plus_campaign_settings` = ?, `placement_group` = ?, `placement_traffic_type` = ?, `promotion_application_level` = ?, `promotion_id` = ?, `promotion_ids` = ?, `start_time` = ?, `status` = ?, `summary_status` = ?, `targeting_spec` = ?, `targeting_template_ids` = ?, `tracking_urls` = ?, `type` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AdGroupBase`
--
DELETE FROM `AdGroupBase` WHERE 0;

