--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupModificationReadOrUpdate' definition.
--


--
-- SELECT template for table `AssetGroupModificationReadOrUpdate`
--
SELECT `asset_groups_to_update`, `exceptions`, `updated_asset_groups` FROM `AssetGroupModificationReadOrUpdate` WHERE 1;

--
-- INSERT template for table `AssetGroupModificationReadOrUpdate`
--
INSERT INTO `AssetGroupModificationReadOrUpdate`(`asset_groups_to_update`, `exceptions`, `updated_asset_groups`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AssetGroupModificationReadOrUpdate`
--
UPDATE `AssetGroupModificationReadOrUpdate` SET `asset_groups_to_update` = ?, `exceptions` = ?, `updated_asset_groups` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupModificationReadOrUpdate`
--
DELETE FROM `AssetGroupModificationReadOrUpdate` WHERE 0;

