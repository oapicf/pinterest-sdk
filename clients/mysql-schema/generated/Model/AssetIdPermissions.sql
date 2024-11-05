--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetIdPermissions' definition.
--


--
-- SELECT template for table `AssetIdPermissions`
--
SELECT `asset_id`, `asset_type`, `permissions`, `asset_group_info` FROM `AssetIdPermissions` WHERE 1;

--
-- INSERT template for table `AssetIdPermissions`
--
INSERT INTO `AssetIdPermissions`(`asset_id`, `asset_type`, `permissions`, `asset_group_info`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AssetIdPermissions`
--
UPDATE `AssetIdPermissions` SET `asset_id` = ?, `asset_type` = ?, `permissions` = ?, `asset_group_info` = ? WHERE 1;

--
-- DELETE template for table `AssetIdPermissions`
--
DELETE FROM `AssetIdPermissions` WHERE 0;

