--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationRecord' definition.
--


--
-- SELECT template for table `IntegrationRecord`
--
SELECT `id`, `external_business_id`, `connected_merchant_id`, `connected_user_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `partner_metadata`, `additional_id_1`, `created_time`, `updated_time` FROM `IntegrationRecord` WHERE 1;

--
-- INSERT template for table `IntegrationRecord`
--
INSERT INTO `IntegrationRecord`(`id`, `external_business_id`, `connected_merchant_id`, `connected_user_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token`, `partner_refresh_token`, `partner_primary_email`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `partner_metadata`, `additional_id_1`, `created_time`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationRecord`
--
UPDATE `IntegrationRecord` SET `id` = ?, `external_business_id` = ?, `connected_merchant_id` = ?, `connected_user_id` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_tag_id` = ?, `partner_access_token` = ?, `partner_refresh_token` = ?, `partner_primary_email` = ?, `partner_access_token_expiry` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `partner_metadata` = ?, `additional_id_1` = ?, `created_time` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `IntegrationRecord`
--
DELETE FROM `IntegrationRecord` WHERE 0;

