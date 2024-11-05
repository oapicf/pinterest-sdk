--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserData_anyOf' definition.
--


--
-- SELECT template for table `ConversionEventsUserData_anyOf`
--
SELECT `em`, `hashed_maids`, `client_ip_address`, `client_user_agent` FROM `ConversionEventsUserData_anyOf` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserData_anyOf`
--
INSERT INTO `ConversionEventsUserData_anyOf`(`em`, `hashed_maids`, `client_ip_address`, `client_user_agent`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserData_anyOf`
--
UPDATE `ConversionEventsUserData_anyOf` SET `em` = ?, `hashed_maids` = ?, `client_ip_address` = ?, `client_user_agent` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserData_anyOf`
--
DELETE FROM `ConversionEventsUserData_anyOf` WHERE 0;

