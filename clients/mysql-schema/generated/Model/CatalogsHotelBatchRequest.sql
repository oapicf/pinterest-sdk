--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelBatchRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `items`, `language` FROM `CatalogsHotelBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelBatchRequest`
--
INSERT INTO `CatalogsHotelBatchRequest`(`catalog_id`, `catalog_type`, `country`, `items`, `language`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelBatchRequest`
--
UPDATE `CatalogsHotelBatchRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `items` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelBatchRequest`
--
DELETE FROM `CatalogsHotelBatchRequest` WHERE 0;

