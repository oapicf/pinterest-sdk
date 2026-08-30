--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadSubscription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_subscription'
--
SELECT ad_account_id, api_version, created_time, cryptographic_algorithm, cryptographic_key, "id", lead_form_id, user_account_id, webhook_url FROM lead_subscription WHERE 1=1;

--
-- INSERT template for table 'lead_subscription'
--
INSERT INTO lead_subscription (ad_account_id, api_version, created_time, cryptographic_algorithm, cryptographic_key, "id", lead_form_id, user_account_id, webhook_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_subscription'
--
UPDATE lead_subscription SET ad_account_id = ?, api_version = ?, created_time = ?, cryptographic_algorithm = ?, cryptographic_key = ?, "id" = ?, lead_form_id = ?, user_account_id = ?, webhook_url = ? WHERE 1=2;

--
-- DELETE template for table 'lead_subscription'
--
DELETE FROM lead_subscription WHERE 1=2;

