--
-- "Pinterest REST API"
-- Prepared SQL queries for 'GenderMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_multipliers'
--
SELECT gender FROM gender_multipliers WHERE 1=1;

--
-- INSERT template for table 'gender_multipliers'
--
INSERT INTO gender_multipliers (gender) VALUES (?);

--
-- UPDATE template for table 'gender_multipliers'
--
UPDATE gender_multipliers SET gender = ? WHERE 1=2;

--
-- DELETE template for table 'gender_multipliers'
--
DELETE FROM gender_multipliers WHERE 1=2;

