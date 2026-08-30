--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemDeleteBatchRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_delete_batch_record'
--
SELECT item_id FROM item_delete_batch_record WHERE 1=1;

--
-- INSERT template for table 'item_delete_batch_record'
--
INSERT INTO item_delete_batch_record (item_id) VALUES (?);

--
-- UPDATE template for table 'item_delete_batch_record'
--
UPDATE item_delete_batch_record SET item_id = ? WHERE 1=2;

--
-- DELETE template for table 'item_delete_batch_record'
--
DELETE FROM item_delete_batch_record WHERE 1=2;

