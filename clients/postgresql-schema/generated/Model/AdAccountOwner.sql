--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountOwner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_owner'
--
SELECT "id", username FROM ad_account_owner WHERE 1=1;

--
-- INSERT template for table 'ad_account_owner'
--
INSERT INTO ad_account_owner ("id", username) VALUES (?, ?);

--
-- UPDATE template for table 'ad_account_owner'
--
UPDATE ad_account_owner SET "id" = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_owner'
--
DELETE FROM ad_account_owner WHERE 1=2;

