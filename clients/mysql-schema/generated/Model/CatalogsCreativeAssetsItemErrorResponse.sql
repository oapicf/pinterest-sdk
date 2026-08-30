--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemErrorResponse' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemErrorResponse`
--
SELECT `catalog_type`, `creative_assets_id`, `errors`, `item_response_kind` FROM `CatalogsCreativeAssetsItemErrorResponse` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemErrorResponse`
--
INSERT INTO `CatalogsCreativeAssetsItemErrorResponse`(`catalog_type`, `creative_assets_id`, `errors`, `item_response_kind`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemErrorResponse`
--
UPDATE `CatalogsCreativeAssetsItemErrorResponse` SET `catalog_type` = ?, `creative_assets_id` = ?, `errors` = ?, `item_response_kind` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemErrorResponse`
--
DELETE FROM `CatalogsCreativeAssetsItemErrorResponse` WHERE 0;

