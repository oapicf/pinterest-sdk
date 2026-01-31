--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemsFilter`
--
SELECT `catalog_id`, `catalog_type`, `creative_assets_ids` FROM `CatalogsCreativeAssetsItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemsFilter`
--
INSERT INTO `CatalogsCreativeAssetsItemsFilter`(`catalog_id`, `catalog_type`, `creative_assets_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemsFilter`
--
UPDATE `CatalogsCreativeAssetsItemsFilter` SET `catalog_id` = ?, `catalog_type` = ?, `creative_assets_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemsFilter`
--
DELETE FROM `CatalogsCreativeAssetsItemsFilter` WHERE 0;

