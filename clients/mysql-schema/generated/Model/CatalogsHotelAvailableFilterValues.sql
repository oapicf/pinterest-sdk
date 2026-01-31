--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelAvailableFilterValues' definition.
--


--
-- SELECT template for table `CatalogsHotelAvailableFilterValues`
--
SELECT `catalog_type`, `filter_values` FROM `CatalogsHotelAvailableFilterValues` WHERE 1;

--
-- INSERT template for table `CatalogsHotelAvailableFilterValues`
--
INSERT INTO `CatalogsHotelAvailableFilterValues`(`catalog_type`, `filter_values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelAvailableFilterValues`
--
UPDATE `CatalogsHotelAvailableFilterValues` SET `catalog_type` = ?, `filter_values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelAvailableFilterValues`
--
DELETE FROM `CatalogsHotelAvailableFilterValues` WHERE 0;

