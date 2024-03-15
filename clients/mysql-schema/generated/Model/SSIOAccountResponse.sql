--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountResponse' definition.
--


--
-- SELECT template for table `SSIOAccountResponse`
--
SELECT `eligible`, `can_edit`, `billto_infos`, `currency`, `pmp_names`, `error` FROM `SSIOAccountResponse` WHERE 1;

--
-- INSERT template for table `SSIOAccountResponse`
--
INSERT INTO `SSIOAccountResponse`(`eligible`, `can_edit`, `billto_infos`, `currency`, `pmp_names`, `error`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountResponse`
--
UPDATE `SSIOAccountResponse` SET `eligible` = ?, `can_edit` = ?, `billto_infos` = ?, `currency` = ?, `pmp_names` = ?, `error` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountResponse`
--
DELETE FROM `SSIOAccountResponse` WHERE 0;

