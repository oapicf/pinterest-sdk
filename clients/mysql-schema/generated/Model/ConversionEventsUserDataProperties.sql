--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsUserDataProperties' definition.
--


--
-- SELECT template for table `ConversionEventsUserDataProperties`
--
SELECT `click_id`, `client_ip_address`, `client_user_agent`, `country`, `ct`, `db`, `em`, `external_id`, `fn`, `ge`, `hashed_maids`, `ln`, `partner_id`, `ph`, `st`, `zp` FROM `ConversionEventsUserDataProperties` WHERE 1;

--
-- INSERT template for table `ConversionEventsUserDataProperties`
--
INSERT INTO `ConversionEventsUserDataProperties`(`click_id`, `client_ip_address`, `client_user_agent`, `country`, `ct`, `db`, `em`, `external_id`, `fn`, `ge`, `hashed_maids`, `ln`, `partner_id`, `ph`, `st`, `zp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsUserDataProperties`
--
UPDATE `ConversionEventsUserDataProperties` SET `click_id` = ?, `client_ip_address` = ?, `client_user_agent` = ?, `country` = ?, `ct` = ?, `db` = ?, `em` = ?, `external_id` = ?, `fn` = ?, `ge` = ?, `hashed_maids` = ?, `ln` = ?, `partner_id` = ?, `ph` = ?, `st` = ?, `zp` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsUserDataProperties`
--
DELETE FROM `ConversionEventsUserDataProperties` WHERE 0;

