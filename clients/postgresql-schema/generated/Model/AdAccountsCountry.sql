--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountsCountry' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_accounts_country'
--
SELECT code, currency, "index", "name" FROM ad_accounts_country WHERE 1=1;

--
-- INSERT template for table 'ad_accounts_country'
--
INSERT INTO ad_accounts_country (code, currency, "index", "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'ad_accounts_country'
--
UPDATE ad_accounts_country SET code = ?, currency = ?, "index" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_accounts_country'
--
DELETE FROM ad_accounts_country WHERE 1=2;

