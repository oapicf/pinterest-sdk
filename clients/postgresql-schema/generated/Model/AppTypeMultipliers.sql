--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AppTypeMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'app_type_multipliers'
--
SELECT app_type FROM app_type_multipliers WHERE 1=1;

--
-- INSERT template for table 'app_type_multipliers'
--
INSERT INTO app_type_multipliers (app_type) VALUES (?);

--
-- UPDATE template for table 'app_type_multipliers'
--
UPDATE app_type_multipliers SET app_type = ? WHERE 1=2;

--
-- DELETE template for table 'app_type_multipliers'
--
DELETE FROM app_type_multipliers WHERE 1=2;

