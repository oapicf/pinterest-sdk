--
-- Pinterest REST API.
-- Prepared SQL queries for 'system_user_update_request' definition.
--


--
-- SELECT template for table `system_user_update_request`
--
SELECT `name` FROM `system_user_update_request` WHERE 1;

--
-- INSERT template for table `system_user_update_request`
--
INSERT INTO `system_user_update_request`(`name`) VALUES (?);

--
-- UPDATE template for table `system_user_update_request`
--
UPDATE `system_user_update_request` SET `name` = ? WHERE 1;

--
-- DELETE template for table `system_user_update_request`
--
DELETE FROM `system_user_update_request` WHERE 0;

