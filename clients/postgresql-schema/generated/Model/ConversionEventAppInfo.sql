--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventAppInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_event_app_info'
--
SELECT app_id, app_name, app_package_name, app_store, app_version, install_time, user_agent, window_height, window_width FROM conversion_event_app_info WHERE 1=1;

--
-- INSERT template for table 'conversion_event_app_info'
--
INSERT INTO conversion_event_app_info (app_id, app_name, app_package_name, app_store, app_version, install_time, user_agent, window_height, window_width) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_event_app_info'
--
UPDATE conversion_event_app_info SET app_id = ?, app_name = ?, app_package_name = ?, app_store = ?, app_version = ?, install_time = ?, user_agent = ?, window_height = ?, window_width = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_event_app_info'
--
DELETE FROM conversion_event_app_info WHERE 1=2;

