--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOperationAudienceInclude' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_operation_audience_include'
--
SELECT field, operation, "values" FROM targeting_spec_operation_audience_include WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_operation_audience_include'
--
INSERT INTO targeting_spec_operation_audience_include (field, operation, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_operation_audience_include'
--
UPDATE targeting_spec_operation_audience_include SET field = ?, operation = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_operation_audience_include'
--
DELETE FROM targeting_spec_operation_audience_include WHERE 1=2;

