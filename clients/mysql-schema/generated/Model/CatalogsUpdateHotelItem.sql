--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateHotelItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateHotelItem`
--
SELECT `hotel_id`, `operation`, `attributes` FROM `CatalogsUpdateHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateHotelItem`
--
INSERT INTO `CatalogsUpdateHotelItem`(`hotel_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateHotelItem`
--
UPDATE `CatalogsUpdateHotelItem` SET `hotel_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateHotelItem`
--
DELETE FROM `CatalogsUpdateHotelItem` WHERE 0;

