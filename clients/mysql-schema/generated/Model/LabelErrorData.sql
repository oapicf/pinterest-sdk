--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelErrorData' definition.
--


--
-- SELECT template for table `LabelErrorData`
--
SELECT `id`, `label_type`, `status`, `value` FROM `LabelErrorData` WHERE 1;

--
-- INSERT template for table `LabelErrorData`
--
INSERT INTO `LabelErrorData`(`id`, `label_type`, `status`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LabelErrorData`
--
UPDATE `LabelErrorData` SET `id` = ?, `label_type` = ?, `status` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelErrorData`
--
DELETE FROM `LabelErrorData` WHERE 0;

