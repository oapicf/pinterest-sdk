--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionDeletionRequestCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_deletion_request_create'
--
SELECT deletion_targets FROM conversion_deletion_request_create WHERE 1=1;

--
-- INSERT template for table 'conversion_deletion_request_create'
--
INSERT INTO conversion_deletion_request_create (deletion_targets) VALUES (?);

--
-- UPDATE template for table 'conversion_deletion_request_create'
--
UPDATE conversion_deletion_request_create SET deletion_targets = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_deletion_request_create'
--
DELETE FROM conversion_deletion_request_create WHERE 1=2;

