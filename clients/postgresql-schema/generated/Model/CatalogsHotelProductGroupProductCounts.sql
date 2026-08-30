--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProductGroupProductCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product_group_product_counts'
--
SELECT catalog_type, total FROM catalogs_hotel_product_group_product_counts WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product_group_product_counts'
--
INSERT INTO catalogs_hotel_product_group_product_counts (catalog_type, total) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_hotel_product_group_product_counts'
--
UPDATE catalogs_hotel_product_group_product_counts SET catalog_type = ?, total = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product_group_product_counts'
--
DELETE FROM catalogs_hotel_product_group_product_counts WHERE 1=2;

