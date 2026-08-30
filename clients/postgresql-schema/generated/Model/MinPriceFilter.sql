--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MinPriceFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'min_price_filter'
--
SELECT min_price FROM min_price_filter WHERE 1=1;

--
-- INSERT template for table 'min_price_filter'
--
INSERT INTO min_price_filter (min_price) VALUES (?);

--
-- UPDATE template for table 'min_price_filter'
--
UPDATE min_price_filter SET min_price = ? WHERE 1=2;

--
-- DELETE template for table 'min_price_filter'
--
DELETE FROM min_price_filter WHERE 1=2;

