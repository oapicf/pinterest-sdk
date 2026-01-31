--
-- Pinterest REST API.
-- Prepared SQL queries for 'HotelProcessingRecord' definition.
--


--
-- SELECT template for table `HotelProcessingRecord`
--
SELECT `errors`, `hotel_id`, `status`, `warnings` FROM `HotelProcessingRecord` WHERE 1;

--
-- INSERT template for table `HotelProcessingRecord`
--
INSERT INTO `HotelProcessingRecord`(`errors`, `hotel_id`, `status`, `warnings`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `HotelProcessingRecord`
--
UPDATE `HotelProcessingRecord` SET `errors` = ?, `hotel_id` = ?, `status` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `HotelProcessingRecord`
--
DELETE FROM `HotelProcessingRecord` WHERE 0;

