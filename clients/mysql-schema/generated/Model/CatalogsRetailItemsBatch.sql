--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsRetailItemsBatch`
--
SELECT `batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items` FROM `CatalogsRetailItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemsBatch`
--
INSERT INTO `CatalogsRetailItemsBatch`(`batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemsBatch`
--
UPDATE `CatalogsRetailItemsBatch` SET `batch_id` = ?, `created_time` = ?, `completed_time` = ?, `status` = ?, `catalog_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemsBatch`
--
DELETE FROM `CatalogsRetailItemsBatch` WHERE 0;

