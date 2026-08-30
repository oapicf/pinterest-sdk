--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemsBatchPostRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_items_batch_post_request'
--
SELECT catalog_id, catalog_type, country, items, "language", operation FROM catalogs_items_batch_post_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_items_batch_post_request'
--
INSERT INTO catalogs_items_batch_post_request (catalog_id, catalog_type, country, items, "language", operation) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_items_batch_post_request'
--
UPDATE catalogs_items_batch_post_request SET catalog_id = ?, catalog_type = ?, country = ?, items = ?, "language" = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_items_batch_post_request'
--
DELETE FROM catalogs_items_batch_post_request WHERE 1=2;

