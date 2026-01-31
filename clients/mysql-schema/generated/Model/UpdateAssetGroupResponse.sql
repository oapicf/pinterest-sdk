--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupResponse' definition.
--


--
-- SELECT template for table `UpdateAssetGroupResponse`
--
SELECT `exceptions`, `updated_asset_groups` FROM `UpdateAssetGroupResponse` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupResponse`
--
INSERT INTO `UpdateAssetGroupResponse`(`exceptions`, `updated_asset_groups`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateAssetGroupResponse`
--
UPDATE `UpdateAssetGroupResponse` SET `exceptions` = ?, `updated_asset_groups` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupResponse`
--
DELETE FROM `UpdateAssetGroupResponse` WHERE 0;

