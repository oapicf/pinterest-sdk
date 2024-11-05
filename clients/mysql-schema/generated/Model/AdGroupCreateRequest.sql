--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCreateRequest' definition.
--


--
-- SELECT template for table `AdGroupCreateRequest`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `targeting_template_ids` FROM `AdGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `AdGroupCreateRequest`
--
INSERT INTO `AdGroupCreateRequest`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `optimization_goal_metadata`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `campaign_id`, `billable_event`, `bid_strategy_type`, `targeting_template_ids`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupCreateRequest`
--
UPDATE `AdGroupCreateRequest` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `optimization_goal_metadata` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `campaign_id` = ?, `billable_event` = ?, `bid_strategy_type` = ?, `targeting_template_ids` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCreateRequest`
--
DELETE FROM `AdGroupCreateRequest` WHERE 0;

