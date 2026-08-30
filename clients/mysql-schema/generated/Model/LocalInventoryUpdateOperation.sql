--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryUpdateOperation' definition.
--


--
-- SELECT template for table `LocalInventoryUpdateOperation`
--
SELECT `attributes`, `item_id`, `operation`, `store_code` FROM `LocalInventoryUpdateOperation` WHERE 1;

--
-- INSERT template for table `LocalInventoryUpdateOperation`
--
INSERT INTO `LocalInventoryUpdateOperation`(`attributes`, `item_id`, `operation`, `store_code`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryUpdateOperation`
--
UPDATE `LocalInventoryUpdateOperation` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryUpdateOperation`
--
DELETE FROM `LocalInventoryUpdateOperation` WHERE 0;

