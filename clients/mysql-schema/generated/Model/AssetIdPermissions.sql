--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetIdPermissions' definition.
--


--
-- SELECT template for table `AssetIdPermissions`
--
SELECT `asset_group_info`, `asset_id`, `asset_type`, `permissions` FROM `AssetIdPermissions` WHERE 1;

--
-- INSERT template for table `AssetIdPermissions`
--
INSERT INTO `AssetIdPermissions`(`asset_group_info`, `asset_id`, `asset_type`, `permissions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AssetIdPermissions`
--
UPDATE `AssetIdPermissions` SET `asset_group_info` = ?, `asset_id` = ?, `asset_type` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `AssetIdPermissions`
--
DELETE FROM `AssetIdPermissions` WHERE 0;

