--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupUpdateRequest' definition.
--


--
-- SELECT template for table `AdGroupUpdateRequest`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `id` FROM `AdGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `AdGroupUpdateRequest`
--
INSERT INTO `AdGroupUpdateRequest`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupUpdateRequest`
--
UPDATE `AdGroupUpdateRequest` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `optimization_goal_metadata` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `campaign_id` = ?, `billable_event` = ?, `bid_strategy_type` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `AdGroupUpdateRequest`
--
DELETE FROM `AdGroupUpdateRequest` WHERE 0;

