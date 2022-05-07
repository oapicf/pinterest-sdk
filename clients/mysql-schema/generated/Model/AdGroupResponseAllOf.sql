--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupResponse_allOf' definition.
--


--
-- SELECT template for table `AdGroupResponse_allOf`
--
SELECT `name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id` FROM `AdGroupResponse_allOf` WHERE 1;

--
-- INSERT template for table `AdGroupResponse_allOf`
--
INSERT INTO `AdGroupResponse_allOf`(`name`, `status`, `budget_in_micro_currency`, `bid_in_micro_currency`, `budget_type`, `start_time`, `end_time`, `targeting_spec`, `lifetime_frequency_cap`, `tracking_urls`, `auto_targeting_enabled`, `placement_group`, `pacing_delivery_type`, `conversion_learning_mode_type`, `summary_status`, `feed_profile_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupResponse_allOf`
--
UPDATE `AdGroupResponse_allOf` SET `name` = ?, `status` = ?, `budget_in_micro_currency` = ?, `bid_in_micro_currency` = ?, `budget_type` = ?, `start_time` = ?, `end_time` = ?, `targeting_spec` = ?, `lifetime_frequency_cap` = ?, `tracking_urls` = ?, `auto_targeting_enabled` = ?, `placement_group` = ?, `pacing_delivery_type` = ?, `conversion_learning_mode_type` = ?, `summary_status` = ?, `feed_profile_id` = ? WHERE 1;

--
-- DELETE template for table `AdGroupResponse_allOf`
--
DELETE FROM `AdGroupResponse_allOf` WHERE 0;

