--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationLocation' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_location'
--
SELECT field, operation, "values" FROM targeting_spec_operation_location WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_location'
--
INSERT INTO targeting_spec_operation_location (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_location'
--
UPDATE targeting_spec_operation_location SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_location'
--
DELETE FROM targeting_spec_operation_location WHERE 1=2;

