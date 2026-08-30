--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadSubscriptionCreate' definition.
--


--
-- SELECT template for table `LeadSubscriptionCreate`
--
SELECT `lead_form_id`, `webhook_url` FROM `LeadSubscriptionCreate` WHERE 1;

--
-- INSERT template for table `LeadSubscriptionCreate`
--
INSERT INTO `LeadSubscriptionCreate`(`lead_form_id`, `webhook_url`) VALUES (?, ?);

--
-- UPDATE template for table `LeadSubscriptionCreate`
--
UPDATE `LeadSubscriptionCreate` SET `lead_form_id` = ?, `webhook_url` = ? WHERE 1;

--
-- DELETE template for table `LeadSubscriptionCreate`
--
DELETE FROM `LeadSubscriptionCreate` WHERE 0;

