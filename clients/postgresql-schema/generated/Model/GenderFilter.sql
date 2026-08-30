--
-- "Pinterest REST API"
-- Prepared SQL queries for 'GenderFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_filter'
--
SELECT gender FROM gender_filter WHERE 1=1;

--
-- INSERT template for table 'gender_filter'
--
INSERT INTO gender_filter (gender) VALUES (?);

--
-- UPDATE template for table 'gender_filter'
--
UPDATE gender_filter SET gender = ? WHERE 1=2;

--
-- DELETE template for table 'gender_filter'
--
DELETE FROM gender_filter WHERE 1=2;

