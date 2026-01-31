--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnerAssetsResult' definition.
--


--
-- SELECT template for table `DeletePartnerAssetsResult`
--
SELECT `asset_id`, `asset_type`, `is_shared_partner`, `partner_id`, `permissions` FROM `DeletePartnerAssetsResult` WHERE 1;

--
-- INSERT template for table `DeletePartnerAssetsResult`
--
INSERT INTO `DeletePartnerAssetsResult`(`asset_id`, `asset_type`, `is_shared_partner`, `partner_id`, `permissions`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `DeletePartnerAssetsResult`
--
UPDATE `DeletePartnerAssetsResult` SET `asset_id` = ?, `asset_type` = ?, `is_shared_partner` = ?, `partner_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnerAssetsResult`
--
DELETE FROM `DeletePartnerAssetsResult` WHERE 0;

