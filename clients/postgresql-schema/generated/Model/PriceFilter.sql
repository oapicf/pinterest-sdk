--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PriceFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'price_filter'
--
SELECT price FROM price_filter WHERE 1=1;

--
-- INSERT template for table 'price_filter'
--
INSERT INTO price_filter (price) VALUES (?);

--
-- UPDATE template for table 'price_filter'
--
UPDATE price_filter SET price = ? WHERE 1=2;

--
-- DELETE template for table 'price_filter'
--
DELETE FROM price_filter WHERE 1=2;

