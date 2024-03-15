--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemBatchRecord' definition.
--


--
-- SELECT template for table `ItemBatchRecord`
--
SELECT `item_id`, `attributes`, `update_mask` FROM `ItemBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemBatchRecord`
--
INSERT INTO `ItemBatchRecord`(`item_id`, `attributes`, `update_mask`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemBatchRecord`
--
UPDATE `ItemBatchRecord` SET `item_id` = ?, `attributes` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `ItemBatchRecord`
--
DELETE FROM `ItemBatchRecord` WHERE 0;

