--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationInterest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_interest'
--
SELECT field, operation, "values" FROM targeting_spec_operation_interest WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_interest'
--
INSERT INTO targeting_spec_operation_interest (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_interest'
--
UPDATE targeting_spec_operation_interest SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_interest'
--
DELETE FROM targeting_spec_operation_interest WHERE 1=2;

