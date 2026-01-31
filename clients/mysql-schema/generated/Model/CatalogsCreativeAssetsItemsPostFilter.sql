--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsPostFilter' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemsPostFilter`
--
SELECT `catalog_id`, `catalog_type`, `creative_assets_ids` FROM `CatalogsCreativeAssetsItemsPostFilter` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemsPostFilter`
--
INSERT INTO `CatalogsCreativeAssetsItemsPostFilter`(`catalog_id`, `catalog_type`, `creative_assets_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemsPostFilter`
--
UPDATE `CatalogsCreativeAssetsItemsPostFilter` SET `catalog_id` = ?, `catalog_type` = ?, `creative_assets_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemsPostFilter`
--
DELETE FROM `CatalogsCreativeAssetsItemsPostFilter` WHERE 0;

