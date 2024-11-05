--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsBatchItem' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsBatchItem`
--
SELECT `creative_assets_id`, `operation`, `attributes` FROM `CatalogsCreativeAssetsBatchItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsBatchItem`
--
INSERT INTO `CatalogsCreativeAssetsBatchItem`(`creative_assets_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsBatchItem`
--
UPDATE `CatalogsCreativeAssetsBatchItem` SET `creative_assets_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsBatchItem`
--
DELETE FROM `CatalogsCreativeAssetsBatchItem` WHERE 0;

