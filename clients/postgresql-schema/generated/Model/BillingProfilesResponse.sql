--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BillingProfilesResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'billing_profiles_response'
--
SELECT advertiser_id, billing_type, card_type, "id", payment_method_brand, status FROM billing_profiles_response WHERE 1=1;

--
-- INSERT template for table 'billing_profiles_response'
--
INSERT INTO billing_profiles_response (advertiser_id, billing_type, card_type, "id", payment_method_brand, status) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'billing_profiles_response'
--
UPDATE billing_profiles_response SET advertiser_id = ?, billing_type = ?, card_type = ?, "id" = ?, payment_method_brand = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'billing_profiles_response'
--
DELETE FROM billing_profiles_response WHERE 1=2;

