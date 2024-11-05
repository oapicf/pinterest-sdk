--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelListProductsByCatalogBasedFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
SELECT `catalog_type`, `catalog_id`, `filters` FROM `CatalogsHotelListProductsByCatalogBasedFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
INSERT INTO `CatalogsHotelListProductsByCatalogBasedFilterRequest`(`catalog_type`, `catalog_id`, `filters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
UPDATE `CatalogsHotelListProductsByCatalogBasedFilterRequest` SET `catalog_type` = ?, `catalog_id` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelListProductsByCatalogBasedFilterRequest`
--
DELETE FROM `CatalogsHotelListProductsByCatalogBasedFilterRequest` WHERE 0;

