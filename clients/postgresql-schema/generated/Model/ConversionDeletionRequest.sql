--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionDeletionRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_deletion_request'
--
SELECT created_time, processed_time, request_id, status FROM conversion_deletion_request WHERE 1=1;

--
-- INSERT template for table 'conversion_deletion_request'
--
INSERT INTO conversion_deletion_request (created_time, processed_time, request_id, status) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_deletion_request'
--
UPDATE conversion_deletion_request SET created_time = ?, processed_time = ?, request_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_deletion_request'
--
DELETE FROM conversion_deletion_request WHERE 1=2;

