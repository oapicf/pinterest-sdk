--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TopPinsAnalyticsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'top_pins_analytics_response'
--
SELECT date_availability, pins, sort_by FROM top_pins_analytics_response WHERE 1=1;

--
-- INSERT template for table 'top_pins_analytics_response'
--
INSERT INTO top_pins_analytics_response (date_availability, pins, sort_by) VALUES (?, ?, ?);

--
-- UPDATE template for table 'top_pins_analytics_response'
--
UPDATE top_pins_analytics_response SET date_availability = ?, pins = ?, sort_by = ? WHERE 1=2;

--
-- DELETE template for table 'top_pins_analytics_response'
--
DELETE FROM top_pins_analytics_response WHERE 1=2;

