--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationRequest' definition.
--


--
-- SELECT template for table `IntegrationRequest`
--
SELECT `external_business_id`, `connected_merchant_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `additional_id_1`, `partner_metadata` FROM `IntegrationRequest` WHERE 1;

--
-- INSERT template for table `IntegrationRequest`
--
INSERT INTO `IntegrationRequest`(`external_business_id`, `connected_merchant_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `additional_id_1`, `partner_metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationRequest`
--
UPDATE `IntegrationRequest` SET `external_business_id` = ?, `connected_merchant_id` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_tag_id` = ?, `partner_access_token` = ?, `partner_refresh_token` = ?, `partner_primary_email` = ?, `partner_access_token_expiry` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `additional_id_1` = ?, `partner_metadata` = ? WHERE 1;

--
-- DELETE template for table `IntegrationRequest`
--
DELETE FROM `IntegrationRequest` WHERE 0;

