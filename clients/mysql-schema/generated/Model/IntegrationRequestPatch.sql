--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationRequestPatch' definition.
--


--
-- SELECT template for table `IntegrationRequestPatch`
--
SELECT `connected_merchant_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `additional_id_1`, `partner_metadata` FROM `IntegrationRequestPatch` WHERE 1;

--
-- INSERT template for table `IntegrationRequestPatch`
--
INSERT INTO `IntegrationRequestPatch`(`connected_merchant_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `additional_id_1`, `partner_metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationRequestPatch`
--
UPDATE `IntegrationRequestPatch` SET `connected_merchant_id` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_tag_id` = ?, `partner_access_token` = ?, `partner_refresh_token` = ?, `partner_primary_email` = ?, `partner_access_token_expiry` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `additional_id_1` = ?, `partner_metadata` = ? WHERE 1;

--
-- DELETE template for table `IntegrationRequestPatch`
--
DELETE FROM `IntegrationRequestPatch` WHERE 0;

