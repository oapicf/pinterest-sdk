--
-- "Pinterest REST API"
-- Prepared SQL queries for 'catalogs_local_stores_create_200_response_inner_data' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_local_stores_create_200_response_inner_data'
--
SELECT address_primary, address_secondary, city, country, created_at, "id", latitude, longitude, "name", postal_code, region, store_code, updated_at, exceptions FROM catalogs_local_stores_create_200_response_inner_data WHERE 1=1;

--
-- INSERT template for table 'catalogs_local_stores_create_200_response_inner_data'
--
INSERT INTO catalogs_local_stores_create_200_response_inner_data (address_primary, address_secondary, city, country, created_at, "id", latitude, longitude, "name", postal_code, region, store_code, updated_at, exceptions) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_local_stores_create_200_response_inner_data'
--
UPDATE catalogs_local_stores_create_200_response_inner_data SET address_primary = ?, address_secondary = ?, city = ?, country = ?, created_at = ?, "id" = ?, latitude = ?, longitude = ?, "name" = ?, postal_code = ?, region = ?, store_code = ?, updated_at = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_local_stores_create_200_response_inner_data'
--
DELETE FROM catalogs_local_stores_create_200_response_inner_data WHERE 1=2;

