--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryOperationResult' definition.
--


--
-- SELECT template for table `LocalInventoryOperationResult`
--
SELECT `errors`, `item_id`, `status`, `store_code`, `supplemental_type`, `warnings` FROM `LocalInventoryOperationResult` WHERE 1;

--
-- INSERT template for table `LocalInventoryOperationResult`
--
INSERT INTO `LocalInventoryOperationResult`(`errors`, `item_id`, `status`, `store_code`, `supplemental_type`, `warnings`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryOperationResult`
--
UPDATE `LocalInventoryOperationResult` SET `errors` = ?, `item_id` = ?, `status` = ?, `store_code` = ?, `supplemental_type` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryOperationResult`
--
DELETE FROM `LocalInventoryOperationResult` WHERE 0;

