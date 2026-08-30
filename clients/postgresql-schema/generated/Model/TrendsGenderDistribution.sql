--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendsGenderDistribution' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trends_gender_distribution'
--
SELECT gender_distribution FROM trends_gender_distribution WHERE 1=1;

--
-- INSERT template for table 'trends_gender_distribution'
--
INSERT INTO trends_gender_distribution (gender_distribution) VALUES (?);

--
-- UPDATE template for table 'trends_gender_distribution'
--
UPDATE trends_gender_distribution SET gender_distribution = ? WHERE 1=2;

--
-- DELETE template for table 'trends_gender_distribution'
--
DELETE FROM trends_gender_distribution WHERE 1=2;

