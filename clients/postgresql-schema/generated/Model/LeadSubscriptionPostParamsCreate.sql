--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadSubscriptionPostParamsCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_subscription_post_params_create'
--
SELECT lead_form_id, webhook_url, partner_access_token, partner_metadata, partner_refresh_token FROM lead_subscription_post_params_create WHERE 1=1;

--
-- INSERT template for table 'lead_subscription_post_params_create'
--
INSERT INTO lead_subscription_post_params_create (lead_form_id, webhook_url, partner_access_token, partner_metadata, partner_refresh_token) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_subscription_post_params_create'
--
UPDATE lead_subscription_post_params_create SET lead_form_id = ?, webhook_url = ?, partner_access_token = ?, partner_metadata = ?, partner_refresh_token = ? WHERE 1=2;

--
-- DELETE template for table 'lead_subscription_post_params_create'
--
DELETE FROM lead_subscription_post_params_create WHERE 1=2;

