--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingRequest' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingRequest`
--
SELECT `auto_targeting_enabled`, `placement_group`, `creative_types`, `targeting_spec`, `product_group_ids`, `keywords` FROM `AdGroupAudienceSizingRequest` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingRequest`
--
INSERT INTO `AdGroupAudienceSizingRequest`(`auto_targeting_enabled`, `placement_group`, `creative_types`, `targeting_spec`, `product_group_ids`, `keywords`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingRequest`
--
UPDATE `AdGroupAudienceSizingRequest` SET `auto_targeting_enabled` = ?, `placement_group` = ?, `creative_types` = ?, `targeting_spec` = ?, `product_group_ids` = ?, `keywords` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingRequest`
--
DELETE FROM `AdGroupAudienceSizingRequest` WHERE 0;

