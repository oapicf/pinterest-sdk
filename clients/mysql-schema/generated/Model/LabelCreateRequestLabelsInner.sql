--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelCreateRequest_labels_inner' definition.
--


--
-- SELECT template for table `LabelCreateRequest_labels_inner`
--
SELECT `label_type`, `value` FROM `LabelCreateRequest_labels_inner` WHERE 1;

--
-- INSERT template for table `LabelCreateRequest_labels_inner`
--
INSERT INTO `LabelCreateRequest_labels_inner`(`label_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `LabelCreateRequest_labels_inner`
--
UPDATE `LabelCreateRequest_labels_inner` SET `label_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelCreateRequest_labels_inner`
--
DELETE FROM `LabelCreateRequest_labels_inner` WHERE 0;

