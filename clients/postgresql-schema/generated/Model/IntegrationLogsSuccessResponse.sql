--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLogsSuccessResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_logs_success_response'
--
SELECT message FROM integration_logs_success_response WHERE 1=1;

--
-- INSERT template for table 'integration_logs_success_response'
--
INSERT INTO integration_logs_success_response (message) VALUES (?);

--
-- UPDATE template for table 'integration_logs_success_response'
--
UPDATE integration_logs_success_response SET message = ? WHERE 1=2;

--
-- DELETE template for table 'integration_logs_success_response'
--
DELETE FROM integration_logs_success_response WHERE 1=2;

