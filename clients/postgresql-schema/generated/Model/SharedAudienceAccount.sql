--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SharedAudienceAccount' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'shared_audience_account'
--
SELECT account_id, account_name, account_type, shared_on_timestamp FROM shared_audience_account WHERE 1=1;

--
-- INSERT template for table 'shared_audience_account'
--
INSERT INTO shared_audience_account (account_id, account_name, account_type, shared_on_timestamp) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'shared_audience_account'
--
UPDATE shared_audience_account SET account_id = ?, account_name = ?, account_type = ?, shared_on_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'shared_audience_account'
--
DELETE FROM shared_audience_account WHERE 1=2;

