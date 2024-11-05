--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsBatchRequest`
--
SELECT `catalog_type`, `country`, `language`, `items`, `catalog_id` FROM `CatalogsCreativeAssetsBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsBatchRequest`
--
INSERT INTO `CatalogsCreativeAssetsBatchRequest`(`catalog_type`, `country`, `language`, `items`, `catalog_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsBatchRequest`
--
UPDATE `CatalogsCreativeAssetsBatchRequest` SET `catalog_type` = ?, `country` = ?, `language` = ?, `items` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsBatchRequest`
--
DELETE FROM `CatalogsCreativeAssetsBatchRequest` WHERE 0;

