--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponsePinsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'top_video_pins_analytics_response_pins_items'
--
SELECT data_status, metrics, pin_id FROM top_video_pins_analytics_response_pins_items WHERE 1=1;

--
-- INSERT template for table 'top_video_pins_analytics_response_pins_items'
--
INSERT INTO top_video_pins_analytics_response_pins_items (data_status, metrics, pin_id) VALUES (?, ?, ?);

--
-- UPDATE template for table 'top_video_pins_analytics_response_pins_items'
--
UPDATE top_video_pins_analytics_response_pins_items SET data_status = ?, metrics = ?, pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'top_video_pins_analytics_response_pins_items'
--
DELETE FROM top_video_pins_analytics_response_pins_items WHERE 1=2;

