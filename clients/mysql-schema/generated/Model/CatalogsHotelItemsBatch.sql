--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsBatch`
--
SELECT `batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status` FROM `CatalogsHotelItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsBatch`
--
INSERT INTO `CatalogsHotelItemsBatch`(`batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsBatch`
--
UPDATE `CatalogsHotelItemsBatch` SET `batch_id` = ?, `catalog_type` = ?, `completed_time` = ?, `created_time` = ?, `items` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsBatch`
--
DELETE FROM `CatalogsHotelItemsBatch` WHERE 0;

