--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`
--
SELECT `catalog_type`, `catalog_id`, `filters` FROM `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`
--
INSERT INTO `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`(`catalog_type`, `catalog_id`, `filters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`
--
UPDATE `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` SET `catalog_type` = ?, `catalog_id` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest`
--
DELETE FROM `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` WHERE 0;

