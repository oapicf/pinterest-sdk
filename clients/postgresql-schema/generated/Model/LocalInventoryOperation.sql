--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryOperation' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_operation'
--
SELECT "attributes", item_id, operation, store_code FROM local_inventory_operation WHERE 1=1;

--
-- INSERT template for table 'local_inventory_operation'
--
INSERT INTO local_inventory_operation ("attributes", item_id, operation, store_code) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'local_inventory_operation'
--
UPDATE local_inventory_operation SET "attributes" = ?, item_id = ?, operation = ?, store_code = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_operation'
--
DELETE FROM local_inventory_operation WHERE 1=2;

