--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IntegrationLog' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'integration_log'
--
SELECT advertiser_id, app_version_number, client_timestamp, "error", event_type, external_business_id, feed_profile_id, log_level, merchant_id, message, platform_version_number, request, tag_id FROM integration_log WHERE 1=1;

--
-- INSERT template for table 'integration_log'
--
INSERT INTO integration_log (advertiser_id, app_version_number, client_timestamp, "error", event_type, external_business_id, feed_profile_id, log_level, merchant_id, message, platform_version_number, request, tag_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'integration_log'
--
UPDATE integration_log SET advertiser_id = ?, app_version_number = ?, client_timestamp = ?, "error" = ?, event_type = ?, external_business_id = ?, feed_profile_id = ?, log_level = ?, merchant_id = ?, message = ?, platform_version_number = ?, request = ?, tag_id = ? WHERE 1=2;

--
-- DELETE template for table 'integration_log'
--
DELETE FROM integration_log WHERE 1=2;

