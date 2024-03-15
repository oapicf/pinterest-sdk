--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemResponse' definition.
--


--
-- SELECT template for table `CatalogsHotelItemResponse`
--
SELECT `catalog_type`, `hotel_id`, `pins`, `attributes` FROM `CatalogsHotelItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemResponse`
--
INSERT INTO `CatalogsHotelItemResponse`(`catalog_type`, `hotel_id`, `pins`, `attributes`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemResponse`
--
UPDATE `CatalogsHotelItemResponse` SET `catalog_type` = ?, `hotel_id` = ?, `pins` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemResponse`
--
DELETE FROM `CatalogsHotelItemResponse` WHERE 0;

