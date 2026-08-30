--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailBatchRequestItemsItems' definition.
--


--
-- SELECT template for table `CatalogsRetailBatchRequestItemsItems`
--
SELECT `attributes`, `item_id`, `operation`, `update_mask`, `last_updated_time` FROM `CatalogsRetailBatchRequestItemsItems` WHERE 1;

--
-- INSERT template for table `CatalogsRetailBatchRequestItemsItems`
--
INSERT INTO `CatalogsRetailBatchRequestItemsItems`(`attributes`, `item_id`, `operation`, `update_mask`, `last_updated_time`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailBatchRequestItemsItems`
--
UPDATE `CatalogsRetailBatchRequestItemsItems` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `update_mask` = ?, `last_updated_time` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailBatchRequestItemsItems`
--
DELETE FROM `CatalogsRetailBatchRequestItemsItems` WHERE 0;

