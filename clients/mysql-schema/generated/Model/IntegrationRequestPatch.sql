--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationRequestPatch' definition.
--


--
-- SELECT template for table `IntegrationRequestPatch`
--
SELECT `additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes` FROM `IntegrationRequestPatch` WHERE 1;

--
-- INSERT template for table `IntegrationRequestPatch`
--
INSERT INTO `IntegrationRequestPatch`(`additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationRequestPatch`
--
UPDATE `IntegrationRequestPatch` SET `additional_id_1` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_merchant_id` = ?, `connected_tag_id` = ?, `partner_access_token` = ?, `partner_access_token_expiry` = ?, `partner_metadata` = ?, `partner_primary_email` = ?, `partner_refresh_token` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ? WHERE 1;

--
-- DELETE template for table `IntegrationRequestPatch`
--
DELETE FROM `IntegrationRequestPatch` WHERE 0;

