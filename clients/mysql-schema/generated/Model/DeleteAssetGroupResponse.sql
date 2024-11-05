--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteAssetGroupResponse' definition.
--


--
-- SELECT template for table `DeleteAssetGroupResponse`
--
SELECT `deleted_asset_groups`, `exceptions` FROM `DeleteAssetGroupResponse` WHERE 1;

--
-- INSERT template for table `DeleteAssetGroupResponse`
--
INSERT INTO `DeleteAssetGroupResponse`(`deleted_asset_groups`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteAssetGroupResponse`
--
UPDATE `DeleteAssetGroupResponse` SET `deleted_asset_groups` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `DeleteAssetGroupResponse`
--
DELETE FROM `DeleteAssetGroupResponse` WHERE 0;

