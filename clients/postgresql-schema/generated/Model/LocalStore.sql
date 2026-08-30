--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalStore' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_store'
--
SELECT address_primary, address_secondary, city, country, created_at, "id", latitude, longitude, "name", postal_code, region, store_code, updated_at FROM local_store WHERE 1=1;

--
-- INSERT template for table 'local_store'
--
INSERT INTO local_store (address_primary, address_secondary, city, country, created_at, "id", latitude, longitude, "name", postal_code, region, store_code, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_store'
--
UPDATE local_store SET address_primary = ?, address_secondary = ?, city = ?, country = ?, created_at = ?, "id" = ?, latitude = ?, longitude = ?, "name" = ?, postal_code = ?, region = ?, store_code = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'local_store'
--
DELETE FROM local_store WHERE 1=2;

