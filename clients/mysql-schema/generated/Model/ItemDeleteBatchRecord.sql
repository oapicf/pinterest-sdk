--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemDeleteBatchRecord' definition.
--


--
-- SELECT template for table `ItemDeleteBatchRecord`
--
SELECT `item_id` FROM `ItemDeleteBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemDeleteBatchRecord`
--
INSERT INTO `ItemDeleteBatchRecord`(`item_id`) VALUES (?);

--
-- UPDATE template for table `ItemDeleteBatchRecord`
--
UPDATE `ItemDeleteBatchRecord` SET `item_id` = ? WHERE 1;

--
-- DELETE template for table `ItemDeleteBatchRecord`
--
DELETE FROM `ItemDeleteBatchRecord` WHERE 0;

