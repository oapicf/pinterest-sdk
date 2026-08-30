--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLogClientRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_log_client_request'
--
SELECT host, "method", "path", request_headers, response_headers, response_status_code FROM integration_log_client_request WHERE 1=1;

--
-- INSERT template for table 'integration_log_client_request'
--
INSERT INTO integration_log_client_request (host, "method", "path", request_headers, response_headers, response_status_code) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_log_client_request'
--
UPDATE integration_log_client_request SET host = ?, "method" = ?, "path" = ?, request_headers = ?, response_headers = ?, response_status_code = ? WHERE 1=2;

--
-- DELETE template for table 'integration_log_client_request'
--
DELETE FROM integration_log_client_request WHERE 1=2;

