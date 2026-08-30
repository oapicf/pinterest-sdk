--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TermsOfService' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'terms_of_service'
--
SELECT ad_account_id, has_accepted, html, "id" FROM terms_of_service WHERE 1=1;

--
-- INSERT template for table 'terms_of_service'
--
INSERT INTO terms_of_service (ad_account_id, has_accepted, html, "id") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'terms_of_service'
--
UPDATE terms_of_service SET ad_account_id = ?, has_accepted = ?, html = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'terms_of_service'
--
DELETE FROM terms_of_service WHERE 1=2;

