--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupDeletionDelete' definition.
--


--
-- SELECT template for table `AssetGroupDeletionDelete`
--
SELECT `asset_groups_to_delete` FROM `AssetGroupDeletionDelete` WHERE 1;

--
-- INSERT template for table `AssetGroupDeletionDelete`
--
INSERT INTO `AssetGroupDeletionDelete`(`asset_groups_to_delete`) VALUES (?);

--
-- UPDATE template for table `AssetGroupDeletionDelete`
--
UPDATE `AssetGroupDeletionDelete` SET `asset_groups_to_delete` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupDeletionDelete`
--
DELETE FROM `AssetGroupDeletionDelete` WHERE 0;

