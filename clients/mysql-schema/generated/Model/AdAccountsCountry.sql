--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsCountry' definition.
--


--
-- SELECT template for table `AdAccountsCountry`
--
SELECT `code`, `currency`, `index`, `name` FROM `AdAccountsCountry` WHERE 1;

--
-- INSERT template for table `AdAccountsCountry`
--
INSERT INTO `AdAccountsCountry`(`code`, `currency`, `index`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsCountry`
--
UPDATE `AdAccountsCountry` SET `code` = ?, `currency` = ?, `index` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsCountry`
--
DELETE FROM `AdAccountsCountry` WHERE 0;

