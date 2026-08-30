--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PriceFilterPrice' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'price_filter_price'
--
SELECT currency, negated, "operator", "value" FROM price_filter_price WHERE 1=1;

--
-- INSERT template for table 'price_filter_price'
--
INSERT INTO price_filter_price (currency, negated, "operator", "value") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'price_filter_price'
--
UPDATE price_filter_price SET currency = ?, negated = ?, "operator" = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'price_filter_price'
--
DELETE FROM price_filter_price WHERE 1=2;

