--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemsCreateBatchRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_items_create_batch_request'
--
SELECT country, items, "language", operation FROM catalogs_items_create_batch_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_items_create_batch_request'
--
INSERT INTO catalogs_items_create_batch_request (country, items, "language", operation) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_items_create_batch_request'
--
UPDATE catalogs_items_create_batch_request SET country = ?, items = ?, "language" = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_items_create_batch_request'
--
DELETE FROM catalogs_items_create_batch_request WHERE 1=2;

