--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccount' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account'
--
SELECT country, created_time, currency, "id", "name", "owner", permissions, time_zone, updated_time FROM ad_account WHERE 1=1;

--
-- INSERT template for table 'ad_account'
--
INSERT INTO ad_account (country, created_time, currency, "id", "name", "owner", permissions, time_zone, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_account'
--
UPDATE ad_account SET country = ?, created_time = ?, currency = ?, "id" = ?, "name" = ?, "owner" = ?, permissions = ?, time_zone = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account'
--
DELETE FROM ad_account WHERE 1=2;

