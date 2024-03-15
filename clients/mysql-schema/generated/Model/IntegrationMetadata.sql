--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationMetadata' definition.
--


--
-- SELECT template for table `IntegrationMetadata`
--
SELECT `id`, `external_business_id`, `connected_merchant_id`, `connected_user_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `created_timestamp`, `updated_timestamp`, `additional_id_1`, `partner_metadata` FROM `IntegrationMetadata` WHERE 1;

--
-- INSERT template for table `IntegrationMetadata`
--
INSERT INTO `IntegrationMetadata`(`id`, `external_business_id`, `connected_merchant_id`, `connected_user_id`, `connected_advertiser_id`, `connected_lba_id`, `connected_tag_id`, `partner_access_token_expiry`, `partner_refresh_token_expiry`, `scopes`, `created_timestamp`, `updated_timestamp`, `additional_id_1`, `partner_metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationMetadata`
--
UPDATE `IntegrationMetadata` SET `id` = ?, `external_business_id` = ?, `connected_merchant_id` = ?, `connected_user_id` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_tag_id` = ?, `partner_access_token_expiry` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `created_timestamp` = ?, `updated_timestamp` = ?, `additional_id_1` = ?, `partner_metadata` = ? WHERE 1;

--
-- DELETE template for table `IntegrationMetadata`
--
DELETE FROM `IntegrationMetadata` WHERE 0;

