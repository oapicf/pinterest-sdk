--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountGetSubscriptionResponse' definition.
--


--
-- SELECT template for table `AdAccountGetSubscriptionResponse`
--
SELECT `lead_form_id`, `webhook_url`, `id`, `user_account_id`, `ad_account_id`, `api_version`, `cryptographic_key`, `cryptographic_algorithm`, `created_time` FROM `AdAccountGetSubscriptionResponse` WHERE 1;

--
-- INSERT template for table `AdAccountGetSubscriptionResponse`
--
INSERT INTO `AdAccountGetSubscriptionResponse`(`lead_form_id`, `webhook_url`, `id`, `user_account_id`, `ad_account_id`, `api_version`, `cryptographic_key`, `cryptographic_algorithm`, `created_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountGetSubscriptionResponse`
--
UPDATE `AdAccountGetSubscriptionResponse` SET `lead_form_id` = ?, `webhook_url` = ?, `id` = ?, `user_account_id` = ?, `ad_account_id` = ?, `api_version` = ?, `cryptographic_key` = ?, `cryptographic_algorithm` = ?, `created_time` = ? WHERE 1;

--
-- DELETE template for table `AdAccountGetSubscriptionResponse`
--
DELETE FROM `AdAccountGetSubscriptionResponse` WHERE 0;

