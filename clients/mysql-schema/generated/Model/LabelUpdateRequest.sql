--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelUpdateRequest' definition.
--


--
-- SELECT template for table `LabelUpdateRequest`
--
SELECT `labels` FROM `LabelUpdateRequest` WHERE 1;

--
-- INSERT template for table `LabelUpdateRequest`
--
INSERT INTO `LabelUpdateRequest`(`labels`) VALUES (?);

--
-- UPDATE template for table `LabelUpdateRequest`
--
UPDATE `LabelUpdateRequest` SET `labels` = ? WHERE 1;

--
-- DELETE template for table `LabelUpdateRequest`
--
DELETE FROM `LabelUpdateRequest` WHERE 0;

