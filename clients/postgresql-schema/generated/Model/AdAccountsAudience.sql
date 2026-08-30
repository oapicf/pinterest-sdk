--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountsAudience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_accounts_audience'
--
SELECT ad_account_id, audience_type, created_by_company_name, created_timestamp, description, "id", is_nca, "name", "rule", "size", status, "type", updated_timestamp FROM ad_accounts_audience WHERE 1=1;

--
-- INSERT template for table 'ad_accounts_audience'
--
INSERT INTO ad_accounts_audience (ad_account_id, audience_type, created_by_company_name, created_timestamp, description, "id", is_nca, "name", "rule", "size", status, "type", updated_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_accounts_audience'
--
UPDATE ad_accounts_audience SET ad_account_id = ?, audience_type = ?, created_by_company_name = ?, created_timestamp = ?, description = ?, "id" = ?, is_nca = ?, "name" = ?, "rule" = ?, "size" = ?, status = ?, "type" = ?, updated_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'ad_accounts_audience'
--
DELETE FROM ad_accounts_audience WHERE 1=2;

