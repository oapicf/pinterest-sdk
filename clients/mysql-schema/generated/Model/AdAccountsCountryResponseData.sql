--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsCountryResponseData' definition.
--


--
-- SELECT template for table `AdAccountsCountryResponseData`
--
SELECT `code`, `currency`, `index`, `name` FROM `AdAccountsCountryResponseData` WHERE 1;

--
-- INSERT template for table `AdAccountsCountryResponseData`
--
INSERT INTO `AdAccountsCountryResponseData`(`code`, `currency`, `index`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsCountryResponseData`
--
UPDATE `AdAccountsCountryResponseData` SET `code` = ?, `currency` = ?, `index` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsCountryResponseData`
--
DELETE FROM `AdAccountsCountryResponseData` WHERE 0;

