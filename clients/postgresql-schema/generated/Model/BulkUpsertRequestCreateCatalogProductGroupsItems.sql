--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkUpsertRequestCreateCatalogProductGroupsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_upsert_request_create_catalog_product_groups_items'
--
SELECT description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale FROM bulk_upsert_request_create_catalog_product_groups_items WHERE 1=1;

--
-- INSERT template for table 'bulk_upsert_request_create_catalog_product_groups_items'
--
INSERT INTO bulk_upsert_request_create_catalog_product_groups_items (description, feed_id, filters, is_featured, "name", catalog_id, catalog_type, country, locale) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_upsert_request_create_catalog_product_groups_items'
--
UPDATE bulk_upsert_request_create_catalog_product_groups_items SET description = ?, feed_id = ?, filters = ?, is_featured = ?, "name" = ?, catalog_id = ?, catalog_type = ?, country = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_upsert_request_create_catalog_product_groups_items'
--
DELETE FROM bulk_upsert_request_create_catalog_product_groups_items WHERE 1=2;

