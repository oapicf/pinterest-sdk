--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsRetailItemsBatch`
--
SELECT `batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status` FROM `CatalogsRetailItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemsBatch`
--
INSERT INTO `CatalogsRetailItemsBatch`(`batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemsBatch`
--
UPDATE `CatalogsRetailItemsBatch` SET `batch_id` = ?, `catalog_type` = ?, `completed_time` = ?, `created_time` = ?, `items` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemsBatch`
--
DELETE FROM `CatalogsRetailItemsBatch` WHERE 0;

