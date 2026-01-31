--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelCreateRequest' definition.
--


--
-- SELECT template for table `LabelCreateRequest`
--
SELECT `labels`, `parent_id` FROM `LabelCreateRequest` WHERE 1;

--
-- INSERT template for table `LabelCreateRequest`
--
INSERT INTO `LabelCreateRequest`(`labels`, `parent_id`) VALUES (?, ?);

--
-- UPDATE template for table `LabelCreateRequest`
--
UPDATE `LabelCreateRequest` SET `labels` = ?, `parent_id` = ? WHERE 1;

--
-- DELETE template for table `LabelCreateRequest`
--
DELETE FROM `LabelCreateRequest` WHERE 0;

