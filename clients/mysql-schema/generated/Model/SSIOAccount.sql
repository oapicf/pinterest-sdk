--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccount' definition.
--


--
-- SELECT template for table `SSIOAccount`
--
SELECT `billto_infos`, `can_edit`, `currency`, `eligible`, `error`, `pmp_names` FROM `SSIOAccount` WHERE 1;

--
-- INSERT template for table `SSIOAccount`
--
INSERT INTO `SSIOAccount`(`billto_infos`, `can_edit`, `currency`, `eligible`, `error`, `pmp_names`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccount`
--
UPDATE `SSIOAccount` SET `billto_infos` = ?, `can_edit` = ?, `currency` = ?, `eligible` = ?, `error` = ?, `pmp_names` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccount`
--
DELETE FROM `SSIOAccount` WHERE 0;

