--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedUpdateRequestSchema' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_update_request_schema'
--
SELECT catalog_type, credentials, default_availability, default_currency, "format", "location", "name", preferred_processing_schedule, status FROM catalogs_feed_update_request_schema WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_update_request_schema'
--
INSERT INTO catalogs_feed_update_request_schema (catalog_type, credentials, default_availability, default_currency, "format", "location", "name", preferred_processing_schedule, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_update_request_schema'
--
UPDATE catalogs_feed_update_request_schema SET catalog_type = ?, credentials = ?, default_availability = ?, default_currency = ?, "format" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_update_request_schema'
--
DELETE FROM catalogs_feed_update_request_schema WHERE 1=2;

