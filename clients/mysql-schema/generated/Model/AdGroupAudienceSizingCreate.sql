--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingCreate' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingCreate`
--
SELECT `auto_targeting_enabled`, `creative_types`, `keywords`, `placement_group`, `product_group_ids`, `targeting_spec` FROM `AdGroupAudienceSizingCreate` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingCreate`
--
INSERT INTO `AdGroupAudienceSizingCreate`(`auto_targeting_enabled`, `creative_types`, `keywords`, `placement_group`, `product_group_ids`, `targeting_spec`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingCreate`
--
UPDATE `AdGroupAudienceSizingCreate` SET `auto_targeting_enabled` = ?, `creative_types` = ?, `keywords` = ?, `placement_group` = ?, `product_group_ids` = ?, `targeting_spec` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingCreate`
--
DELETE FROM `AdGroupAudienceSizingCreate` WHERE 0;

