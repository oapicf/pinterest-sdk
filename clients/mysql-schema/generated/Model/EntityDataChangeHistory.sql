--
-- Pinterest REST API.
-- Prepared SQL queries for 'EntityDataChangeHistory' definition.
--


--
-- SELECT template for table `EntityDataChangeHistory`
--
SELECT `changed_field_id`, `changed_field_name`, `data_type`, `new_data_value`, `old_data_value` FROM `EntityDataChangeHistory` WHERE 1;

--
-- INSERT template for table `EntityDataChangeHistory`
--
INSERT INTO `EntityDataChangeHistory`(`changed_field_id`, `changed_field_name`, `data_type`, `new_data_value`, `old_data_value`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `EntityDataChangeHistory`
--
UPDATE `EntityDataChangeHistory` SET `changed_field_id` = ?, `changed_field_name` = ?, `data_type` = ?, `new_data_value` = ?, `old_data_value` = ? WHERE 1;

--
-- DELETE template for table `EntityDataChangeHistory`
--
DELETE FROM `EntityDataChangeHistory` WHERE 0;

