--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetBusinessAssetsResponse' definition.
--


--
-- SELECT template for table `GetBusinessAssetsResponse`
--
SELECT `asset_id`, `asset_type`, `asset_group_info` FROM `GetBusinessAssetsResponse` WHERE 1;

--
-- INSERT template for table `GetBusinessAssetsResponse`
--
INSERT INTO `GetBusinessAssetsResponse`(`asset_id`, `asset_type`, `asset_group_info`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetBusinessAssetsResponse`
--
UPDATE `GetBusinessAssetsResponse` SET `asset_id` = ?, `asset_type` = ?, `asset_group_info` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessAssetsResponse`
--
DELETE FROM `GetBusinessAssetsResponse` WHERE 0;

