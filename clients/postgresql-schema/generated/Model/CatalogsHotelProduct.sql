--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProduct' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product'
--
SELECT catalog_type, metadata, pin FROM catalogs_hotel_product WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product'
--
INSERT INTO catalogs_hotel_product (catalog_type, metadata, pin) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_product'
--
UPDATE catalogs_hotel_product SET catalog_type = ?, metadata = ?, pin = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product'
--
DELETE FROM catalogs_hotel_product WHERE 1=2;

