--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalStoreCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_store_create'
--
SELECT address_primary, address_secondary, city, country, latitude, longitude, "name", postal_code, region, store_code FROM local_store_create WHERE 1=1;

--
-- INSERT template for table 'local_store_create'
--
INSERT INTO local_store_create (address_primary, address_secondary, city, country, latitude, longitude, "name", postal_code, region, store_code) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_store_create'
--
UPDATE local_store_create SET address_primary = ?, address_secondary = ?, city = ?, country = ?, latitude = ?, longitude = ?, "name" = ?, postal_code = ?, region = ?, store_code = ? WHERE 1=2;

--
-- DELETE template for table 'local_store_create'
--
DELETE FROM local_store_create WHERE 1=2;

