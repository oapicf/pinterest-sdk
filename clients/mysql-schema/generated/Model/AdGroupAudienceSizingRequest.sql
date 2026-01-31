--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingRequest' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingRequest`
--
SELECT `auto_targeting_enabled`, `creative_types`, `keywords`, `placement_group`, `product_group_ids`, `targeting_spec` FROM `AdGroupAudienceSizingRequest` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingRequest`
--
INSERT INTO `AdGroupAudienceSizingRequest`(`auto_targeting_enabled`, `creative_types`, `keywords`, `placement_group`, `product_group_ids`, `targeting_spec`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingRequest`
--
UPDATE `AdGroupAudienceSizingRequest` SET `auto_targeting_enabled` = ?, `creative_types` = ?, `keywords` = ?, `placement_group` = ?, `product_group_ids` = ?, `targeting_spec` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingRequest`
--
DELETE FROM `AdGroupAudienceSizingRequest` WHERE 0;

