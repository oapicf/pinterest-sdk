--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperations' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operations'
--
SELECT field, operation, "values", "value" FROM targeting_spec_operations WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operations'
--
INSERT INTO targeting_spec_operations (field, operation, "values", "value") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operations'
--
UPDATE targeting_spec_operations SET field = ?, operation = ?, "values" = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operations'
--
DELETE FROM targeting_spec_operations WHERE 1=2;

