--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsFilter`
--
SELECT `catalog_id`, `catalog_type`, `hotel_ids` FROM `CatalogsHotelItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsFilter`
--
INSERT INTO `CatalogsHotelItemsFilter`(`catalog_id`, `catalog_type`, `hotel_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsFilter`
--
UPDATE `CatalogsHotelItemsFilter` SET `catalog_id` = ?, `catalog_type` = ?, `hotel_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsFilter`
--
DELETE FROM `CatalogsHotelItemsFilter` WHERE 0;

