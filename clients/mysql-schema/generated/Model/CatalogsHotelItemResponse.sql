--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemResponse' definition.
--


--
-- SELECT template for table `CatalogsHotelItemResponse`
--
SELECT `attributes`, `catalog_type`, `hotel_id`, `item_response_kind`, `pins` FROM `CatalogsHotelItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemResponse`
--
INSERT INTO `CatalogsHotelItemResponse`(`attributes`, `catalog_type`, `hotel_id`, `item_response_kind`, `pins`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemResponse`
--
UPDATE `CatalogsHotelItemResponse` SET `attributes` = ?, `catalog_type` = ?, `hotel_id` = ?, `item_response_kind` = ?, `pins` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemResponse`
--
DELETE FROM `CatalogsHotelItemResponse` WHERE 0;

