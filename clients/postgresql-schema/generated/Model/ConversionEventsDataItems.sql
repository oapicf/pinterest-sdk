--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventsDataItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_events_data_items'
--
SELECT action_source, app_id, app_info, app_name, app_version, custom_data, device_brand, device_carrier, device_info, device_model, device_type, event_id, event_name, event_source_url, event_time, "language", opt_out, os_version, partner_name, user_data, wifi FROM conversion_events_data_items WHERE 1=1;

--
-- INSERT template for table 'conversion_events_data_items'
--
INSERT INTO conversion_events_data_items (action_source, app_id, app_info, app_name, app_version, custom_data, device_brand, device_carrier, device_info, device_model, device_type, event_id, event_name, event_source_url, event_time, "language", opt_out, os_version, partner_name, user_data, wifi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_events_data_items'
--
UPDATE conversion_events_data_items SET action_source = ?, app_id = ?, app_info = ?, app_name = ?, app_version = ?, custom_data = ?, device_brand = ?, device_carrier = ?, device_info = ?, device_model = ?, device_type = ?, event_id = ?, event_name = ?, event_source_url = ?, event_time = ?, "language" = ?, opt_out = ?, os_version = ?, partner_name = ?, user_data = ?, wifi = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_events_data_items'
--
DELETE FROM conversion_events_data_items WHERE 1=2;

