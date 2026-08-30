--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreate' definition.
--


--
-- SELECT template for table `AdAccountCreate`
--
SELECT `country`, `currency`, `name`, `owner_user_id`, `time_zone` FROM `AdAccountCreate` WHERE 1;

--
-- INSERT template for table `AdAccountCreate`
--
INSERT INTO `AdAccountCreate`(`country`, `currency`, `name`, `owner_user_id`, `time_zone`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountCreate`
--
UPDATE `AdAccountCreate` SET `country` = ?, `currency` = ?, `name` = ?, `owner_user_id` = ?, `time_zone` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreate`
--
DELETE FROM `AdAccountCreate` WHERE 0;

