--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryItemsBatch' definition.
--


--
-- SELECT template for table `LocalInventoryItemsBatch`
--
SELECT `batch_id`, `completed_time`, `created_time`, `operation_results`, `status` FROM `LocalInventoryItemsBatch` WHERE 1;

--
-- INSERT template for table `LocalInventoryItemsBatch`
--
INSERT INTO `LocalInventoryItemsBatch`(`batch_id`, `completed_time`, `created_time`, `operation_results`, `status`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryItemsBatch`
--
UPDATE `LocalInventoryItemsBatch` SET `batch_id` = ?, `completed_time` = ?, `created_time` = ?, `operation_results` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryItemsBatch`
--
DELETE FROM `LocalInventoryItemsBatch` WHERE 0;

