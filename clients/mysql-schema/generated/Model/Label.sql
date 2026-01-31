--
-- Pinterest REST API.
-- Prepared SQL queries for 'Label' definition.
--


--
-- SELECT template for table `Label`
--
SELECT `id`, `label_type`, `parent_id`, `parent_type`, `status`, `value` FROM `Label` WHERE 1;

--
-- INSERT template for table `Label`
--
INSERT INTO `Label`(`id`, `label_type`, `parent_id`, `parent_type`, `status`, `value`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Label`
--
UPDATE `Label` SET `id` = ?, `label_type` = ?, `parent_id` = ?, `parent_type` = ?, `status` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `Label`
--
DELETE FROM `Label` WHERE 0;

