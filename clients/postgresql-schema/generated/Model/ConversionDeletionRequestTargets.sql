--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionDeletionRequestTargets' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_deletion_request_targets'
--
SELECT user_emails, epiks FROM conversion_deletion_request_targets WHERE 1=1;

--
-- INSERT template for table 'conversion_deletion_request_targets'
--
INSERT INTO conversion_deletion_request_targets (user_emails, epiks) VALUES (?, ?);

--
-- UPDATE template for table 'conversion_deletion_request_targets'
--
UPDATE conversion_deletion_request_targets SET user_emails = ?, epiks = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_deletion_request_targets'
--
DELETE FROM conversion_deletion_request_targets WHERE 1=2;

