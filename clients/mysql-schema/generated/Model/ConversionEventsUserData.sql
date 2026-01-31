--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserData' definition.
--


--
-- SELECT template for table `ConversionEventsUserData`
--
SELECT `click_id`, `client_ip_address`, `client_user_agent`, `country`, `ct`, `db`, `em`, `external_id`, `fn`, `ge`, `hashed_maids`, `ln`, `partner_id`, `ph`, `st`, `zp` FROM `ConversionEventsUserData` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserData`
--
INSERT INTO `ConversionEventsUserData`(`click_id`, `client_ip_address`, `client_user_agent`, `country`, `ct`, `db`, `em`, `external_id`, `fn`, `ge`, `hashed_maids`, `ln`, `partner_id`, `ph`, `st`, `zp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserData`
--
UPDATE `ConversionEventsUserData` SET `click_id` = ?, `client_ip_address` = ?, `client_user_agent` = ?, `country` = ?, `ct` = ?, `db` = ?, `em` = ?, `external_id` = ?, `fn` = ?, `ge` = ?, `hashed_maids` = ?, `ln` = ?, `partner_id` = ?, `ph` = ?, `st` = ?, `zp` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserData`
--
DELETE FROM `ConversionEventsUserData` WHERE 0;

