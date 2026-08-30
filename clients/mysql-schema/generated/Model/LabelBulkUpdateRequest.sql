--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelBulkUpdateRequest' definition.
--


--
-- SELECT template for table `LabelBulkUpdateRequest`
--
SELECT `id`, `parent_id`, `status` FROM `LabelBulkUpdateRequest` WHERE 1;

--
-- INSERT template for table `LabelBulkUpdateRequest`
--
INSERT INTO `LabelBulkUpdateRequest`(`id`, `parent_id`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LabelBulkUpdateRequest`
--
UPDATE `LabelBulkUpdateRequest` SET `id` = ?, `parent_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LabelBulkUpdateRequest`
--
DELETE FROM `LabelBulkUpdateRequest` WHERE 0;

