--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemErrorResponse' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemErrorResponse`
--
SELECT `catalog_type`, `creative_assets_id`, `errors` FROM `CatalogsCreativeAssetsItemErrorResponse` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemErrorResponse`
--
INSERT INTO `CatalogsCreativeAssetsItemErrorResponse`(`catalog_type`, `creative_assets_id`, `errors`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemErrorResponse`
--
UPDATE `CatalogsCreativeAssetsItemErrorResponse` SET `catalog_type` = ?, `creative_assets_id` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemErrorResponse`
--
DELETE FROM `CatalogsCreativeAssetsItemErrorResponse` WHERE 0;

