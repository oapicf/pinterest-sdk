--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsItemsBatch`
--
SELECT `catalog_type`, `batch_id`, `completed_time`, `created_time`, `items`, `status` FROM `CatalogsItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsItemsBatch`
--
INSERT INTO `CatalogsItemsBatch`(`catalog_type`, `batch_id`, `completed_time`, `created_time`, `items`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsBatch`
--
UPDATE `CatalogsItemsBatch` SET `catalog_type` = ?, `batch_id` = ?, `completed_time` = ?, `created_time` = ?, `items` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsBatch`
--
DELETE FROM `CatalogsItemsBatch` WHERE 0;

