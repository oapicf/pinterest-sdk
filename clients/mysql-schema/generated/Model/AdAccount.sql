--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccount' definition.
--


--
-- SELECT template for table `AdAccount`
--
SELECT `id`, `name`, `owner`, `country`, `currency` FROM `AdAccount` WHERE 1;

--
-- INSERT template for table `AdAccount`
--
INSERT INTO `AdAccount`(`id`, `name`, `owner`, `country`, `currency`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccount`
--
UPDATE `AdAccount` SET `id` = ?, `name` = ?, `owner` = ?, `country` = ?, `currency` = ? WHERE 1;

--
-- DELETE template for table `AdAccount`
--
DELETE FROM `AdAccount` WHERE 0;

