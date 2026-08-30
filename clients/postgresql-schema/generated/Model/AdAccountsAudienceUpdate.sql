--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountsAudienceUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_accounts_audience_update'
--
SELECT ad_account_id, audience_type, description, "name", operation_type, "rule" FROM ad_accounts_audience_update WHERE 1=1;

--
-- INSERT template for table 'ad_accounts_audience_update'
--
INSERT INTO ad_accounts_audience_update (ad_account_id, audience_type, description, "name", operation_type, "rule") VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_accounts_audience_update'
--
UPDATE ad_accounts_audience_update SET ad_account_id = ?, audience_type = ?, description = ?, "name" = ?, operation_type = ?, "rule" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_accounts_audience_update'
--
DELETE FROM ad_accounts_audience_update WHERE 1=2;

