--
-- "Pinterest REST API"
-- Prepared SQL queries for 'GenderDemographics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_demographics'
--
SELECT female, male, unspecified FROM gender_demographics WHERE 1=1;

--
-- INSERT template for table 'gender_demographics'
--
INSERT INTO gender_demographics (female, male, unspecified) VALUES (?, ?, ?);

--
-- UPDATE template for table 'gender_demographics'
--
UPDATE gender_demographics SET female = ?, male = ?, unspecified = ? WHERE 1=2;

--
-- DELETE template for table 'gender_demographics'
--
DELETE FROM gender_demographics WHERE 1=2;

