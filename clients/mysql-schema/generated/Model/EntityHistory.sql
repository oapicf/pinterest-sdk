--
-- Pinterest REST API.
-- Prepared SQL queries for 'EntityHistory' definition.
--


--
-- SELECT template for table `EntityHistory`
--
SELECT `change_timestamp`, `data_changes`, `entity_id`, `entity_name`, `ldap`, `operation`, `user_id` FROM `EntityHistory` WHERE 1;

--
-- INSERT template for table `EntityHistory`
--
INSERT INTO `EntityHistory`(`change_timestamp`, `data_changes`, `entity_id`, `entity_name`, `ldap`, `operation`, `user_id`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EntityHistory`
--
UPDATE `EntityHistory` SET `change_timestamp` = ?, `data_changes` = ?, `entity_id` = ?, `entity_name` = ?, `ldap` = ?, `operation` = ?, `user_id` = ? WHERE 1;

--
-- DELETE template for table `EntityHistory`
--
DELETE FROM `EntityHistory` WHERE 0;

