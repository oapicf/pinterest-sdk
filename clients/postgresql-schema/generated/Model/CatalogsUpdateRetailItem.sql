--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsUpdateRetailItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_update_retail_item'
--
SELECT "attributes", item_id, operation, update_mask FROM catalogs_update_retail_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_update_retail_item'
--
INSERT INTO catalogs_update_retail_item ("attributes", item_id, operation, update_mask) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_update_retail_item'
--
UPDATE catalogs_update_retail_item SET "attributes" = ?, item_id = ?, operation = ?, update_mask = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_update_retail_item'
--
DELETE FROM catalogs_update_retail_item WHERE 1=2;

