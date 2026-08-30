--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationGender' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_gender'
--
SELECT field, operation, "values" FROM targeting_spec_operation_gender WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_gender'
--
INSERT INTO targeting_spec_operation_gender (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_gender'
--
UPDATE targeting_spec_operation_gender SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_gender'
--
DELETE FROM targeting_spec_operation_gender WHERE 1=2;

