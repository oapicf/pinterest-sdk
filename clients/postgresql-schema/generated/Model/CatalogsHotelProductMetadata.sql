--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProductMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product_metadata'
--
SELECT hotel_id FROM catalogs_hotel_product_metadata WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product_metadata'
--
INSERT INTO catalogs_hotel_product_metadata (hotel_id) VALUES (?);

--
-- UPDATE template for table 'catalogs_hotel_product_metadata'
--
UPDATE catalogs_hotel_product_metadata SET hotel_id = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product_metadata'
--
DELETE FROM catalogs_hotel_product_metadata WHERE 1=2;

