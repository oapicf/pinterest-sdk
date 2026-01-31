--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupBinding' definition.
--


--
-- SELECT template for table `AssetGroupBinding`
--
SELECT `ad_accounts_ids`, `asset_group_description`, `asset_group_name`, `asset_group_types`, `catalogs_ids`, `created_by`, `created_time`, `id`, `owner`, `profiles_ids`, `updated_time` FROM `AssetGroupBinding` WHERE 1;

--
-- INSERT template for table `AssetGroupBinding`
--
INSERT INTO `AssetGroupBinding`(`ad_accounts_ids`, `asset_group_description`, `asset_group_name`, `asset_group_types`, `catalogs_ids`, `created_by`, `created_time`, `id`, `owner`, `profiles_ids`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AssetGroupBinding`
--
UPDATE `AssetGroupBinding` SET `ad_accounts_ids` = ?, `asset_group_description` = ?, `asset_group_name` = ?, `asset_group_types` = ?, `catalogs_ids` = ?, `created_by` = ?, `created_time` = ?, `id` = ?, `owner` = ?, `profiles_ids` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupBinding`
--
DELETE FROM `AssetGroupBinding` WHERE 0;

