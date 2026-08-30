--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelUpdateItem' definition.
--


--
-- SELECT template for table `LabelUpdateItem`
--
SELECT `id`, `status`, `value` FROM `LabelUpdateItem` WHERE 1;

--
-- INSERT template for table `LabelUpdateItem`
--
INSERT INTO `LabelUpdateItem`(`id`, `status`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LabelUpdateItem`
--
UPDATE `LabelUpdateItem` SET `id` = ?, `status` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `LabelUpdateItem`
--
DELETE FROM `LabelUpdateItem` WHERE 0;

