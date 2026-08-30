--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupsCreateManyRequestItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_groups_create_many_request_items'
--
SELECT description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale FROM catalogs_product_groups_create_many_request_items WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_groups_create_many_request_items'
--
INSERT INTO catalogs_product_groups_create_many_request_items (description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_groups_create_many_request_items'
--
UPDATE catalogs_product_groups_create_many_request_items SET description = ?, feed_id = ?, filters = ?, is_featured = ?, "name" = ?, catalog_id = ?, catalog_type = ?, country = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_groups_create_many_request_items'
--
DELETE FROM catalogs_product_groups_create_many_request_items WHERE 1=2;

