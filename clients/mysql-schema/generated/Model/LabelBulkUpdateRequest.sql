--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelBulkUpdateRequest' definition.
--


--
-- SELECT template for table `LabelBulkUpdateRequest`
--
SELECT `id`, `status`, `value` FROM `LabelBulkUpdateRequest` WHERE 1;

--
-- INSERT template for table `LabelBulkUpdateRequest`
--
INSERT INTO `LabelBulkUpdateRequest`(`id`, `status`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LabelBulkUpdateRequest`
--
UPDATE `LabelBulkUpdateRequest` SET `id` = ?, `status` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelBulkUpdateRequest`
--
DELETE FROM `LabelBulkUpdateRequest` WHERE 0;

