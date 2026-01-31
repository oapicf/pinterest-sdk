--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `description`, `filters`, `name` FROM `CatalogsHotelProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupCreateRequest`
--
INSERT INTO `CatalogsHotelProductGroupCreateRequest`(`catalog_id`, `catalog_type`, `description`, `filters`, `name`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupCreateRequest`
--
UPDATE `CatalogsHotelProductGroupCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `description` = ?, `filters` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupCreateRequest`
--
DELETE FROM `CatalogsHotelProductGroupCreateRequest` WHERE 0;

