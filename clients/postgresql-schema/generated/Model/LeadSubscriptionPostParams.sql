--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadSubscriptionPostParams' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_subscription_post_params'
--
SELECT ad_account_id, api_version, created_time, cryptographic_algorithm, cryptographic_key, "id", lead_form_id, user_account_id, webhook_url, partner_access_token, partner_metadata, partner_refresh_token FROM lead_subscription_post_params WHERE 1=1;

--
-- INSERT template for table 'lead_subscription_post_params'
--
INSERT INTO lead_subscription_post_params (ad_account_id, api_version, created_time, cryptographic_algorithm, cryptographic_key, "id", lead_form_id, user_account_id, webhook_url, partner_access_token, partner_metadata, partner_refresh_token) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_subscription_post_params'
--
UPDATE lead_subscription_post_params SET ad_account_id = ?, api_version = ?, created_time = ?, cryptographic_algorithm = ?, cryptographic_key = ?, "id" = ?, lead_form_id = ?, user_account_id = ?, webhook_url = ?, partner_access_token = ?, partner_metadata = ?, partner_refresh_token = ? WHERE 1=2;

--
-- DELETE template for table 'lead_subscription_post_params'
--
DELETE FROM lead_subscription_post_params WHERE 1=2;

