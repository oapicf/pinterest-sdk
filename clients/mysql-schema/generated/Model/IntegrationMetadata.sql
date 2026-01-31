--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationMetadata' definition.
--


--
-- SELECT template for table `IntegrationMetadata`
--
SELECT `additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `connected_user_id`, `created_timestamp`, `external_business_id`, `id`, `partner_access_token_expiry`, `partner_metadata`, `partner_refresh_token_expiry`, `scopes`, `updated_timestamp` FROM `IntegrationMetadata` WHERE 1;

--
-- INSERT template for table `IntegrationMetadata`
--
INSERT INTO `IntegrationMetadata`(`additional_id_1`, `connected_advertiser_id`, `connected_lba_id`, `connected_merchant_id`, `connected_tag_id`, `connected_user_id`, `created_timestamp`, `external_business_id`, `id`, `partner_access_token_expiry`, `partner_metadata`, `partner_refresh_token_expiry`, `scopes`, `updated_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationMetadata`
--
UPDATE `IntegrationMetadata` SET `additional_id_1` = ?, `connected_advertiser_id` = ?, `connected_lba_id` = ?, `connected_merchant_id` = ?, `connected_tag_id` = ?, `connected_user_id` = ?, `created_timestamp` = ?, `external_business_id` = ?, `id` = ?, `partner_access_token_expiry` = ?, `partner_metadata` = ?, `partner_refresh_token_expiry` = ?, `scopes` = ?, `updated_timestamp` = ? WHERE 1;

--
-- DELETE template for table `IntegrationMetadata`
--
DELETE FROM `IntegrationMetadata` WHERE 0;

