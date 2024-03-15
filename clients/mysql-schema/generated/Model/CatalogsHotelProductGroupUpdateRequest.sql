--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupUpdateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters` FROM `CatalogsHotelProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupUpdateRequest`
--
INSERT INTO `CatalogsHotelProductGroupUpdateRequest`(`catalog_type`, `name`, `description`, `filters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupUpdateRequest`
--
UPDATE `CatalogsHotelProductGroupUpdateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupUpdateRequest`
--
DELETE FROM `CatalogsHotelProductGroupUpdateRequest` WHERE 0;

