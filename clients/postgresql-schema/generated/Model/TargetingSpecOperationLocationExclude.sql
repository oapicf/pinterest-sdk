--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationLocationExclude' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_location_exclude'
--
SELECT field, operation, "values" FROM targeting_spec_operation_location_exclude WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_location_exclude'
--
INSERT INTO targeting_spec_operation_location_exclude (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_location_exclude'
--
UPDATE targeting_spec_operation_location_exclude SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_location_exclude'
--
DELETE FROM targeting_spec_operation_location_exclude WHERE 1=2;

