--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProductGroup' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product_group'
--
SELECT catalog_id, catalog_type, created_at, description, filters, "id", "name", "type", updated_at FROM catalogs_hotel_product_group WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product_group'
--
INSERT INTO catalogs_hotel_product_group (catalog_id, catalog_type, created_at, description, filters, "id", "name", "type", updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_product_group'
--
UPDATE catalogs_hotel_product_group SET catalog_id = ?, catalog_type = ?, created_at = ?, description = ?, filters = ?, "id" = ?, "name" = ?, "type" = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product_group'
--
DELETE FROM catalogs_hotel_product_group WHERE 1=2;

