--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountsAudienceCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_accounts_audience_create'
--
SELECT ad_account_id, audience_type, description, "name", "rule" FROM ad_accounts_audience_create WHERE 1=1;

--
-- INSERT template for table 'ad_accounts_audience_create'
--
INSERT INTO ad_accounts_audience_create (ad_account_id, audience_type, description, "name", "rule") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_accounts_audience_create'
--
UPDATE ad_accounts_audience_create SET ad_account_id = ?, audience_type = ?, description = ?, "name" = ?, "rule" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_accounts_audience_create'
--
DELETE FROM ad_accounts_audience_create WHERE 1=2;

