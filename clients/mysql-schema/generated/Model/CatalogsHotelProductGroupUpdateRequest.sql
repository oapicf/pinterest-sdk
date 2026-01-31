--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupUpdateRequest`
--
SELECT `catalog_type`, `description`, `filters`, `name` FROM `CatalogsHotelProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupUpdateRequest`
--
INSERT INTO `CatalogsHotelProductGroupUpdateRequest`(`catalog_type`, `description`, `filters`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupUpdateRequest`
--
UPDATE `CatalogsHotelProductGroupUpdateRequest` SET `catalog_type` = ?, `description` = ?, `filters` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupUpdateRequest`
--
DELETE FROM `CatalogsHotelProductGroupUpdateRequest` WHERE 0;

