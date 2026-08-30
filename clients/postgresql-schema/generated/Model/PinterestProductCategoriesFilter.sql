--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinterestProductCategoriesFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pinterest_product_categories_filter'
--
SELECT pinterest_product_categories FROM pinterest_product_categories_filter WHERE 1=1;

--
-- INSERT template for table 'pinterest_product_categories_filter'
--
INSERT INTO pinterest_product_categories_filter (pinterest_product_categories) VALUES (?);

--
-- UPDATE template for table 'pinterest_product_categories_filter'
--
UPDATE pinterest_product_categories_filter SET pinterest_product_categories = ? WHERE 1=2;

--
-- DELETE template for table 'pinterest_product_categories_filter'
--
DELETE FROM pinterest_product_categories_filter WHERE 1=2;

