--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsVerticalProductGroup' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_vertical_product_group'
--
SELECT catalog_id, catalog_type, country, created_at, description, feed_id, filters, "id", is_featured, locale, "name", status, "type", updated_at FROM catalogs_vertical_product_group WHERE 1=1;

--
-- INSERT template for table 'catalogs_vertical_product_group'
--
INSERT INTO catalogs_vertical_product_group (catalog_id, catalog_type, country, created_at, description, feed_id, filters, "id", is_featured, locale, "name", status, "type", updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_vertical_product_group'
--
UPDATE catalogs_vertical_product_group SET catalog_id = ?, catalog_type = ?, country = ?, created_at = ?, description = ?, feed_id = ?, filters = ?, "id" = ?, is_featured = ?, locale = ?, "name" = ?, status = ?, "type" = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_vertical_product_group'
--
DELETE FROM catalogs_vertical_product_group WHERE 1=2;

