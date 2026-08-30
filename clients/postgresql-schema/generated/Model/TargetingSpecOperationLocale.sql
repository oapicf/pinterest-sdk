--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationLocale' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_locale'
--
SELECT field, operation, "values" FROM targeting_spec_operation_locale WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_locale'
--
INSERT INTO targeting_spec_operation_locale (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_locale'
--
UPDATE targeting_spec_operation_locale SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_locale'
--
DELETE FROM targeting_spec_operation_locale WHERE 1=2;

