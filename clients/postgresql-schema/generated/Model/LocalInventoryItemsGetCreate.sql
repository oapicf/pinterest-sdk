--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryItemsGetCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_items_get_create'
--
SELECT item_filters FROM local_inventory_items_get_create WHERE 1=1;

--
-- INSERT template for table 'local_inventory_items_get_create'
--
INSERT INTO local_inventory_items_get_create (item_filters) VALUES (?);

--
-- UPDATE template for table 'local_inventory_items_get_create'
--
UPDATE local_inventory_items_get_create SET item_filters = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_items_get_create'
--
DELETE FROM local_inventory_items_get_create WHERE 1=2;

