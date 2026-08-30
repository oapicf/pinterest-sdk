--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsDeleteRetailItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_delete_retail_item'
--
SELECT item_id, last_updated_time, operation FROM catalogs_delete_retail_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_delete_retail_item'
--
INSERT INTO catalogs_delete_retail_item (item_id, last_updated_time, operation) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_delete_retail_item'
--
UPDATE catalogs_delete_retail_item SET item_id = ?, last_updated_time = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_delete_retail_item'
--
DELETE FROM catalogs_delete_retail_item WHERE 1=2;

