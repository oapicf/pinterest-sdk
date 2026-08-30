--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProductGroupCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product_group_create_request'
--
SELECT catalog_id, catalog_type, description, filters, "name" FROM catalogs_hotel_product_group_create_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product_group_create_request'
--
INSERT INTO catalogs_hotel_product_group_create_request (catalog_id, catalog_type, description, filters, "name") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_product_group_create_request'
--
UPDATE catalogs_hotel_product_group_create_request SET catalog_id = ?, catalog_type = ?, description = ?, filters = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product_group_create_request'
--
DELETE FROM catalogs_hotel_product_group_create_request WHERE 1=2;

