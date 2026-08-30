--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendsAgeDistribution' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trends_age_distribution'
--
SELECT age_distribution FROM trends_age_distribution WHERE 1=1;

--
-- INSERT template for table 'trends_age_distribution'
--
INSERT INTO trends_age_distribution (age_distribution) VALUES (?);

--
-- UPDATE template for table 'trends_age_distribution'
--
UPDATE trends_age_distribution SET age_distribution = ? WHERE 1=2;

--
-- DELETE template for table 'trends_age_distribution'
--
DELETE FROM trends_age_distribution WHERE 1=2;

