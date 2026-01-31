--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemErrorResponse' definition.
--


--
-- SELECT template for table `CatalogsHotelItemErrorResponse`
--
SELECT `catalog_type`, `errors`, `hotel_id` FROM `CatalogsHotelItemErrorResponse` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemErrorResponse`
--
INSERT INTO `CatalogsHotelItemErrorResponse`(`catalog_type`, `errors`, `hotel_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemErrorResponse`
--
UPDATE `CatalogsHotelItemErrorResponse` SET `catalog_type` = ?, `errors` = ?, `hotel_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemErrorResponse`
--
DELETE FROM `CatalogsHotelItemErrorResponse` WHERE 0;

