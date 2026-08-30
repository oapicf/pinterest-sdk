--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_create'
--
SELECT country, currency, "name", owner_user_id, time_zone FROM ad_account_create WHERE 1=1;

--
-- INSERT template for table 'ad_account_create'
--
INSERT INTO ad_account_create (country, currency, "name", owner_user_id, time_zone) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_account_create'
--
UPDATE ad_account_create SET country = ?, currency = ?, "name" = ?, owner_user_id = ?, time_zone = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_create'
--
DELETE FROM ad_account_create WHERE 1=2;

