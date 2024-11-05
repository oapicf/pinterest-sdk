--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupBinding' definition.
--


--
-- SELECT template for table `AssetGroupBinding`
--
SELECT `id`, `asset_group_name`, `asset_group_description`, `asset_group_types`, `ad_accounts_ids`, `profiles_ids`, `created_time`, `updated_time`, `owner`, `created_by` FROM `AssetGroupBinding` WHERE 1;

--
-- INSERT template for table `AssetGroupBinding`
--
INSERT INTO `AssetGroupBinding`(`id`, `asset_group_name`, `asset_group_description`, `asset_group_types`, `ad_accounts_ids`, `profiles_ids`, `created_time`, `updated_time`, `owner`, `created_by`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AssetGroupBinding`
--
UPDATE `AssetGroupBinding` SET `id` = ?, `asset_group_name` = ?, `asset_group_description` = ?, `asset_group_types` = ?, `ad_accounts_ids` = ?, `profiles_ids` = ?, `created_time` = ?, `updated_time` = ?, `owner` = ?, `created_by` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupBinding`
--
DELETE FROM `AssetGroupBinding` WHERE 0;

