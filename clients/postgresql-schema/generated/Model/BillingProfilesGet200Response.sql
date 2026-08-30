--
-- "Pinterest REST API"
-- Prepared SQL queries for 'billing_profiles_get_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'billing_profiles_get_200_response'
--
SELECT bookmark, items FROM billing_profiles_get_200_response WHERE 1=1;

--
-- INSERT template for table 'billing_profiles_get_200_response'
--
INSERT INTO billing_profiles_get_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'billing_profiles_get_200_response'
--
UPDATE billing_profiles_get_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'billing_profiles_get_200_response'
--
DELETE FROM billing_profiles_get_200_response WHERE 1=2;

