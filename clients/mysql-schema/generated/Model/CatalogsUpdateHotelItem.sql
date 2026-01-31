--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateHotelItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateHotelItem`
--
SELECT `attributes`, `hotel_id`, `operation` FROM `CatalogsUpdateHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateHotelItem`
--
INSERT INTO `CatalogsUpdateHotelItem`(`attributes`, `hotel_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateHotelItem`
--
UPDATE `CatalogsUpdateHotelItem` SET `attributes` = ?, `hotel_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateHotelItem`
--
DELETE FROM `CatalogsUpdateHotelItem` WHERE 0;

