--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationMaximumAge' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_maximum_age'
--
SELECT field, operation, "value" FROM targeting_spec_operation_maximum_age WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_maximum_age'
--
INSERT INTO targeting_spec_operation_maximum_age (field, operation, "value") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_maximum_age'
--
UPDATE targeting_spec_operation_maximum_age SET field = ?, operation = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_maximum_age'
--
DELETE FROM targeting_spec_operation_maximum_age WHERE 1=2;

