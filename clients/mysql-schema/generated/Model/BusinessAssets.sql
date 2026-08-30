--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessAssets' definition.
--


--
-- SELECT template for table `BusinessAssets`
--
SELECT `asset_group_info`, `asset_id`, `asset_type`, `permissions`, `catalog_info` FROM `BusinessAssets` WHERE 1;

--
-- INSERT template for table `BusinessAssets`
--
INSERT INTO `BusinessAssets`(`asset_group_info`, `asset_id`, `asset_type`, `permissions`, `catalog_info`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BusinessAssets`
--
UPDATE `BusinessAssets` SET `asset_group_info` = ?, `asset_id` = ?, `asset_type` = ?, `permissions` = ?, `catalog_info` = ? WHERE 1;

--
-- DELETE template for table `BusinessAssets`
--
DELETE FROM `BusinessAssets` WHERE 0;

