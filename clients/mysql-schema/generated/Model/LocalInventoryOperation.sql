--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryOperation' definition.
--


--
-- SELECT template for table `LocalInventoryOperation`
--
SELECT `attributes`, `item_id`, `operation`, `store_code` FROM `LocalInventoryOperation` WHERE 1;

--
-- INSERT template for table `LocalInventoryOperation`
--
INSERT INTO `LocalInventoryOperation`(`attributes`, `item_id`, `operation`, `store_code`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryOperation`
--
UPDATE `LocalInventoryOperation` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryOperation`
--
DELETE FROM `LocalInventoryOperation` WHERE 0;

