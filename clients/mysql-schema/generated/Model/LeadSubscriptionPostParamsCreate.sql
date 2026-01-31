--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadSubscriptionPostParamsCreate' definition.
--


--
-- SELECT template for table `LeadSubscriptionPostParamsCreate`
--
SELECT `lead_form_id`, `webhook_url`, `partner_access_token`, `partner_metadata`, `partner_refresh_token` FROM `LeadSubscriptionPostParamsCreate` WHERE 1;

--
-- INSERT template for table `LeadSubscriptionPostParamsCreate`
--
INSERT INTO `LeadSubscriptionPostParamsCreate`(`lead_form_id`, `webhook_url`, `partner_access_token`, `partner_metadata`, `partner_refresh_token`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadSubscriptionPostParamsCreate`
--
UPDATE `LeadSubscriptionPostParamsCreate` SET `lead_form_id` = ?, `webhook_url` = ?, `partner_access_token` = ?, `partner_metadata` = ?, `partner_refresh_token` = ? WHERE 1;

--
-- DELETE template for table `LeadSubscriptionPostParamsCreate`
--
DELETE FROM `LeadSubscriptionPostParamsCreate` WHERE 0;

