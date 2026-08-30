--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeliveryMetricsResponseItemsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delivery_metrics_response_items_items'
--
SELECT category, definition, display_name, "name" FROM delivery_metrics_response_items_items WHERE 1=1;

--
-- INSERT template for table 'delivery_metrics_response_items_items'
--
INSERT INTO delivery_metrics_response_items_items (category, definition, display_name, "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'delivery_metrics_response_items_items'
--
UPDATE delivery_metrics_response_items_items SET category = ?, definition = ?, display_name = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'delivery_metrics_response_items_items'
--
DELETE FROM delivery_metrics_response_items_items WHERE 1=2;

