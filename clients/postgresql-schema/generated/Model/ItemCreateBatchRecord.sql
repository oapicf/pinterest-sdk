--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemCreateBatchRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_create_batch_record'
--
SELECT "attributes", item_id FROM item_create_batch_record WHERE 1=1;

--
-- INSERT template for table 'item_create_batch_record'
--
INSERT INTO item_create_batch_record ("attributes", item_id) VALUES (?, ?);

--
-- UPDATE template for table 'item_create_batch_record'
--
UPDATE item_create_batch_record SET "attributes" = ?, item_id = ? WHERE 1=2;

--
-- DELETE template for table 'item_create_batch_record'
--
DELETE FROM item_create_batch_record WHERE 1=2;

