--
-- Pinterest REST API.
-- Prepared SQL queries for 'BaseBusinessAssets' definition.
--


--
-- SELECT template for table `BaseBusinessAssets`
--
SELECT `asset_group_info`, `asset_id`, `asset_type`, `permissions` FROM `BaseBusinessAssets` WHERE 1;

--
-- INSERT template for table `BaseBusinessAssets`
--
INSERT INTO `BaseBusinessAssets`(`asset_group_info`, `asset_id`, `asset_type`, `permissions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BaseBusinessAssets`
--
UPDATE `BaseBusinessAssets` SET `asset_group_info` = ?, `asset_id` = ?, `asset_type` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `BaseBusinessAssets`
--
DELETE FROM `BaseBusinessAssets` WHERE 0;

