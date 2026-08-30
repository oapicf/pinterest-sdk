--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCreateRequest' definition.
--


--
-- SELECT template for table `AdGroupCreateRequest`
--
SELECT `auto_targeting_enabled`, `bid_multiplier`, `budget_type`, `pacing_delivery_type`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `placement_group`, `promotion_application_level`, `promotion_id`, `promotion_ids`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls` FROM `AdGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `AdGroupCreateRequest`
--
INSERT INTO `AdGroupCreateRequest`(`auto_targeting_enabled`, `bid_multiplier`, `budget_type`, `pacing_delivery_type`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `placement_group`, `promotion_application_level`, `promotion_id`, `promotion_ids`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupCreateRequest`
--
UPDATE `AdGroupCreateRequest` SET `auto_targeting_enabled` = ?, `bid_multiplier` = ?, `budget_type` = ?, `pacing_delivery_type` = ?, `bid_in_micro_currency` = ?, `bid_strategy_type` = ?, `billable_event` = ?, `budget_in_micro_currency` = ?, `campaign_id` = ?, `end_time` = ?, `is_creative_optimization` = ?, `lifetime_frequency_cap` = ?, `name` = ?, `optimization_goal_metadata` = ?, `placement_group` = ?, `promotion_application_level` = ?, `promotion_id` = ?, `promotion_ids` = ?, `start_time` = ?, `status` = ?, `targeting_spec` = ?, `targeting_template_ids` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCreateRequest`
--
DELETE FROM `AdGroupCreateRequest` WHERE 0;

