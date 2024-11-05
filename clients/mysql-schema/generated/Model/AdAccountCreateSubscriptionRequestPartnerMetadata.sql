--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateSubscriptionRequest_partner_metadata' definition.
--


--
-- SELECT template for table `AdAccountCreateSubscriptionRequest_partner_metadata`
--
SELECT `subscriber_key` FROM `AdAccountCreateSubscriptionRequest_partner_metadata` WHERE 1;

--
-- INSERT template for table `AdAccountCreateSubscriptionRequest_partner_metadata`
--
INSERT INTO `AdAccountCreateSubscriptionRequest_partner_metadata`(`subscriber_key`) VALUES (?);

--
-- UPDATE template for table `AdAccountCreateSubscriptionRequest_partner_metadata`
--
UPDATE `AdAccountCreateSubscriptionRequest_partner_metadata` SET `subscriber_key` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateSubscriptionRequest_partner_metadata`
--
DELETE FROM `AdAccountCreateSubscriptionRequest_partner_metadata` WHERE 0;

