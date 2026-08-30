--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemResponse' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemResponse`
--
SELECT `attributes`, `catalog_type`, `creative_assets_id`, `item_response_kind`, `pins` FROM `CatalogsCreativeAssetsItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemResponse`
--
INSERT INTO `CatalogsCreativeAssetsItemResponse`(`attributes`, `catalog_type`, `creative_assets_id`, `item_response_kind`, `pins`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemResponse`
--
UPDATE `CatalogsCreativeAssetsItemResponse` SET `attributes` = ?, `catalog_type` = ?, `creative_assets_id` = ?, `item_response_kind` = ?, `pins` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemResponse`
--
DELETE FROM `CatalogsCreativeAssetsItemResponse` WHERE 0;

