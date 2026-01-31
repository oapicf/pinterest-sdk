--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertHotelItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertHotelItem`
--
SELECT `attributes`, `hotel_id`, `operation` FROM `CatalogsUpsertHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertHotelItem`
--
INSERT INTO `CatalogsUpsertHotelItem`(`attributes`, `hotel_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertHotelItem`
--
UPDATE `CatalogsUpsertHotelItem` SET `attributes` = ?, `hotel_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertHotelItem`
--
DELETE FROM `CatalogsUpsertHotelItem` WHERE 0;

