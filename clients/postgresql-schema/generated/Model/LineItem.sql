--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LineItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'line_item'
--
SELECT product_brand, product_category, product_id, product_name, product_price, product_quantity, product_variant, product_variant_id FROM line_item WHERE 1=1;

--
-- INSERT template for table 'line_item'
--
INSERT INTO line_item (product_brand, product_category, product_id, product_name, product_price, product_quantity, product_variant, product_variant_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'line_item'
--
UPDATE line_item SET product_brand = ?, product_category = ?, product_id = ?, product_name = ?, product_price = ?, product_quantity = ?, product_variant = ?, product_variant_id = ? WHERE 1=2;

--
-- DELETE template for table 'line_item'
--
DELETE FROM line_item WHERE 1=2;

