--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConditionFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'condition_filter'
--
SELECT "condition" FROM condition_filter WHERE 1=1;

--
-- INSERT template for table 'condition_filter'
--
INSERT INTO condition_filter ("condition") VALUES (?);

--
-- UPDATE template for table 'condition_filter'
--
UPDATE condition_filter SET "condition" = ? WHERE 1=2;

--
-- DELETE template for table 'condition_filter'
--
DELETE FROM condition_filter WHERE 1=2;

