--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupUpdateRequest' definition.
--


--
-- SELECT template for table `AdGroupUpdateRequest`
--
SELECT `auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `bid_multiplier`, `id` FROM `AdGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `AdGroupUpdateRequest`
--
INSERT INTO `AdGroupUpdateRequest`(`auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`, `bid_multiplier`, `id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupUpdateRequest`
--
UPDATE `AdGroupUpdateRequest` SET `auto_targeting_enabled` = ?, `bid_in_micro_currency` = ?, `bid_strategy_type` = ?, `billable_event` = ?, `budget_in_micro_currency` = ?, `budget_type` = ?, `campaign_id` = ?, `end_time` = ?, `is_creative_optimization` = ?, `lifetime_frequency_cap` = ?, `name` = ?, `optimization_goal_metadata` = ?, `pacing_delivery_type` = ?, `placement_group` = ?, `promotion_application_level` = ?, `promotion_id` = ?, `start_time` = ?, `status` = ?, `targeting_spec` = ?, `targeting_template_ids` = ?, `tracking_urls` = ?, `bid_multiplier` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `AdGroupUpdateRequest`
--
DELETE FROM `AdGroupUpdateRequest` WHERE 0;

