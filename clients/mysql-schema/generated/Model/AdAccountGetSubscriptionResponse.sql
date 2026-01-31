--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountGetSubscriptionResponse' definition.
--


--
-- SELECT template for table `AdAccountGetSubscriptionResponse`
--
SELECT `lead_form_id`, `webhook_url`, `ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `user_account_id` FROM `AdAccountGetSubscriptionResponse` WHERE 1;

--
-- INSERT template for table `AdAccountGetSubscriptionResponse`
--
INSERT INTO `AdAccountGetSubscriptionResponse`(`lead_form_id`, `webhook_url`, `ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `user_account_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountGetSubscriptionResponse`
--
UPDATE `AdAccountGetSubscriptionResponse` SET `lead_form_id` = ?, `webhook_url` = ?, `ad_account_id` = ?, `api_version` = ?, `created_time` = ?, `cryptographic_algorithm` = ?, `cryptographic_key` = ?, `id` = ?, `user_account_id` = ? WHERE 1;

--
-- DELETE template for table `AdAccountGetSubscriptionResponse`
--
DELETE FROM `AdAccountGetSubscriptionResponse` WHERE 0;

