--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CountryFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'country_filter'
--
SELECT country FROM country_filter WHERE 1=1;

--
-- INSERT template for table 'country_filter'
--
INSERT INTO country_filter (country) VALUES (?);

--
-- UPDATE template for table 'country_filter'
--
UPDATE country_filter SET country = ? WHERE 1=2;

--
-- DELETE template for table 'country_filter'
--
DELETE FROM country_filter WHERE 1=2;

