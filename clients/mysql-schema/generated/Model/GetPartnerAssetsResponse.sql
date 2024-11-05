--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetPartnerAssetsResponse' definition.
--


--
-- SELECT template for table `GetPartnerAssetsResponse`
--
SELECT `asset_id`, `asset_type`, `permissions`, `asset_group_info` FROM `GetPartnerAssetsResponse` WHERE 1;

--
-- INSERT template for table `GetPartnerAssetsResponse`
--
INSERT INTO `GetPartnerAssetsResponse`(`asset_id`, `asset_type`, `permissions`, `asset_group_info`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetPartnerAssetsResponse`
--
UPDATE `GetPartnerAssetsResponse` SET `asset_id` = ?, `asset_type` = ?, `permissions` = ?, `asset_group_info` = ? WHERE 1;

--
-- DELETE template for table `GetPartnerAssetsResponse`
--
DELETE FROM `GetPartnerAssetsResponse` WHERE 0;

