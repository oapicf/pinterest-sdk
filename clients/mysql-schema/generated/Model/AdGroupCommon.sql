--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCommon' definition.
--


--
-- SELECT template for table `AdGroupCommon`
--
SELECT `auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls` FROM `AdGroupCommon` WHERE 1;

--
-- INSERT template for table `AdGroupCommon`
--
INSERT INTO `AdGroupCommon`(`auto_targeting_enabled`, `bid_in_micro_currency`, `bid_strategy_type`, `billable_event`, `budget_in_micro_currency`, `budget_type`, `campaign_id`, `end_time`, `is_creative_optimization`, `lifetime_frequency_cap`, `name`, `optimization_goal_metadata`, `pacing_delivery_type`, `placement_group`, `promotion_application_level`, `promotion_id`, `start_time`, `status`, `targeting_spec`, `targeting_template_ids`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupCommon`
--
UPDATE `AdGroupCommon` SET `auto_targeting_enabled` = ?, `bid_in_micro_currency` = ?, `bid_strategy_type` = ?, `billable_event` = ?, `budget_in_micro_currency` = ?, `budget_type` = ?, `campaign_id` = ?, `end_time` = ?, `is_creative_optimization` = ?, `lifetime_frequency_cap` = ?, `name` = ?, `optimization_goal_metadata` = ?, `pacing_delivery_type` = ?, `placement_group` = ?, `promotion_application_level` = ?, `promotion_id` = ?, `start_time` = ?, `status` = ?, `targeting_spec` = ?, `targeting_template_ids` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCommon`
--
DELETE FROM `AdGroupCommon` WHERE 0;

