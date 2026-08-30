--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionDeletionRequestUserEmailTargets' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_deletion_request_user_email_targets'
--
SELECT user_emails FROM conversion_deletion_request_user_email_targets WHERE 1=1;

--
-- INSERT template for table 'conversion_deletion_request_user_email_targets'
--
INSERT INTO conversion_deletion_request_user_email_targets (user_emails) VALUES (?);

--
-- UPDATE template for table 'conversion_deletion_request_user_email_targets'
--
UPDATE conversion_deletion_request_user_email_targets SET user_emails = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_deletion_request_user_email_targets'
--
DELETE FROM conversion_deletion_request_user_email_targets WHERE 1=2;

