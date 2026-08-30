--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductCategoriesDemographic' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_categories_demographic'
--
SELECT age, gender FROM product_categories_demographic WHERE 1=1;

--
-- INSERT template for table 'product_categories_demographic'
--
INSERT INTO product_categories_demographic (age, gender) VALUES (?, ?);

--
-- UPDATE template for table 'product_categories_demographic'
--
UPDATE product_categories_demographic SET age = ?, gender = ? WHERE 1=2;

--
-- DELETE template for table 'product_categories_demographic'
--
DELETE FROM product_categories_demographic WHERE 1=2;

