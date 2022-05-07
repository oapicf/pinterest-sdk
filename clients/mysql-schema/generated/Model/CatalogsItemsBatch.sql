--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsItemsBatch`
--
SELECT `items`, `batch_id`, `created_time`, `completed_time`, `status` FROM `CatalogsItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsItemsBatch`
--
INSERT INTO `CatalogsItemsBatch`(`items`, `batch_id`, `created_time`, `completed_time`, `status`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsBatch`
--
UPDATE `CatalogsItemsBatch` SET `items` = ?, `batch_id` = ?, `created_time` = ?, `completed_time` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsBatch`
--
DELETE FROM `CatalogsItemsBatch` WHERE 0;

