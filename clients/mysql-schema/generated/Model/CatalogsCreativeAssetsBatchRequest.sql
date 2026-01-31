--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsBatchRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `items`, `language` FROM `CatalogsCreativeAssetsBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsBatchRequest`
--
INSERT INTO `CatalogsCreativeAssetsBatchRequest`(`catalog_id`, `catalog_type`, `country`, `items`, `language`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsBatchRequest`
--
UPDATE `CatalogsCreativeAssetsBatchRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `items` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsBatchRequest`
--
DELETE FROM `CatalogsCreativeAssetsBatchRequest` WHERE 0;

