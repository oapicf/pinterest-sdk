--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemProcessingRecord' definition.
--


--
-- SELECT template for table `ItemProcessingRecord`
--
SELECT `errors`, `item_id`, `status`, `warnings` FROM `ItemProcessingRecord` WHERE 1;

--
-- INSERT template for table `ItemProcessingRecord`
--
INSERT INTO `ItemProcessingRecord`(`errors`, `item_id`, `status`, `warnings`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ItemProcessingRecord`
--
UPDATE `ItemProcessingRecord` SET `errors` = ?, `item_id` = ?, `status` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `ItemProcessingRecord`
--
DELETE FROM `ItemProcessingRecord` WHERE 0;

