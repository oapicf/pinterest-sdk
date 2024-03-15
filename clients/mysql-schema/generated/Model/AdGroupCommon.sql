--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCommon' definition.
--


--
-- SELECT template for table `AdGroupCommon`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type` FROM `AdGroupCommon` WHERE 1;

--
-- INSERT template for table `AdGroupCommon`
--
INSERT INTO `AdGroupCommon`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupCommon`
--
UPDATE `AdGroupCommon` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `optimization_goal_metadata` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `campaign_id` = ?, `billable_event` = ?, `bid_strategy_type` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCommon`
--
DELETE FROM `AdGroupCommon` WHERE 0;

