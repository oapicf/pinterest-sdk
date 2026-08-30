--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelCreateRequest' definition.
--


--
-- SELECT template for table `LabelCreateRequest`
--
SELECT `labels` FROM `LabelCreateRequest` WHERE 1;

--
-- INSERT template for table `LabelCreateRequest`
--
INSERT INTO `LabelCreateRequest`(`labels`) VALUES (?);

--
-- UPDATE template for table `LabelCreateRequest`
--
UPDATE `LabelCreateRequest` SET `labels` = ? WHERE 1;

--
-- DELETE template for table `LabelCreateRequest`
--
DELETE FROM `LabelCreateRequest` WHERE 0;

