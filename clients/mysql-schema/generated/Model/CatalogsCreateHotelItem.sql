--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateHotelItem' definition.
--


--
-- SELECT template for table `CatalogsCreateHotelItem`
--
SELECT `attributes`, `hotel_id`, `operation` FROM `CatalogsCreateHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateHotelItem`
--
INSERT INTO `CatalogsCreateHotelItem`(`attributes`, `hotel_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateHotelItem`
--
UPDATE `CatalogsCreateHotelItem` SET `attributes` = ?, `hotel_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateHotelItem`
--
DELETE FROM `CatalogsCreateHotelItem` WHERE 0;

