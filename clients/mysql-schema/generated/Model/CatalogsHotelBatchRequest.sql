--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelBatchRequest`
--
SELECT `catalog_type`, `country`, `language`, `items`, `catalog_id` FROM `CatalogsHotelBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelBatchRequest`
--
INSERT INTO `CatalogsHotelBatchRequest`(`catalog_type`, `country`, `language`, `items`, `catalog_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelBatchRequest`
--
UPDATE `CatalogsHotelBatchRequest` SET `catalog_type` = ?, `country` = ?, `language` = ?, `items` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelBatchRequest`
--
DELETE FROM `CatalogsHotelBatchRequest` WHERE 0;

