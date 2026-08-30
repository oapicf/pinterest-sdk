--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemUpdateBatchRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_update_batch_record'
--
SELECT "attributes", item_id, update_mask FROM item_update_batch_record WHERE 1=1;

--
-- INSERT template for table 'item_update_batch_record'
--
INSERT INTO item_update_batch_record ("attributes", item_id, update_mask) VALUES (?, ?, ?);

--
-- UPDATE template for table 'item_update_batch_record'
--
UPDATE item_update_batch_record SET "attributes" = ?, item_id = ?, update_mask = ? WHERE 1=2;

--
-- DELETE template for table 'item_update_batch_record'
--
DELETE FROM item_update_batch_record WHERE 1=2;

