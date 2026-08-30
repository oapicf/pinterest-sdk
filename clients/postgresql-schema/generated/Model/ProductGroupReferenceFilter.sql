--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductGroupReferenceFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_reference_filter'
--
SELECT product_group FROM product_group_reference_filter WHERE 1=1;

--
-- INSERT template for table 'product_group_reference_filter'
--
INSERT INTO product_group_reference_filter (product_group) VALUES (?);

--
-- UPDATE template for table 'product_group_reference_filter'
--
UPDATE product_group_reference_filter SET product_group = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_reference_filter'
--
DELETE FROM product_group_reference_filter WHERE 1=2;

