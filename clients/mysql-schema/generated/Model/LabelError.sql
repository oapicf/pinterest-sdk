--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelError' definition.
--


--
-- SELECT template for table `LabelError`
--
SELECT `data`, `error_messages` FROM `LabelError` WHERE 1;

--
-- INSERT template for table `LabelError`
--
INSERT INTO `LabelError`(`data`, `error_messages`) VALUES (?, ?);

--
-- UPDATE template for table `LabelError`
--
UPDATE `LabelError` SET `data` = ?, `error_messages` = ? WHERE 1;

--
-- DELETE template for table `LabelError`
--
DELETE FROM `LabelError` WHERE 0;

