--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateSubscriptionRequest' definition.
--


--
-- SELECT template for table `AdAccountCreateSubscriptionRequest`
--
SELECT `lead_form_id`, `partner_access_token`, `partner_metadata`, `partner_refresh_token`, `webhook_url` FROM `AdAccountCreateSubscriptionRequest` WHERE 1;

--
-- INSERT template for table `AdAccountCreateSubscriptionRequest`
--
INSERT INTO `AdAccountCreateSubscriptionRequest`(`lead_form_id`, `partner_access_token`, `partner_metadata`, `partner_refresh_token`, `webhook_url`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountCreateSubscriptionRequest`
--
UPDATE `AdAccountCreateSubscriptionRequest` SET `lead_form_id` = ?, `partner_access_token` = ?, `partner_metadata` = ?, `partner_refresh_token` = ?, `webhook_url` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateSubscriptionRequest`
--
DELETE FROM `AdAccountCreateSubscriptionRequest` WHERE 0;

