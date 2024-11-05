--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteAssetGroupBody' definition.
--


--
-- SELECT template for table `DeleteAssetGroupBody`
--
SELECT `asset_groups_to_delete` FROM `DeleteAssetGroupBody` WHERE 1;

--
-- INSERT template for table `DeleteAssetGroupBody`
--
INSERT INTO `DeleteAssetGroupBody`(`asset_groups_to_delete`) VALUES (?);

--
-- UPDATE template for table `DeleteAssetGroupBody`
--
UPDATE `DeleteAssetGroupBody` SET `asset_groups_to_delete` = ? WHERE 1;

--
-- DELETE template for table `DeleteAssetGroupBody`
--
DELETE FROM `DeleteAssetGroupBody` WHERE 0;

