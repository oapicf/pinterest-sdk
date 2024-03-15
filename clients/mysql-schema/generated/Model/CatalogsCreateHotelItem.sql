--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateHotelItem' definition.
--


--
-- SELECT template for table `CatalogsCreateHotelItem`
--
SELECT `hotel_id`, `operation`, `attributes` FROM `CatalogsCreateHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateHotelItem`
--
INSERT INTO `CatalogsCreateHotelItem`(`hotel_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateHotelItem`
--
UPDATE `CatalogsCreateHotelItem` SET `hotel_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateHotelItem`
--
DELETE FROM `CatalogsCreateHotelItem` WHERE 0;

