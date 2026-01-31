--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsPostFilter' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsPostFilter`
--
SELECT `catalog_id`, `catalog_type`, `hotel_ids` FROM `CatalogsHotelItemsPostFilter` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsPostFilter`
--
INSERT INTO `CatalogsHotelItemsPostFilter`(`catalog_id`, `catalog_type`, `hotel_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsPostFilter`
--
UPDATE `CatalogsHotelItemsPostFilter` SET `catalog_id` = ?, `catalog_type` = ?, `hotel_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsPostFilter`
--
DELETE FROM `CatalogsHotelItemsPostFilter` WHERE 0;

