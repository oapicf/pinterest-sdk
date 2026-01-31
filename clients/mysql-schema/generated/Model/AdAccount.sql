--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccount' definition.
--


--
-- SELECT template for table `AdAccount`
--
SELECT `country`, `created_time`, `currency`, `id`, `name`, `owner`, `permissions`, `updated_time` FROM `AdAccount` WHERE 1;

--
-- INSERT template for table `AdAccount`
--
INSERT INTO `AdAccount`(`country`, `created_time`, `currency`, `id`, `name`, `owner`, `permissions`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccount`
--
UPDATE `AdAccount` SET `country` = ?, `created_time` = ?, `currency` = ?, `id` = ?, `name` = ?, `owner` = ?, `permissions` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AdAccount`
--
DELETE FROM `AdAccount` WHERE 0;

