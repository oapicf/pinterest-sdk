--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemProcessingRecord' definition.
--


--
-- SELECT template for table `ItemProcessingRecord`
--
SELECT `item_id`, `errors`, `warnings`, `status` FROM `ItemProcessingRecord` WHERE 1;

--
-- INSERT template for table `ItemProcessingRecord`
--
INSERT INTO `ItemProcessingRecord`(`item_id`, `errors`, `warnings`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ItemProcessingRecord`
--
UPDATE `ItemProcessingRecord` SET `item_id` = ?, `errors` = ?, `warnings` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `ItemProcessingRecord`
--
DELETE FROM `ItemProcessingRecord` WHERE 0;

