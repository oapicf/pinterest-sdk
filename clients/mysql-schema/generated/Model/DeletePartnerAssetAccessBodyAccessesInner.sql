--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnerAssetAccessBody_accesses_inner' definition.
--


--
-- SELECT template for table `DeletePartnerAssetAccessBody_accesses_inner`
--
SELECT `partner_id`, `asset_id`, `partner_type` FROM `DeletePartnerAssetAccessBody_accesses_inner` WHERE 1;

--
-- INSERT template for table `DeletePartnerAssetAccessBody_accesses_inner`
--
INSERT INTO `DeletePartnerAssetAccessBody_accesses_inner`(`partner_id`, `asset_id`, `partner_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeletePartnerAssetAccessBody_accesses_inner`
--
UPDATE `DeletePartnerAssetAccessBody_accesses_inner` SET `partner_id` = ?, `asset_id` = ?, `partner_type` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnerAssetAccessBody_accesses_inner`
--
DELETE FROM `DeletePartnerAssetAccessBody_accesses_inner` WHERE 0;

