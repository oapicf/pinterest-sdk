--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`
--
SELECT `catalog_type`, `catalog_id`, `filters`, `country`, `locale` FROM `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`
--
INSERT INTO `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`(`catalog_type`, `catalog_id`, `filters`, `country`, `locale`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`
--
UPDATE `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` SET `catalog_type` = ?, `catalog_id` = ?, `filters` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest`
--
DELETE FROM `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` WHERE 0;

