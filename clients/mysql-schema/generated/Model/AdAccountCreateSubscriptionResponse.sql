--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateSubscriptionResponse' definition.
--


--
-- SELECT template for table `AdAccountCreateSubscriptionResponse`
--
SELECT `ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url` FROM `AdAccountCreateSubscriptionResponse` WHERE 1;

--
-- INSERT template for table `AdAccountCreateSubscriptionResponse`
--
INSERT INTO `AdAccountCreateSubscriptionResponse`(`ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountCreateSubscriptionResponse`
--
UPDATE `AdAccountCreateSubscriptionResponse` SET `ad_account_id` = ?, `api_version` = ?, `created_time` = ?, `cryptographic_algorithm` = ?, `cryptographic_key` = ?, `id` = ?, `lead_form_id` = ?, `user_account_id` = ?, `webhook_url` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateSubscriptionResponse`
--
DELETE FROM `AdAccountCreateSubscriptionResponse` WHERE 0;

