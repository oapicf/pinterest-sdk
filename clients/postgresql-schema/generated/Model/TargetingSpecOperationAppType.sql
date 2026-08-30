--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationAppType' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_app_type'
--
SELECT field, operation, "values" FROM targeting_spec_operation_app_type WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_app_type'
--
INSERT INTO targeting_spec_operation_app_type (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_app_type'
--
UPDATE targeting_spec_operation_app_type SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_app_type'
--
DELETE FROM targeting_spec_operation_app_type WHERE 1=2;

