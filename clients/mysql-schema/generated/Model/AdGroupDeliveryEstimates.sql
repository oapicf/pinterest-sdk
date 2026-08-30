--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupDeliveryEstimates' definition.
--


--
-- SELECT template for table `AdGroupDeliveryEstimates`
--
SELECT `auto_targeting_enabled`, `creative_types`, `keywords`, `monthly_frequency_cap`, `optimization_goal_metadata`, `optimization_type`, `placement_group`, `product_group_ids`, `targeting_spec` FROM `AdGroupDeliveryEstimates` WHERE 1;

--
-- INSERT template for table `AdGroupDeliveryEstimates`
--
INSERT INTO `AdGroupDeliveryEstimates`(`auto_targeting_enabled`, `creative_types`, `keywords`, `monthly_frequency_cap`, `optimization_goal_metadata`, `optimization_type`, `placement_group`, `product_group_ids`, `targeting_spec`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupDeliveryEstimates`
--
UPDATE `AdGroupDeliveryEstimates` SET `auto_targeting_enabled` = ?, `creative_types` = ?, `keywords` = ?, `monthly_frequency_cap` = ?, `optimization_goal_metadata` = ?, `optimization_type` = ?, `placement_group` = ?, `product_group_ids` = ?, `targeting_spec` = ? WHERE 1;

--
-- DELETE template for table `AdGroupDeliveryEstimates`
--
DELETE FROM `AdGroupDeliveryEstimates` WHERE 0;

