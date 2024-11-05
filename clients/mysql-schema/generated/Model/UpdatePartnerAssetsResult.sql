--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdatePartnerAssetsResult' definition.
--


--
-- SELECT template for table `UpdatePartnerAssetsResult`
--
SELECT `asset_id`, `asset_type`, `partner_id`, `permissions` FROM `UpdatePartnerAssetsResult` WHERE 1;

--
-- INSERT template for table `UpdatePartnerAssetsResult`
--
INSERT INTO `UpdatePartnerAssetsResult`(`asset_id`, `asset_type`, `partner_id`, `permissions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `UpdatePartnerAssetsResult`
--
UPDATE `UpdatePartnerAssetsResult` SET `asset_id` = ?, `asset_type` = ?, `partner_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UpdatePartnerAssetsResult`
--
DELETE FROM `UpdatePartnerAssetsResult` WHERE 0;

