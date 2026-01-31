--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemCreateBatchRecord' definition.
--


--
-- SELECT template for table `ItemCreateBatchRecord`
--
SELECT `attributes`, `item_id` FROM `ItemCreateBatchRecord` WHERE 1;

--
-- INSERT template for table `ItemCreateBatchRecord`
--
INSERT INTO `ItemCreateBatchRecord`(`attributes`, `item_id`) VALUES (?, ?);

--
-- UPDATE template for table `ItemCreateBatchRecord`
--
UPDATE `ItemCreateBatchRecord` SET `attributes` = ?, `item_id` = ? WHERE 1;

--
-- DELETE template for table `ItemCreateBatchRecord`
--
DELETE FROM `ItemCreateBatchRecord` WHERE 0;

