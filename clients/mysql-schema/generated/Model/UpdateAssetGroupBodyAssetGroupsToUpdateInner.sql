--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupBody_asset_groups_to_update_inner' definition.
--


--
-- SELECT template for table `UpdateAssetGroupBody_asset_groups_to_update_inner`
--
SELECT `asset_group_id`, `name`, `description`, `asset_group_types`, `assets_to_add`, `assets_to_remove` FROM `UpdateAssetGroupBody_asset_groups_to_update_inner` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupBody_asset_groups_to_update_inner`
--
INSERT INTO `UpdateAssetGroupBody_asset_groups_to_update_inner`(`asset_group_id`, `name`, `description`, `asset_group_types`, `assets_to_add`, `assets_to_remove`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UpdateAssetGroupBody_asset_groups_to_update_inner`
--
UPDATE `UpdateAssetGroupBody_asset_groups_to_update_inner` SET `asset_group_id` = ?, `name` = ?, `description` = ?, `asset_group_types` = ?, `assets_to_add` = ?, `assets_to_remove` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupBody_asset_groups_to_update_inner`
--
DELETE FROM `UpdateAssetGroupBody_asset_groups_to_update_inner` WHERE 0;

