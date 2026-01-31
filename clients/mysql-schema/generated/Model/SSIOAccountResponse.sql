--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountResponse' definition.
--


--
-- SELECT template for table `SSIOAccountResponse`
--
SELECT `billto_infos`, `can_edit`, `currency`, `eligible`, `error`, `pmp_names` FROM `SSIOAccountResponse` WHERE 1;

--
-- INSERT template for table `SSIOAccountResponse`
--
INSERT INTO `SSIOAccountResponse`(`billto_infos`, `can_edit`, `currency`, `eligible`, `error`, `pmp_names`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountResponse`
--
UPDATE `SSIOAccountResponse` SET `billto_infos` = ?, `can_edit` = ?, `currency` = ?, `eligible` = ?, `error` = ?, `pmp_names` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountResponse`
--
DELETE FROM `SSIOAccountResponse` WHERE 0;

