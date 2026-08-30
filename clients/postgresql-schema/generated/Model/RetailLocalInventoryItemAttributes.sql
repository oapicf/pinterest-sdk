--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RetailLocalInventoryItemAttributes' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'retail_local_inventory_item_attributes'
--
SELECT ad_link, availability, price, sale_price FROM retail_local_inventory_item_attributes WHERE 1=1;

--
-- INSERT template for table 'retail_local_inventory_item_attributes'
--
INSERT INTO retail_local_inventory_item_attributes (ad_link, availability, price, sale_price) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'retail_local_inventory_item_attributes'
--
UPDATE retail_local_inventory_item_attributes SET ad_link = ?, availability = ?, price = ?, sale_price = ? WHERE 1=2;

--
-- DELETE template for table 'retail_local_inventory_item_attributes'
--
DELETE FROM retail_local_inventory_item_attributes WHERE 1=2;

