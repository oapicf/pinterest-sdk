--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemUpdateBatchRecord' definition.
--


--
-- SELECT template for table `ItemUpdateBatchRecord`
--
SELECT `attributes`, `item_id`, `update_mask` FROM `ItemUpdateBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemUpdateBatchRecord`
--
INSERT INTO `ItemUpdateBatchRecord`(`attributes`, `item_id`, `update_mask`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemUpdateBatchRecord`
--
UPDATE `ItemUpdateBatchRecord` SET `attributes` = ?, `item_id` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `ItemUpdateBatchRecord`
--
DELETE FROM `ItemUpdateBatchRecord` WHERE 0;

