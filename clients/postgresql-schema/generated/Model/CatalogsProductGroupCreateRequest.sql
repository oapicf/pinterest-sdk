--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_create_request'
--
SELECT description, feed_id, filters, is_featured, "name" FROM catalogs_product_group_create_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_create_request'
--
INSERT INTO catalogs_product_group_create_request (description, feed_id, filters, is_featured, "name") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_create_request'
--
UPDATE catalogs_product_group_create_request SET description = ?, feed_id = ?, filters = ?, is_featured = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_create_request'
--
DELETE FROM catalogs_product_group_create_request WHERE 1=2;

