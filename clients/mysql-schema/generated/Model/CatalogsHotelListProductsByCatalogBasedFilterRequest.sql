--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelListProductsByCatalogBasedFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
SELECT `catalog_id`, `catalog_type`, `filters` FROM `CatalogsHotelListProductsByCatalogBasedFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
INSERT INTO `CatalogsHotelListProductsByCatalogBasedFilterRequest`(`catalog_id`, `catalog_type`, `filters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
UPDATE `CatalogsHotelListProductsByCatalogBasedFilterRequest` SET `catalog_id` = ?, `catalog_type` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
DELETE FROM `CatalogsHotelListProductsByCatalogBasedFilterRequest` WHERE 0;

