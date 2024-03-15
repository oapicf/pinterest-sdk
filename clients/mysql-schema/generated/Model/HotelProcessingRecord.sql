--
-- Pinterest REST API.
-- Prepared SQL queries for 'HotelProcessingRecord' definition.
--


--
-- SELECT template for table `HotelProcessingRecord`
--
SELECT `hotel_id`, `errors`, `warnings`, `status` FROM `HotelProcessingRecord` WHERE 1;

--
-- INSERT template for table `HotelProcessingRecord`
--
INSERT INTO `HotelProcessingRecord`(`hotel_id`, `errors`, `warnings`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `HotelProcessingRecord`
--
UPDATE `HotelProcessingRecord` SET `hotel_id` = ?, `errors` = ?, `warnings` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `HotelProcessingRecord`
--
DELETE FROM `HotelProcessingRecord` WHERE 0;

