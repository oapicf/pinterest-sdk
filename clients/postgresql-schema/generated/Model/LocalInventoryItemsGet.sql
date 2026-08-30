--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryItemsGet' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_items_get'
--
SELECT items FROM local_inventory_items_get WHERE 1=1;

--
-- INSERT template for table 'local_inventory_items_get'
--
INSERT INTO local_inventory_items_get (items) VALUES (?);

--
-- UPDATE template for table 'local_inventory_items_get'
--
UPDATE local_inventory_items_get SET items = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_items_get'
--
DELETE FROM local_inventory_items_get WHERE 1=2;

