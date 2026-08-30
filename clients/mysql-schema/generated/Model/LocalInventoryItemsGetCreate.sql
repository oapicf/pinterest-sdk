--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryItemsGetCreate' definition.
--


--
-- SELECT template for table `LocalInventoryItemsGetCreate`
--
SELECT `item_filters` FROM `LocalInventoryItemsGetCreate` WHERE 1;

--
-- INSERT template for table `LocalInventoryItemsGetCreate`
--
INSERT INTO `LocalInventoryItemsGetCreate`(`item_filters`) VALUES (?);

--
-- UPDATE template for table `LocalInventoryItemsGetCreate`
--
UPDATE `LocalInventoryItemsGetCreate` SET `item_filters` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryItemsGetCreate`
--
DELETE FROM `LocalInventoryItemsGetCreate` WHERE 0;

