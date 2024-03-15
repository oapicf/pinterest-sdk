--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateSubscriptionResponse' definition.
--


--
-- SELECT template for table `AdAccountCreateSubscriptionResponse`
--
SELECT `id`, `cryptographic_key`, `cryptographic_algorithm`, `created_time` FROM `AdAccountCreateSubscriptionResponse` WHERE 1;

--
-- INSERT template for table `AdAccountCreateSubscriptionResponse`
--
INSERT INTO `AdAccountCreateSubscriptionResponse`(`id`, `cryptographic_key`, `cryptographic_algorithm`, `created_time`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountCreateSubscriptionResponse`
--
UPDATE `AdAccountCreateSubscriptionResponse` SET `id` = ?, `cryptographic_key` = ?, `cryptographic_algorithm` = ?, `created_time` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateSubscriptionResponse`
--
DELETE FROM `AdAccountCreateSubscriptionResponse` WHERE 0;

