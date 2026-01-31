--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelUpdateRequest_labels_inner' definition.
--


--
-- SELECT template for table `LabelUpdateRequest_labels_inner`
--
SELECT `id`, `status`, `value` FROM `LabelUpdateRequest_labels_inner` WHERE 1;

--
-- INSERT template for table `LabelUpdateRequest_labels_inner`
--
INSERT INTO `LabelUpdateRequest_labels_inner`(`id`, `status`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LabelUpdateRequest_labels_inner`
--
UPDATE `LabelUpdateRequest_labels_inner` SET `id` = ?, `status` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelUpdateRequest_labels_inner`
--
DELETE FROM `LabelUpdateRequest_labels_inner` WHERE 0;

