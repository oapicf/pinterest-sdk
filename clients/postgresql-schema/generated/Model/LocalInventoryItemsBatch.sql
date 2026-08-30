--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryItemsBatch' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_items_batch'
--
SELECT batch_id, completed_time, created_time, operation_results, status FROM local_inventory_items_batch WHERE 1=1;

--
-- INSERT template for table 'local_inventory_items_batch'
--
INSERT INTO local_inventory_items_batch (batch_id, completed_time, created_time, operation_results, status) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_inventory_items_batch'
--
UPDATE local_inventory_items_batch SET batch_id = ?, completed_time = ?, created_time = ?, operation_results = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_items_batch'
--
DELETE FROM local_inventory_items_batch WHERE 1=2;

