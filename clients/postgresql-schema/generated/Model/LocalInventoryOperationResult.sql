--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryOperationResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_operation_result'
--
SELECT errors, item_id, status, store_code, supplemental_type, warnings FROM local_inventory_operation_result WHERE 1=1;

--
-- INSERT template for table 'local_inventory_operation_result'
--
INSERT INTO local_inventory_operation_result (errors, item_id, status, store_code, supplemental_type, warnings) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_inventory_operation_result'
--
UPDATE local_inventory_operation_result SET errors = ?, item_id = ?, status = ?, store_code = ?, supplemental_type = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_operation_result'
--
DELETE FROM local_inventory_operation_result WHERE 1=2;

