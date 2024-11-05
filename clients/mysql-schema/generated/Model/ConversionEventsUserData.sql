--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserData' definition.
--


--
-- SELECT template for table `ConversionEventsUserData`
--
SELECT `ph`, `ge`, `db`, `ln`, `fn`, `ct`, `st`, `zp`, `country`, `external_id`, `click_id`, `partner_id`, `em`, `hashed_maids`, `client_ip_address`, `client_user_agent` FROM `ConversionEventsUserData` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserData`
--
INSERT INTO `ConversionEventsUserData`(`ph`, `ge`, `db`, `ln`, `fn`, `ct`, `st`, `zp`, `country`, `external_id`, `click_id`, `partner_id`, `em`, `hashed_maids`, `client_ip_address`, `client_user_agent`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserData`
--
UPDATE `ConversionEventsUserData` SET `ph` = ?, `ge` = ?, `db` = ?, `ln` = ?, `fn` = ?, `ct` = ?, `st` = ?, `zp` = ?, `country` = ?, `external_id` = ?, `click_id` = ?, `partner_id` = ?, `em` = ?, `hashed_maids` = ?, `client_ip_address` = ?, `client_user_agent` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserData`
--
DELETE FROM `ConversionEventsUserData` WHERE 0;

