--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadSubscriptionPostParams' definition.
--


--
-- SELECT template for table `LeadSubscriptionPostParams`
--
SELECT `ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url`, `partner_access_token`, `partner_metadata`, `partner_refresh_token` FROM `LeadSubscriptionPostParams` WHERE 1;

--
-- INSERT template for table `LeadSubscriptionPostParams`
--
INSERT INTO `LeadSubscriptionPostParams`(`ad_account_id`, `api_version`, `created_time`, `cryptographic_algorithm`, `cryptographic_key`, `id`, `lead_form_id`, `user_account_id`, `webhook_url`, `partner_access_token`, `partner_metadata`, `partner_refresh_token`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadSubscriptionPostParams`
--
UPDATE `LeadSubscriptionPostParams` SET `ad_account_id` = ?, `api_version` = ?, `created_time` = ?, `cryptographic_algorithm` = ?, `cryptographic_key` = ?, `id` = ?, `lead_form_id` = ?, `user_account_id` = ?, `webhook_url` = ?, `partner_access_token` = ?, `partner_metadata` = ?, `partner_refresh_token` = ? WHERE 1;

--
-- DELETE template for table `LeadSubscriptionPostParams`
--
DELETE FROM `LeadSubscriptionPostParams` WHERE 0;

