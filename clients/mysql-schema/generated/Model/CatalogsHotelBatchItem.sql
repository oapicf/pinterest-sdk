--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelBatchItem' definition.
--


--
-- SELECT template for table `CatalogsHotelBatchItem`
--
SELECT `attributes`, `hotel_id`, `operation` FROM `CatalogsHotelBatchItem` WHERE 1;

--
-- INSERT template for table `CatalogsHotelBatchItem`
--
INSERT INTO `CatalogsHotelBatchItem`(`attributes`, `hotel_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelBatchItem`
--
UPDATE `CatalogsHotelBatchItem` SET `attributes` = ?, `hotel_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelBatchItem`
--
DELETE FROM `CatalogsHotelBatchItem` WHERE 0;

