--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLogsInvalidLogResponseRejectedLogsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_logs_invalid_log_response_rejected_logs_items'
--
SELECT field, log_index, reason, "value" FROM integration_logs_invalid_log_response_rejected_logs_items WHERE 1=1;

--
-- INSERT template for table 'integration_logs_invalid_log_response_rejected_logs_items'
--
INSERT INTO integration_logs_invalid_log_response_rejected_logs_items (field, log_index, reason, "value") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'integration_logs_invalid_log_response_rejected_logs_items'
--
UPDATE integration_logs_invalid_log_response_rejected_logs_items SET field = ?, log_index = ?, reason = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'integration_logs_invalid_log_response_rejected_logs_items'
--
DELETE FROM integration_logs_invalid_log_response_rejected_logs_items WHERE 1=2;

