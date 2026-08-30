--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupUpdateError' definition.
--


--
-- SELECT template for table `AssetGroupUpdateError`
--
SELECT `asset_group_id`, `code`, `message` FROM `AssetGroupUpdateError` WHERE 1;

--
-- INSERT template for table `AssetGroupUpdateError`
--
INSERT INTO `AssetGroupUpdateError`(`asset_group_id`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AssetGroupUpdateError`
--
UPDATE `AssetGroupUpdateError` SET `asset_group_id` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupUpdateError`
--
DELETE FROM `AssetGroupUpdateError` WHERE 0;

