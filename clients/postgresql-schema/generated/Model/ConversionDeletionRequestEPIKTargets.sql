--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionDeletionRequestEPIKTargets' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_deletion_request_epik_targets'
--
SELECT epiks FROM conversion_deletion_request_epik_targets WHERE 1=1;

--
-- INSERT template for table 'conversion_deletion_request_epik_targets'
--
INSERT INTO conversion_deletion_request_epik_targets (epiks) VALUES (?);

--
-- UPDATE template for table 'conversion_deletion_request_epik_targets'
--
UPDATE conversion_deletion_request_epik_targets SET epiks = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_deletion_request_epik_targets'
--
DELETE FROM conversion_deletion_request_epik_targets WHERE 1=2;

