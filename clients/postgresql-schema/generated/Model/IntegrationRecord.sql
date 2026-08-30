--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_record'
--
SELECT additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, connected_user_id, created_time, external_business_id, "id", partner_access_token, partner_access_token_expiry, partner_metadata, partner_primary_email, partner_refresh_token, partner_refresh_token_expiry, scopes, updated_time FROM integration_record WHERE 1=1;

--
-- INSERT template for table 'integration_record'
--
INSERT INTO integration_record (additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, connected_user_id, created_time, external_business_id, "id", partner_access_token, partner_access_token_expiry, partner_metadata, partner_primary_email, partner_refresh_token, partner_refresh_token_expiry, scopes, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_record'
--
UPDATE integration_record SET additional_id_1 = ?, connected_advertiser_id = ?, connected_lba_id = ?, connected_merchant_id = ?, connected_tag_id = ?, connected_user_id = ?, created_time = ?, external_business_id = ?, "id" = ?, partner_access_token = ?, partner_access_token_expiry = ?, partner_metadata = ?, partner_primary_email = ?, partner_refresh_token = ?, partner_refresh_token_expiry = ?, scopes = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'integration_record'
--
DELETE FROM integration_record WHERE 1=2;

