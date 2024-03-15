--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertHotelItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertHotelItem`
--
SELECT `hotel_id`, `operation`, `attributes` FROM `CatalogsUpsertHotelItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertHotelItem`
--
INSERT INTO `CatalogsUpsertHotelItem`(`hotel_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertHotelItem`
--
UPDATE `CatalogsUpsertHotelItem` SET `hotel_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertHotelItem`
--
DELETE FROM `CatalogsUpsertHotelItem` WHERE 0;

