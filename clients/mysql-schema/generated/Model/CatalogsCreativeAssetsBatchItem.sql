--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsBatchItem' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsBatchItem`
--
SELECT `attributes`, `creative_assets_id`, `operation` FROM `CatalogsCreativeAssetsBatchItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsBatchItem`
--
INSERT INTO `CatalogsCreativeAssetsBatchItem`(`attributes`, `creative_assets_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsBatchItem`
--
UPDATE `CatalogsCreativeAssetsBatchItem` SET `attributes` = ?, `creative_assets_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsBatchItem`
--
DELETE FROM `CatalogsCreativeAssetsBatchItem` WHERE 0;

