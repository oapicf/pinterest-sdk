--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupUpdateItemReadOrUpdateItem' definition.
--


--
-- SELECT template for table `AssetGroupUpdateItemReadOrUpdateItem`
--
SELECT `asset_group_id`, `asset_group_types`, `assets_to_add`, `assets_to_remove`, `description`, `name` FROM `AssetGroupUpdateItemReadOrUpdateItem` WHERE 1;

--
-- INSERT template for table `AssetGroupUpdateItemReadOrUpdateItem`
--
INSERT INTO `AssetGroupUpdateItemReadOrUpdateItem`(`asset_group_id`, `asset_group_types`, `assets_to_add`, `assets_to_remove`, `description`, `name`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AssetGroupUpdateItemReadOrUpdateItem`
--
UPDATE `AssetGroupUpdateItemReadOrUpdateItem` SET `asset_group_id` = ?, `asset_group_types` = ?, `assets_to_add` = ?, `assets_to_remove` = ?, `description` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupUpdateItemReadOrUpdateItem`
--
DELETE FROM `AssetGroupUpdateItemReadOrUpdateItem` WHERE 0;

