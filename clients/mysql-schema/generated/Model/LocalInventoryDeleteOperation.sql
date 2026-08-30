--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryDeleteOperation' definition.
--


--
-- SELECT template for table `LocalInventoryDeleteOperation`
--
SELECT `item_id`, `operation`, `store_code` FROM `LocalInventoryDeleteOperation` WHERE 1;

--
-- INSERT template for table `LocalInventoryDeleteOperation`
--
INSERT INTO `LocalInventoryDeleteOperation`(`item_id`, `operation`, `store_code`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LocalInventoryDeleteOperation`
--
UPDATE `LocalInventoryDeleteOperation` SET `item_id` = ?, `operation` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryDeleteOperation`
--
DELETE FROM `LocalInventoryDeleteOperation` WHERE 0;

