--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessAccessUserSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_access_user_summary'
--
SELECT email, "id", username FROM business_access_user_summary WHERE 1=1;

--
-- INSERT template for table 'business_access_user_summary'
--
INSERT INTO business_access_user_summary (email, "id", username) VALUES (?, ?, ?);

--
-- UPDATE template for table 'business_access_user_summary'
--
UPDATE business_access_user_summary SET email = ?, "id" = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'business_access_user_summary'
--
DELETE FROM business_access_user_summary WHERE 1=2;

