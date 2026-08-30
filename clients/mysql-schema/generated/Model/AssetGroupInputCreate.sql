--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupInputCreate' definition.
--


--
-- SELECT template for table `AssetGroupInputCreate`
--
SELECT `asset_group`, `asset_group_description`, `asset_group_name`, `asset_group_types` FROM `AssetGroupInputCreate` WHERE 1;

--
-- INSERT template for table `AssetGroupInputCreate`
--
INSERT INTO `AssetGroupInputCreate`(`asset_group`, `asset_group_description`, `asset_group_name`, `asset_group_types`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AssetGroupInputCreate`
--
UPDATE `AssetGroupInputCreate` SET `asset_group` = ?, `asset_group_description` = ?, `asset_group_name` = ?, `asset_group_types` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupInputCreate`
--
DELETE FROM `AssetGroupInputCreate` WHERE 0;

