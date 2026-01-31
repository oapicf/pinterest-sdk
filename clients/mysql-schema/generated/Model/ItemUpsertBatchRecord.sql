--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemUpsertBatchRecord' definition.
--


--
-- SELECT template for table `ItemUpsertBatchRecord`
--
SELECT `attributes`, `item_id` FROM `ItemUpsertBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemUpsertBatchRecord`
--
INSERT INTO `ItemUpsertBatchRecord`(`attributes`, `item_id`) VALUES (?, ?);

--
-- UPDATE template for table `ItemUpsertBatchRecord`
--
UPDATE `ItemUpsertBatchRecord` SET `attributes` = ?, `item_id` = ? WHERE 1;

--
-- DELETE template for table `ItemUpsertBatchRecord`
--
DELETE FROM `ItemUpsertBatchRecord` WHERE 0;

