--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventsDataItemsCustomData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_events_data_items_custom_data'
--
SELECT content_brand, content_category, content_ids, content_name, contents, currency, external_measurement_id, external_measurement_vendor_id, np, num_items, opt_out_type, order_id, predicted_ltv, search_string, "value" FROM conversion_events_data_items_custom_data WHERE 1=1;

--
-- INSERT template for table 'conversion_events_data_items_custom_data'
--
INSERT INTO conversion_events_data_items_custom_data (content_brand, content_category, content_ids, content_name, contents, currency, external_measurement_id, external_measurement_vendor_id, np, num_items, opt_out_type, order_id, predicted_ltv, search_string, "value") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_events_data_items_custom_data'
--
UPDATE conversion_events_data_items_custom_data SET content_brand = ?, content_category = ?, content_ids = ?, content_name = ?, contents = ?, currency = ?, external_measurement_id = ?, external_measurement_vendor_id = ?, np = ?, num_items = ?, opt_out_type = ?, order_id = ?, predicted_ltv = ?, search_string = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_events_data_items_custom_data'
--
DELETE FROM conversion_events_data_items_custom_data WHERE 1=2;

