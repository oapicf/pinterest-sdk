--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalStoreBatchUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_store_batch_update'
--
SELECT address_primary, address_secondary, city, country, "id", latitude, longitude, "name", postal_code, region, store_code FROM local_store_batch_update WHERE 1=1;

--
-- INSERT template for table 'local_store_batch_update'
--
INSERT INTO local_store_batch_update (address_primary, address_secondary, city, country, "id", latitude, longitude, "name", postal_code, region, store_code) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_store_batch_update'
--
UPDATE local_store_batch_update SET address_primary = ?, address_secondary = ?, city = ?, country = ?, "id" = ?, latitude = ?, longitude = ?, "name" = ?, postal_code = ?, region = ?, store_code = ? WHERE 1=2;

--
-- DELETE template for table 'local_store_batch_update'
--
DELETE FROM local_store_batch_update WHERE 1=2;

