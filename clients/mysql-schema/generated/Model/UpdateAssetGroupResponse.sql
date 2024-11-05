--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupResponse' definition.
--


--
-- SELECT template for table `UpdateAssetGroupResponse`
--
SELECT `updated_asset_groups`, `exceptions` FROM `UpdateAssetGroupResponse` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupResponse`
--
INSERT INTO `UpdateAssetGroupResponse`(`updated_asset_groups`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateAssetGroupResponse`
--
UPDATE `UpdateAssetGroupResponse` SET `updated_asset_groups` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupResponse`
--
DELETE FROM `UpdateAssetGroupResponse` WHERE 0;

