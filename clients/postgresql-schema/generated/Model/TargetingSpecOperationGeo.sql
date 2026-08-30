--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationGeo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_geo'
--
SELECT field, operation, "values" FROM targeting_spec_operation_geo WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_geo'
--
INSERT INTO targeting_spec_operation_geo (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_geo'
--
UPDATE targeting_spec_operation_geo SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_geo'
--
DELETE FROM targeting_spec_operation_geo WHERE 1=2;

