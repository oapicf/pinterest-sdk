--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemUpsertBatchRecord' definition.
--


--
-- SELECT template for table `ItemUpsertBatchRecord`
--
SELECT `item_id`, `attributes` FROM `ItemUpsertBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemUpsertBatchRecord`
--
INSERT INTO `ItemUpsertBatchRecord`(`item_id`, `attributes`) VALUES (?, ?);

--
-- UPDATE template for table `ItemUpsertBatchRecord`
--
UPDATE `ItemUpsertBatchRecord` SET `item_id` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `ItemUpsertBatchRecord`
--
DELETE FROM `ItemUpsertBatchRecord` WHERE 0;

