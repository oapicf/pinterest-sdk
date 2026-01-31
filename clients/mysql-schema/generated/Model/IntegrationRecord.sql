--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationRecord' definition.
--


--
-- SELECT template for table `IntegrationRecord`
--
SELECT `additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `connected_user_id`, `created_time`, `external_business_id`, `id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes`, `updated_time` FROM `IntegrationRecord` WHERE 1;

--
-- INSERT template for table `IntegrationRecord`
--
INSERT INTO `IntegrationRecord`(`additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `connected_user_id`, `created_time`, `external_business_id`, `id`, `partner_access_token`, `partner_access_token_expiry`, `partner_metadata`, `partner_primary_email`, `partner_refresh_token`, `partner_refresh_token_expiry`, `scopes`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationRecord`
--
UPDATE `IntegrationRecord` SET `additional_id_1` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_merchant_id` = ?, `connected_tag_id` = ?, `connected_user_id` = ?, `created_time` = ?, `external_business_id` = ?, `id` = ?, `partner_access_token` = ?, `partner_access_token_expiry` = ?, `partner_metadata` = ?, `partner_primary_email` = ?, `partner_refresh_token` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `IntegrationRecord`
--
DELETE FROM `IntegrationRecord` WHERE 0;

