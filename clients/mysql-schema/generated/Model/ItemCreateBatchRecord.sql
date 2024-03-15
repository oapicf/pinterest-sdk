--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemCreateBatchRecord' definition.
--


--
-- SELECT template for table `ItemCreateBatchRecord`
--
SELECT `item_id`, `attributes` FROM `ItemCreateBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemCreateBatchRecord`
--
INSERT INTO `ItemCreateBatchRecord`(`item_id`, `attributes`) VALUES (?, ?);

--
-- UPDATE template for table `ItemCreateBatchRecord`
--
UPDATE `ItemCreateBatchRecord` SET `item_id` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `ItemCreateBatchRecord`
--
DELETE FROM `ItemCreateBatchRecord` WHERE 0;

