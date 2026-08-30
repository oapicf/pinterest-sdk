--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupModification' definition.
--


--
-- SELECT template for table `AssetGroupModification`
--
SELECT `exceptions`, `updated_asset_groups` FROM `AssetGroupModification` WHERE 1;

--
-- INSERT template for table `AssetGroupModification`
--
INSERT INTO `AssetGroupModification`(`exceptions`, `updated_asset_groups`) VALUES (?, ?);

--
-- UPDATE template for table `AssetGroupModification`
--
UPDATE `AssetGroupModification` SET `exceptions` = ?, `updated_asset_groups` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupModification`
--
DELETE FROM `AssetGroupModification` WHERE 0;

