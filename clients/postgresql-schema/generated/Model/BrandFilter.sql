--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BrandFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'brand_filter'
--
SELECT brand FROM brand_filter WHERE 1=1;

--
-- INSERT template for table 'brand_filter'
--
INSERT INTO brand_filter (brand) VALUES (?);

--
-- UPDATE template for table 'brand_filter'
--
UPDATE brand_filter SET brand = ? WHERE 1=2;

--
-- DELETE template for table 'brand_filter'
--
DELETE FROM brand_filter WHERE 1=2;

