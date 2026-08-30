--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelBulkCreateRequest' definition.
--


--
-- SELECT template for table `LabelBulkCreateRequest`
--
SELECT `labels`, `parent_id` FROM `LabelBulkCreateRequest` WHERE 1;

--
-- INSERT template for table `LabelBulkCreateRequest`
--
INSERT INTO `LabelBulkCreateRequest`(`labels`, `parent_id`) VALUES (?, ?);

--
-- UPDATE template for table `LabelBulkCreateRequest`
--
UPDATE `LabelBulkCreateRequest` SET `labels` = ?, `parent_id` = ? WHERE 1;

--
-- DELETE template for table `LabelBulkCreateRequest`
--
DELETE FROM `LabelBulkCreateRequest` WHERE 0;

