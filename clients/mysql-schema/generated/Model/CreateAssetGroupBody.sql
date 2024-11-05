--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetGroupBody' definition.
--


--
-- SELECT template for table `CreateAssetGroupBody`
--
SELECT `asset_group_name`, `asset_group_description`, `asset_group_types` FROM `CreateAssetGroupBody` WHERE 1;

--
-- INSERT template for table `CreateAssetGroupBody`
--
INSERT INTO `CreateAssetGroupBody`(`asset_group_name`, `asset_group_description`, `asset_group_types`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateAssetGroupBody`
--
UPDATE `CreateAssetGroupBody` SET `asset_group_name` = ?, `asset_group_description` = ?, `asset_group_types` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetGroupBody`
--
DELETE FROM `CreateAssetGroupBody` WHERE 0;

