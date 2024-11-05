--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdatePartnerAssetAccessBody_accesses_inner' definition.
--


--
-- SELECT template for table `UpdatePartnerAssetAccessBody_accesses_inner`
--
SELECT `partner_id`, `asset_id`, `permissions` FROM `UpdatePartnerAssetAccessBody_accesses_inner` WHERE 1;

--
-- INSERT template for table `UpdatePartnerAssetAccessBody_accesses_inner`
--
INSERT INTO `UpdatePartnerAssetAccessBody_accesses_inner`(`partner_id`, `asset_id`, `permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdatePartnerAssetAccessBody_accesses_inner`
--
UPDATE `UpdatePartnerAssetAccessBody_accesses_inner` SET `partner_id` = ?, `asset_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UpdatePartnerAssetAccessBody_accesses_inner`
--
DELETE FROM `UpdatePartnerAssetAccessBody_accesses_inner` WHERE 0;

