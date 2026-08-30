--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EventData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'event_data'
--
SELECT currency, lead_type, line_items, order_id, order_quantity, page_name, promo_code, property, search_query, "value", video_title FROM event_data WHERE 1=1;

--
-- INSERT template for table 'event_data'
--
INSERT INTO event_data (currency, lead_type, line_items, order_id, order_quantity, page_name, promo_code, property, search_query, "value", video_title) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'event_data'
--
UPDATE event_data SET currency = ?, lead_type = ?, line_items = ?, order_id = ?, order_quantity = ?, page_name = ?, promo_code = ?, property = ?, search_query = ?, "value" = ?, video_title = ? WHERE 1=2;

--
-- DELETE template for table 'event_data'
--
DELETE FROM event_data WHERE 1=2;

