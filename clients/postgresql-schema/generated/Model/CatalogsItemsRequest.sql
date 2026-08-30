--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemsRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_items_request'
--
SELECT country, filters, "language" FROM catalogs_items_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_items_request'
--
INSERT INTO catalogs_items_request (country, filters, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_items_request'
--
UPDATE catalogs_items_request SET country = ?, filters = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_items_request'
--
DELETE FROM catalogs_items_request WHERE 1=2;

