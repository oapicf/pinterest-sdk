--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailBatchRequestItemsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_batch_request_items_items'
--
SELECT "attributes", item_id, operation, update_mask, last_updated_time FROM catalogs_retail_batch_request_items_items WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_batch_request_items_items'
--
INSERT INTO catalogs_retail_batch_request_items_items ("attributes", item_id, operation, update_mask, last_updated_time) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_batch_request_items_items'
--
UPDATE catalogs_retail_batch_request_items_items SET "attributes" = ?, item_id = ?, operation = ?, update_mask = ?, last_updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_batch_request_items_items'
--
DELETE FROM catalogs_retail_batch_request_items_items WHERE 1=2;

