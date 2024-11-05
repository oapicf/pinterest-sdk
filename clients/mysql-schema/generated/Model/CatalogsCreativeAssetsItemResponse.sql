--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemResponse' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemResponse`
--
SELECT `catalog_type`, `creative_assets_id`, `pins`, `attributes` FROM `CatalogsCreativeAssetsItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemResponse`
--
INSERT INTO `CatalogsCreativeAssetsItemResponse`(`catalog_type`, `creative_assets_id`, `pins`, `attributes`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemResponse`
--
UPDATE `CatalogsCreativeAssetsItemResponse` SET `catalog_type` = ?, `creative_assets_id` = ?, `pins` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemResponse`
--
DELETE FROM `CatalogsCreativeAssetsItemResponse` WHERE 0;

