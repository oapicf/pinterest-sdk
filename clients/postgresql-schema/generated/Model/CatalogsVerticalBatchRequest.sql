--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsVerticalBatchRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_vertical_batch_request'
--
SELECT catalog_id, catalog_type, country, items, "language" FROM catalogs_vertical_batch_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_vertical_batch_request'
--
INSERT INTO catalogs_vertical_batch_request (catalog_id, catalog_type, country, items, "language") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_vertical_batch_request'
--
UPDATE catalogs_vertical_batch_request SET catalog_id = ?, catalog_type = ?, country = ?, items = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_vertical_batch_request'
--
DELETE FROM catalogs_vertical_batch_request WHERE 1=2;

