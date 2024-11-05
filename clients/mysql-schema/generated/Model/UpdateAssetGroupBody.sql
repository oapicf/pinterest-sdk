--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupBody' definition.
--


--
-- SELECT template for table `UpdateAssetGroupBody`
--
SELECT `asset_groups_to_update` FROM `UpdateAssetGroupBody` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupBody`
--
INSERT INTO `UpdateAssetGroupBody`(`asset_groups_to_update`) VALUES (?);

--
-- UPDATE template for table `UpdateAssetGroupBody`
--
UPDATE `UpdateAssetGroupBody` SET `asset_groups_to_update` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupBody`
--
DELETE FROM `UpdateAssetGroupBody` WHERE 0;

