--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationMetadataUpdate' definition.
--


--
-- SELECT template for table `IntegrationMetadataUpdate`
--
SELECT `additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes` FROM `IntegrationMetadataUpdate` WHERE 1;

--
-- INSERT template for table `IntegrationMetadataUpdate`
--
INSERT INTO `IntegrationMetadataUpdate`(`additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationMetadataUpdate`
--
UPDATE `IntegrationMetadataUpdate` SET `additional_id_1` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_merchant_id` = ?, `connected_tag_id` = ?, `partner_access_token` = ?, `partner_access_token_expiry` = ?, `partner_metadata` = ?, `partner_primary_email` = ?, `partner_refresh_token` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ? WHERE 1;

--
-- DELETE template for table `IntegrationMetadataUpdate`
--
DELETE FROM `IntegrationMetadataUpdate` WHERE 0;

