--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadSubscription' definition.
--


--
-- SELECT template for table `LeadSubscription`
--
SELECT `ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url` FROM `LeadSubscription` WHERE 1;

--
-- INSERT template for table `LeadSubscription`
--
INSERT INTO `LeadSubscription`(`ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadSubscription`
--
UPDATE `LeadSubscription` SET `ad_account_id` = ?, `api_version` = ?, `created_time` = ?, `cryptographic_algorithm` = ?, `cryptographic_key` = ?, `id` = ?, `lead_form_id` = ?, `user_account_id` = ?, `webhook_url` = ? WHERE 1;

--
-- DELETE template for table `LeadSubscription`
--
DELETE FROM `LeadSubscription` WHERE 0;

