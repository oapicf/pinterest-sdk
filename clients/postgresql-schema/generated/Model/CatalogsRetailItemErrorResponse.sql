--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailItemErrorResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_item_error_response'
--
SELECT catalog_type, errors, item_id, item_response_kind FROM catalogs_retail_item_error_response WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_item_error_response'
--
INSERT INTO catalogs_retail_item_error_response (catalog_type, errors, item_id, item_response_kind) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_item_error_response'
--
UPDATE catalogs_retail_item_error_response SET catalog_type = ?, errors = ?, item_id = ?, item_response_kind = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_item_error_response'
--
DELETE FROM catalogs_retail_item_error_response WHERE 1=2;

