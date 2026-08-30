--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLogsInvalidLogResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_logs_invalid_log_response'
--
SELECT rejected_logs FROM integration_logs_invalid_log_response WHERE 1=1;

--
-- INSERT template for table 'integration_logs_invalid_log_response'
--
INSERT INTO integration_logs_invalid_log_response (rejected_logs) VALUES (?);

--
-- UPDATE template for table 'integration_logs_invalid_log_response'
--
UPDATE integration_logs_invalid_log_response SET rejected_logs = ? WHERE 1=2;

--
-- DELETE template for table 'integration_logs_invalid_log_response'
--
DELETE FROM integration_logs_invalid_log_response WHERE 1=2;

