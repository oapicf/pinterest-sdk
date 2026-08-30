--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TopPinsAnalyticsResponseDateAvailability' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'top_pins_analytics_response_date_availability'
--
SELECT is_realtime, latest_available_timestamp FROM top_pins_analytics_response_date_availability WHERE 1=1;

--
-- INSERT template for table 'top_pins_analytics_response_date_availability'
--
INSERT INTO top_pins_analytics_response_date_availability (is_realtime, latest_available_timestamp) VALUES (?, ?);

--
-- UPDATE template for table 'top_pins_analytics_response_date_availability'
--
UPDATE top_pins_analytics_response_date_availability SET is_realtime = ?, latest_available_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'top_pins_analytics_response_date_availability'
--
DELETE FROM top_pins_analytics_response_date_availability WHERE 1=2;

