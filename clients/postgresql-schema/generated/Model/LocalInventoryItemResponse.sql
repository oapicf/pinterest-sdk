--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LocalInventoryItemResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'local_inventory_item_response'
--
SELECT ad_link, availability, created_at, item_id, last_updated_time, price, sale_price, store_metadata FROM local_inventory_item_response WHERE 1=1;

--
-- INSERT template for table 'local_inventory_item_response'
--
INSERT INTO local_inventory_item_response (ad_link, availability, created_at, item_id, last_updated_time, price, sale_price, store_metadata) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'local_inventory_item_response'
--
UPDATE local_inventory_item_response SET ad_link = ?, availability = ?, created_at = ?, item_id = ?, last_updated_time = ?, price = ?, sale_price = ?, store_metadata = ? WHERE 1=2;

--
-- DELETE template for table 'local_inventory_item_response'
--
DELETE FROM local_inventory_item_response WHERE 1=2;

