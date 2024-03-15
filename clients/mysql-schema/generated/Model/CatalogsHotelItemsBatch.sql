--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsHotelItemsBatch`
--
SELECT `batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items` FROM `CatalogsHotelItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsHotelItemsBatch`
--
INSERT INTO `CatalogsHotelItemsBatch`(`batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelItemsBatch`
--
UPDATE `CatalogsHotelItemsBatch` SET `batch_id` = ?, `created_time` = ?, `completed_time` = ?, `status` = ?, `catalog_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelItemsBatch`
--
DELETE FROM `CatalogsHotelItemsBatch` WHERE 0;

