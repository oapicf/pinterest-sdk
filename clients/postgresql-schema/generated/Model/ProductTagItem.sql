--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductTagItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_tag_item'
--
SELECT pin_id FROM product_tag_item WHERE 1=1;

--
-- INSERT template for table 'product_tag_item'
--
INSERT INTO product_tag_item (pin_id) VALUES (?);

--
-- UPDATE template for table 'product_tag_item'
--
UPDATE product_tag_item SET pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'product_tag_item'
--
DELETE FROM product_tag_item WHERE 1=2;

