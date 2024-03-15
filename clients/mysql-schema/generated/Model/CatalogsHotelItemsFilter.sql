--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsFilter`
--
SELECT `catalog_type`, `hotel_ids`, `catalog_id` FROM `CatalogsHotelItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsFilter`
--
INSERT INTO `CatalogsHotelItemsFilter`(`catalog_type`, `hotel_ids`, `catalog_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsFilter`
--
UPDATE `CatalogsHotelItemsFilter` SET `catalog_type` = ?, `hotel_ids` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsFilter`
--
DELETE FROM `CatalogsHotelItemsFilter` WHERE 0;

