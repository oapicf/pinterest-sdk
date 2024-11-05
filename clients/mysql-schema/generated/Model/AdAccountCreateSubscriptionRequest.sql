--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateSubscriptionRequest' definition.
--


--
-- SELECT template for table `AdAccountCreateSubscriptionRequest`
--
SELECT `webhook_url`, `lead_form_id`, `partner_access_token`, `partner_refresh_token`, `partner_metadata` FROM `AdAccountCreateSubscriptionRequest` WHERE 1;

--
-- INSERT template for table `AdAccountCreateSubscriptionRequest`
--
INSERT INTO `AdAccountCreateSubscriptionRequest`(`webhook_url`, `lead_form_id`, `partner_access_token`, `partner_refresh_token`, `partner_metadata`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountCreateSubscriptionRequest`
--
UPDATE `AdAccountCreateSubscriptionRequest` SET `webhook_url` = ?, `lead_form_id` = ?, `partner_access_token` = ?, `partner_refresh_token` = ?, `partner_metadata` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateSubscriptionRequest`
--
DELETE FROM `AdAccountCreateSubscriptionRequest` WHERE 0;

