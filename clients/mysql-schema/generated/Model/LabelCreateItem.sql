--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelCreateItem' definition.
--


--
-- SELECT template for table `LabelCreateItem`
--
SELECT `label_type`, `value` FROM `LabelCreateItem` WHERE 1;

--
-- INSERT template for table `LabelCreateItem`
--
INSERT INTO `LabelCreateItem`(`label_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `LabelCreateItem`
--
UPDATE `LabelCreateItem` SET `label_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelCreateItem`
--
DELETE FROM `LabelCreateItem` WHERE 0;

