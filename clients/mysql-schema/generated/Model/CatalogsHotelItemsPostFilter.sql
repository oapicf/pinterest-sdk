--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsPostFilter' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsPostFilter`
--
SELECT `catalog_type`, `hotel_ids`, `catalog_id` FROM `CatalogsHotelItemsPostFilter` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsPostFilter`
--
INSERT INTO `CatalogsHotelItemsPostFilter`(`catalog_type`, `hotel_ids`, `catalog_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsPostFilter`
--
UPDATE `CatalogsHotelItemsPostFilter` SET `catalog_type` = ?, `hotel_ids` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsPostFilter`
--
DELETE FROM `CatalogsHotelItemsPostFilter` WHERE 0;

