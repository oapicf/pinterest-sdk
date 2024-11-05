--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupProductCounts' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupProductCounts`
--
SELECT `catalog_type`, `total` FROM `CatalogsHotelProductGroupProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupProductCounts`
--
INSERT INTO `CatalogsHotelProductGroupProductCounts`(`catalog_type`, `total`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupProductCounts`
--
UPDATE `CatalogsHotelProductGroupProductCounts` SET `catalog_type` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupProductCounts`
--
DELETE FROM `CatalogsHotelProductGroupProductCounts` WHERE 0;

