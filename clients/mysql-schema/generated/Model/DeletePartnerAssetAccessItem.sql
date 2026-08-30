--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnerAssetAccessItem' definition.
--


--
-- SELECT template for table `DeletePartnerAssetAccessItem`
--
SELECT `asset_id`, `partner_id`, `partner_type` FROM `DeletePartnerAssetAccessItem` WHERE 1;

--
-- INSERT template for table `DeletePartnerAssetAccessItem`
--
INSERT INTO `DeletePartnerAssetAccessItem`(`asset_id`, `partner_id`, `partner_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeletePartnerAssetAccessItem`
--
UPDATE `DeletePartnerAssetAccessItem` SET `asset_id` = ?, `partner_id` = ?, `partner_type` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnerAssetAccessItem`
--
DELETE FROM `DeletePartnerAssetAccessItem` WHERE 0;

