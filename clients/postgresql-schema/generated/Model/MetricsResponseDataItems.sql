--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MetricsResponseDataItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'metrics_response_data_items'
--
SELECT metrics, targeting_type, targeting_value FROM metrics_response_data_items WHERE 1=1;

--
-- INSERT template for table 'metrics_response_data_items'
--
INSERT INTO metrics_response_data_items (metrics, targeting_type, targeting_value) VALUES (?, ?, ?);

--
-- UPDATE template for table 'metrics_response_data_items'
--
UPDATE metrics_response_data_items SET metrics = ?, targeting_type = ?, targeting_value = ? WHERE 1=2;

--
-- DELETE template for table 'metrics_response_data_items'
--
DELETE FROM metrics_response_data_items WHERE 1=2;

