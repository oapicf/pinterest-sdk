--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CurrencyFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'currency_filter'
--
SELECT currency FROM currency_filter WHERE 1=1;

--
-- INSERT template for table 'currency_filter'
--
INSERT INTO currency_filter (currency) VALUES (?);

--
-- UPDATE template for table 'currency_filter'
--
UPDATE currency_filter SET currency = ? WHERE 1=2;

--
-- DELETE template for table 'currency_filter'
--
DELETE FROM currency_filter WHERE 1=2;

