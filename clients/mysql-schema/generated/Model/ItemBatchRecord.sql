--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemBatchRecord' definition.
--


--
-- SELECT template for table `ItemBatchRecord`
--
SELECT `attributes`, `item_id`, `update_mask` FROM `ItemBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemBatchRecord`
--
INSERT INTO `ItemBatchRecord`(`attributes`, `item_id`, `update_mask`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemBatchRecord`
--
UPDATE `ItemBatchRecord` SET `attributes` = ?, `item_id` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `ItemBatchRecord`
--
DELETE FROM `ItemBatchRecord` WHERE 0;

