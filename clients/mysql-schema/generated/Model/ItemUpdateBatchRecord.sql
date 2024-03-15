--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemUpdateBatchRecord' definition.
--


--
-- SELECT template for table `ItemUpdateBatchRecord`
--
SELECT `item_id`, `attributes`, `update_mask` FROM `ItemUpdateBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemUpdateBatchRecord`
--
INSERT INTO `ItemUpdateBatchRecord`(`item_id`, `attributes`, `update_mask`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemUpdateBatchRecord`
--
UPDATE `ItemUpdateBatchRecord` SET `item_id` = ?, `attributes` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `ItemUpdateBatchRecord`
--
DELETE FROM `ItemUpdateBatchRecord` WHERE 0;

