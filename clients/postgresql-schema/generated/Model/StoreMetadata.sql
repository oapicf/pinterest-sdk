--
-- "Pinterest REST API"
-- Prepared SQL queries for 'StoreMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'store_metadata'
--
SELECT geohash, latitude, longitude, store_code, store_id, store_name FROM store_metadata WHERE 1=1;

--
-- INSERT template for table 'store_metadata'
--
INSERT INTO store_metadata (geohash, latitude, longitude, store_code, store_id, store_name) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'store_metadata'
--
UPDATE store_metadata SET geohash = ?, latitude = ?, longitude = ?, store_code = ?, store_id = ?, store_name = ? WHERE 1=2;

--
-- DELETE template for table 'store_metadata'
--
DELETE FROM store_metadata WHERE 1=2;

