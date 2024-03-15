--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsDeleteHotelItem' definition.
--


--
-- SELECT template for table `CatalogsDeleteHotelItem`
--
SELECT `hotel_id`, `operation` FROM `CatalogsDeleteHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsDeleteHotelItem`
--
INSERT INTO `CatalogsDeleteHotelItem`(`hotel_id`, `operation`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsDeleteHotelItem`
--
UPDATE `CatalogsDeleteHotelItem` SET `hotel_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsDeleteHotelItem`
--
DELETE FROM `CatalogsDeleteHotelItem` WHERE 0;

