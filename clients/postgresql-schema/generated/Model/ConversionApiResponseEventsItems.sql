--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionApiResponseEventsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_api_response_events_items'
--
SELECT error_message, status, warning_message FROM conversion_api_response_events_items WHERE 1=1;

--
-- INSERT template for table 'conversion_api_response_events_items'
--
INSERT INTO conversion_api_response_events_items (error_message, status, warning_message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'conversion_api_response_events_items'
--
UPDATE conversion_api_response_events_items SET error_message = ?, status = ?, warning_message = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_api_response_events_items'
--
DELETE FROM conversion_api_response_events_items WHERE 1=2;

