--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreateRetailItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_create_retail_item'
--
SELECT "attributes", item_id, operation FROM catalogs_create_retail_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_create_retail_item'
--
INSERT INTO catalogs_create_retail_item ("attributes", item_id, operation) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_create_retail_item'
--
UPDATE catalogs_create_retail_item SET "attributes" = ?, item_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_create_retail_item'
--
DELETE FROM catalogs_create_retail_item WHERE 1=2;

