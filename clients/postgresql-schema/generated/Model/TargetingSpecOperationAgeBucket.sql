--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationAgeBucket' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_age_bucket'
--
SELECT field, operation, "values" FROM targeting_spec_operation_age_bucket WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_age_bucket'
--
INSERT INTO targeting_spec_operation_age_bucket (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_age_bucket'
--
UPDATE targeting_spec_operation_age_bucket SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_age_bucket'
--
DELETE FROM targeting_spec_operation_age_bucket WHERE 1=2;

