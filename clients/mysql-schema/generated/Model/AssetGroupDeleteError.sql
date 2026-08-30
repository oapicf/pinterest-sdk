--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetGroupDeleteError' definition.
--


--
-- SELECT template for table `AssetGroupDeleteError`
--
SELECT `asset_group_id`, `code`, `message` FROM `AssetGroupDeleteError` WHERE 1;

--
-- INSERT template for table `AssetGroupDeleteError`
--
INSERT INTO `AssetGroupDeleteError`(`asset_group_id`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AssetGroupDeleteError`
--
UPDATE `AssetGroupDeleteError` SET `asset_group_id` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `AssetGroupDeleteError`
--
DELETE FROM `AssetGroupDeleteError` WHERE 0;

