--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailItemResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_item_response'
--
SELECT "attributes", catalog_type, item_id, item_response_kind, pins FROM catalogs_retail_item_response WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_item_response'
--
INSERT INTO catalogs_retail_item_response ("attributes", catalog_type, item_id, item_response_kind, pins) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_item_response'
--
UPDATE catalogs_retail_item_response SET "attributes" = ?, catalog_type = ?, item_id = ?, item_response_kind = ?, pins = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_item_response'
--
DELETE FROM catalogs_retail_item_response WHERE 1=2;

