--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductType2Filter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_type2_filter'
--
SELECT product_type_2 FROM product_type2_filter WHERE 1=1;

--
-- INSERT template for table 'product_type2_filter'
--
INSERT INTO product_type2_filter (product_type_2) VALUES (?);

--
-- UPDATE template for table 'product_type2_filter'
--
UPDATE product_type2_filter SET product_type_2 = ? WHERE 1=2;

--
-- DELETE template for table 'product_type2_filter'
--
DELETE FROM product_type2_filter WHERE 1=2;

