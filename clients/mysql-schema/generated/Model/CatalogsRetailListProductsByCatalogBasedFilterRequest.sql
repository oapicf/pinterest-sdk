--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailListProductsByCatalogBasedFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailListProductsByCatalogBasedFilterRequest`
--
SELECT `catalog_type`, `catalog_id`, `filters`, `country`, `locale` FROM `CatalogsRetailListProductsByCatalogBasedFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailListProductsByCatalogBasedFilterRequest`
--
INSERT INTO `CatalogsRetailListProductsByCatalogBasedFilterRequest`(`catalog_type`, `catalog_id`, `filters`, `country`, `locale`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailListProductsByCatalogBasedFilterRequest`
--
UPDATE `CatalogsRetailListProductsByCatalogBasedFilterRequest` SET `catalog_type` = ?, `catalog_id` = ?, `filters` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailListProductsByCatalogBasedFilterRequest`
--
DELETE FROM `CatalogsRetailListProductsByCatalogBasedFilterRequest` WHERE 0;

