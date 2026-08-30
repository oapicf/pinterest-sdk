--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadSubscriptionCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_subscription_create'
--
SELECT lead_form_id, webhook_url FROM lead_subscription_create WHERE 1=1;

--
-- INSERT template for table 'lead_subscription_create'
--
INSERT INTO lead_subscription_create (lead_form_id, webhook_url) VALUES (?, ?);

--
-- UPDATE template for table 'lead_subscription_create'
--
UPDATE lead_subscription_create SET lead_form_id = ?, webhook_url = ? WHERE 1=2;

--
-- DELETE template for table 'lead_subscription_create'
--
DELETE FROM lead_subscription_create WHERE 1=2;

