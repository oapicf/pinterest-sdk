--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RetailLocalInventoryItemAttributesOptional' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'retail_local_inventory_item_attributes_optional'
--
SELECT ad_link, availability, price, sale_price FROM retail_local_inventory_item_attributes_optional WHERE 1=1;

--
-- INSERT template for table 'retail_local_inventory_item_attributes_optional'
--
INSERT INTO retail_local_inventory_item_attributes_optional (ad_link, availability, price, sale_price) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'retail_local_inventory_item_attributes_optional'
--
UPDATE retail_local_inventory_item_attributes_optional SET ad_link = ?, availability = ?, price = ?, sale_price = ? WHERE 1=2;

--
-- DELETE template for table 'retail_local_inventory_item_attributes_optional'
--
DELETE FROM retail_local_inventory_item_attributes_optional WHERE 1=2;

