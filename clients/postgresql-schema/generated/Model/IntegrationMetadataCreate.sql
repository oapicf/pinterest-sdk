--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationMetadataCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_metadata_create'
--
SELECT additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, external_business_id, partner_access_token, partner_access_token_expiry, partner_metadata, partner_primary_email, partner_refresh_token, partner_refresh_token_expiry, scopes FROM integration_metadata_create WHERE 1=1;

--
-- INSERT template for table 'integration_metadata_create'
--
INSERT INTO integration_metadata_create (additional_id_1, connected_advertiser_id, connected_lba_id, connected_merchant_id, connected_tag_id, external_business_id, partner_access_token, partner_access_token_expiry, partner_metadata, partner_primary_email, partner_refresh_token, partner_refresh_token_expiry, scopes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_metadata_create'
--
UPDATE integration_metadata_create SET additional_id_1 = ?, connected_advertiser_id = ?, connected_lba_id = ?, connected_merchant_id = ?, connected_tag_id = ?, external_business_id = ?, partner_access_token = ?, partner_access_token_expiry = ?, partner_metadata = ?, partner_primary_email = ?, partner_refresh_token = ?, partner_refresh_token_expiry = ?, scopes = ? WHERE 1=2;

--
-- DELETE template for table 'integration_metadata_create'
--
DELETE FROM integration_metadata_create WHERE 1=2;

