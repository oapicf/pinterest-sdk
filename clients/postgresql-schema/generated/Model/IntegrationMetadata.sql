--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_metadata'
--
SELECT additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, connected_user_id, created_timestamp, external_business_id, "id", partner_access_token_expiry, partner_metadata, partner_refresh_token_expiry, scopes, updated_timestamp FROM integration_metadata WHERE 1=1;

--
-- INSERT template for table 'integration_metadata'
--
INSERT INTO integration_metadata (additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, connected_user_id, created_timestamp, external_business_id, "id", partner_access_token_expiry, partner_metadata, partner_refresh_token_expiry, scopes, updated_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_metadata'
--
UPDATE integration_metadata SET additional_id_1 = ?, connected_advertiser_id = ?, connected_lba_id = ?, connected_merchant_id = ?, connected_tag_id = ?, connected_user_id = ?, created_timestamp = ?, external_business_id = ?, "id" = ?, partner_access_token_expiry = ?, partner_metadata = ?, partner_refresh_token_expiry = ?, scopes = ?, updated_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'integration_metadata'
--
DELETE FROM integration_metadata WHERE 1=2;

