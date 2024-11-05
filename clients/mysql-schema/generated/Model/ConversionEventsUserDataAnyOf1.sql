--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserData_anyOf_1' definition.
--


--
-- SELECT template for table `ConversionEventsUserData_anyOf_1`
--
SELECT `em`, `hashed_maids`, `client_ip_address`, `client_user_agent` FROM `ConversionEventsUserData_anyOf_1` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserData_anyOf_1`
--
INSERT INTO `ConversionEventsUserData_anyOf_1`(`em`, `hashed_maids`, `client_ip_address`, `client_user_agent`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserData_anyOf_1`
--
UPDATE `ConversionEventsUserData_anyOf_1` SET `em` = ?, `hashed_maids` = ?, `client_ip_address` = ?, `client_user_agent` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserData_anyOf_1`
--
DELETE FROM `ConversionEventsUserData_anyOf_1` WHERE 0;

