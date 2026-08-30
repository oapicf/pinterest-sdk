--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryUpsertOperation' definition.
--


--
-- SELECT template for table `LocalInventoryUpsertOperation`
--
SELECT `attributes`, `item_id`, `operation`, `store_code` FROM `LocalInventoryUpsertOperation` WHERE 1;

--
-- INSERT template for table `LocalInventoryUpsertOperation`
--
INSERT INTO `LocalInventoryUpsertOperation`(`attributes`, `item_id`, `operation`, `store_code`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryUpsertOperation`
--
UPDATE `LocalInventoryUpsertOperation` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryUpsertOperation`
--
DELETE FROM `LocalInventoryUpsertOperation` WHERE 0;

