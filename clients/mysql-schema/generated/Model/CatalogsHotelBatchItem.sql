--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelBatchItem' definition.
--


--
-- SELECT template for table `CatalogsHotelBatchItem`
--
SELECT `hotel_id`, `operation`, `attributes` FROM `CatalogsHotelBatchItem` WHERE 1;

--
-- INSERT template for table `CatalogsHotelBatchItem`
--
INSERT INTO `CatalogsHotelBatchItem`(`hotel_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelBatchItem`
--
UPDATE `CatalogsHotelBatchItem` SET `hotel_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelBatchItem`
--
DELETE FROM `CatalogsHotelBatchItem` WHERE 0;

