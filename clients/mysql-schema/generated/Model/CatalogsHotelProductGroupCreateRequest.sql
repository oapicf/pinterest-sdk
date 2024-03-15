--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupCreateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `catalog_id` FROM `CatalogsHotelProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupCreateRequest`
--
INSERT INTO `CatalogsHotelProductGroupCreateRequest`(`catalog_type`, `name`, `description`, `filters`, `catalog_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupCreateRequest`
--
UPDATE `CatalogsHotelProductGroupCreateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupCreateRequest`
--
DELETE FROM `CatalogsHotelProductGroupCreateRequest` WHERE 0;

