--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserData_anyOf_2' definition.
--


--
-- SELECT template for table `ConversionEventsUserData_anyOf_2`
--
SELECT `em`, `hashed_maids`, `client_ip_address`, `client_user_agent` FROM `ConversionEventsUserData_anyOf_2` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserData_anyOf_2`
--
INSERT INTO `ConversionEventsUserData_anyOf_2`(`em`, `hashed_maids`, `client_ip_address`, `client_user_agent`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserData_anyOf_2`
--
UPDATE `ConversionEventsUserData_anyOf_2` SET `em` = ?, `hashed_maids` = ?, `client_ip_address` = ?, `client_user_agent` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserData_anyOf_2`
--
DELETE FROM `ConversionEventsUserData_anyOf_2` WHERE 0;

