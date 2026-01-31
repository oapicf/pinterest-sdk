--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetPartnerAssetsResponse' definition.
--


--
-- SELECT template for table `GetPartnerAssetsResponse`
--
SELECT `asset_group_info`, `asset_id`, `asset_type`, `permissions` FROM `GetPartnerAssetsResponse` WHERE 1;

--
-- INSERT template for table `GetPartnerAssetsResponse`
--
INSERT INTO `GetPartnerAssetsResponse`(`asset_group_info`, `asset_id`, `asset_type`, `permissions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetPartnerAssetsResponse`
--
UPDATE `GetPartnerAssetsResponse` SET `asset_group_info` = ?, `asset_id` = ?, `asset_type` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `GetPartnerAssetsResponse`
--
DELETE FROM `GetPartnerAssetsResponse` WHERE 0;

