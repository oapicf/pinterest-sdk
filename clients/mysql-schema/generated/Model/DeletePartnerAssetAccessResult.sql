--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnerAssetAccessResult' definition.
--


--
-- SELECT template for table `DeletePartnerAssetAccessResult`
--
SELECT `asset_id`, `asset_type`, `is_shared_partner`, `partner_id`, `permissions` FROM `DeletePartnerAssetAccessResult` WHERE 1;

--
-- INSERT template for table `DeletePartnerAssetAccessResult`
--
INSERT INTO `DeletePartnerAssetAccessResult`(`asset_id`, `asset_type`, `is_shared_partner`, `partner_id`, `permissions`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `DeletePartnerAssetAccessResult`
--
UPDATE `DeletePartnerAssetAccessResult` SET `asset_id` = ?, `asset_type` = ?, `is_shared_partner` = ?, `partner_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnerAssetAccessResult`
--
DELETE FROM `DeletePartnerAssetAccessResult` WHERE 0;

