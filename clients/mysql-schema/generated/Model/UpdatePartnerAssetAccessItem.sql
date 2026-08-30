--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdatePartnerAssetAccessItem' definition.
--


--
-- SELECT template for table `UpdatePartnerAssetAccessItem`
--
SELECT `asset_id`, `partner_id`, `permissions` FROM `UpdatePartnerAssetAccessItem` WHERE 1;

--
-- INSERT template for table `UpdatePartnerAssetAccessItem`
--
INSERT INTO `UpdatePartnerAssetAccessItem`(`asset_id`, `partner_id`, `permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdatePartnerAssetAccessItem`
--
UPDATE `UpdatePartnerAssetAccessItem` SET `asset_id` = ?, `partner_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UpdatePartnerAssetAccessItem`
--
DELETE FROM `UpdatePartnerAssetAccessItem` WHERE 0;

