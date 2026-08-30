--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryCreateOperation' definition.
--


--
-- SELECT template for table `LocalInventoryCreateOperation`
--
SELECT `attributes`, `item_id`, `operation`, `store_code` FROM `LocalInventoryCreateOperation` WHERE 1;

--
-- INSERT template for table `LocalInventoryCreateOperation`
--
INSERT INTO `LocalInventoryCreateOperation`(`attributes`, `item_id`, `operation`, `store_code`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryCreateOperation`
--
UPDATE `LocalInventoryCreateOperation` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryCreateOperation`
--
DELETE FROM `LocalInventoryCreateOperation` WHERE 0;

