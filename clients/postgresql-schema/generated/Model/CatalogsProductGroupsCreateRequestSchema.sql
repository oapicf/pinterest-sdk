--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupsCreateRequestSchema' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_groups_create_request_schema'
--
SELECT description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale FROM catalogs_product_groups_create_request_schema WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_groups_create_request_schema'
--
INSERT INTO catalogs_product_groups_create_request_schema (description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_groups_create_request_schema'
--
UPDATE catalogs_product_groups_create_request_schema SET description = ?, feed_id = ?, filters = ?, is_featured = ?, "name" = ?, catalog_id = ?, catalog_type = ?, country = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_groups_create_request_schema'
--
DELETE FROM catalogs_product_groups_create_request_schema WHERE 1=2;

