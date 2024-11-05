--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemsFilter`
--
SELECT `catalog_type`, `creative_assets_ids`, `catalog_id` FROM `CatalogsCreativeAssetsItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemsFilter`
--
INSERT INTO `CatalogsCreativeAssetsItemsFilter`(`catalog_type`, `creative_assets_ids`, `catalog_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemsFilter`
--
UPDATE `CatalogsCreativeAssetsItemsFilter` SET `catalog_type` = ?, `creative_assets_ids` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemsFilter`
--
DELETE FROM `CatalogsCreativeAssetsItemsFilter` WHERE 0;

