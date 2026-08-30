--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventDeviceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_event_device_info'
--
SELECT battery_level, brand, carrier, cpu_cores, external_storage_free_space, external_storage_size, form_factor, kernel_version, languages, locale, model, network_type, os_family, os_name, os_release_name, os_version, screen_density, screen_height, screen_width, storage_free_space, storage_size, timezone, timezone_abbr, "type" FROM conversion_event_device_info WHERE 1=1;

--
-- INSERT template for table 'conversion_event_device_info'
--
INSERT INTO conversion_event_device_info (battery_level, brand, carrier, cpu_cores, external_storage_free_space, external_storage_size, form_factor, kernel_version, languages, locale, model, network_type, os_family, os_name, os_release_name, os_version, screen_density, screen_height, screen_width, storage_free_space, storage_size, timezone, timezone_abbr, "type") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_event_device_info'
--
UPDATE conversion_event_device_info SET battery_level = ?, brand = ?, carrier = ?, cpu_cores = ?, external_storage_free_space = ?, external_storage_size = ?, form_factor = ?, kernel_version = ?, languages = ?, locale = ?, model = ?, network_type = ?, os_family = ?, os_name = ?, os_release_name = ?, os_version = ?, screen_density = ?, screen_height = ?, screen_width = ?, storage_free_space = ?, storage_size = ?, timezone = ?, timezone_abbr = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_event_device_info'
--
DELETE FROM conversion_event_device_info WHERE 1=2;

