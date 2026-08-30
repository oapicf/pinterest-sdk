--
-- "Pinterest REST API"
-- Prepared SQL queries for 'FrequencyMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'frequency_multipliers'
--
SELECT impression_count FROM frequency_multipliers WHERE 1=1;

--
-- INSERT template for table 'frequency_multipliers'
--
INSERT INTO frequency_multipliers (impression_count) VALUES (?);

--
-- UPDATE template for table 'frequency_multipliers'
--
UPDATE frequency_multipliers SET impression_count = ? WHERE 1=2;

--
-- DELETE template for table 'frequency_multipliers'
--
DELETE FROM frequency_multipliers WHERE 1=2;

