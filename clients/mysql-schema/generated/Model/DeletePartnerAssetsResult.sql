--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnerAssetsResult' definition.
--


--
-- SELECT template for table `DeletePartnerAssetsResult`
--
SELECT `asset_id`, `asset_type`, `permissions`, `is_shared_partner`, `partner_id` FROM `DeletePartnerAssetsResult` WHERE 1;

--
-- INSERT template for table `DeletePartnerAssetsResult`
--
INSERT INTO `DeletePartnerAssetsResult`(`asset_id`, `asset_type`, `permissions`, `is_shared_partner`, `partner_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `DeletePartnerAssetsResult`
--
UPDATE `DeletePartnerAssetsResult` SET `asset_id` = ?, `asset_type` = ?, `permissions` = ?, `is_shared_partner` = ?, `partner_id` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnerAssetsResult`
--
DELETE FROM `DeletePartnerAssetsResult` WHERE 0;

