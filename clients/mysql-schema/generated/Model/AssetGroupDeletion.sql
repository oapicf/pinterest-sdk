--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupDeletion' definition.
--


--
-- SELECT template for table `AssetGroupDeletion`
--
SELECT `deleted_asset_groups`, `exceptions` FROM `AssetGroupDeletion` WHERE 1;

--
-- INSERT template for table `AssetGroupDeletion`
--
INSERT INTO `AssetGroupDeletion`(`deleted_asset_groups`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `AssetGroupDeletion`
--
UPDATE `AssetGroupDeletion` SET `deleted_asset_groups` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupDeletion`
--
DELETE FROM `AssetGroupDeletion` WHERE 0;

