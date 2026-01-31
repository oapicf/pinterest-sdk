--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetBusinessAssetsResponse' definition.
--


--
-- SELECT template for table `GetBusinessAssetsResponse`
--
SELECT `asset_group_info`, `asset_id`, `asset_type`, `catalog_info` FROM `GetBusinessAssetsResponse` WHERE 1;

--
-- INSERT template for table `GetBusinessAssetsResponse`
--
INSERT INTO `GetBusinessAssetsResponse`(`asset_group_info`, `asset_id`, `asset_type`, `catalog_info`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetBusinessAssetsResponse`
--
UPDATE `GetBusinessAssetsResponse` SET `asset_group_info` = ?, `asset_id` = ?, `asset_type` = ?, `catalog_info` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessAssetsResponse`
--
DELETE FROM `GetBusinessAssetsResponse` WHERE 0;

