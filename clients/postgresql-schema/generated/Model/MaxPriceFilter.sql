--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MaxPriceFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'max_price_filter'
--
SELECT max_price FROM max_price_filter WHERE 1=1;

--
-- INSERT template for table 'max_price_filter'
--
INSERT INTO max_price_filter (max_price) VALUES (?);

--
-- UPDATE template for table 'max_price_filter'
--
UPDATE max_price_filter SET max_price = ? WHERE 1=2;

--
-- DELETE template for table 'max_price_filter'
--
DELETE FROM max_price_filter WHERE 1=2;

