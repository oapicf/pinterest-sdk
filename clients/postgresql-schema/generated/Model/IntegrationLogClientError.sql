--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLogClientError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_log_client_error'
--
SELECT cause, column_number, file_name, line_number, message, message_detail, "name", "number", stack_trace FROM integration_log_client_error WHERE 1=1;

--
-- INSERT template for table 'integration_log_client_error'
--
INSERT INTO integration_log_client_error (cause, column_number, file_name, line_number, message, message_detail, "name", "number", stack_trace) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_log_client_error'
--
UPDATE integration_log_client_error SET cause = ?, column_number = ?, file_name = ?, line_number = ?, message = ?, message_detail = ?, "name" = ?, "number" = ?, stack_trace = ? WHERE 1=2;

--
-- DELETE template for table 'integration_log_client_error'
--
DELETE FROM integration_log_client_error WHERE 1=2;

