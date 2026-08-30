--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsVerticalFeedsCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_vertical_feeds_create_request'
--
SELECT catalog_id, catalog_type, credentials, default_availability, default_country, default_currency, default_locale, "format", "location", "name", preferred_processing_schedule, status FROM catalogs_vertical_feeds_create_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_vertical_feeds_create_request'
--
INSERT INTO catalogs_vertical_feeds_create_request (catalog_id, catalog_type, credentials, default_availability, default_country, default_currency, default_locale, "format", "location", "name", preferred_processing_schedule, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_vertical_feeds_create_request'
--
UPDATE catalogs_vertical_feeds_create_request SET catalog_id = ?, catalog_type = ?, credentials = ?, default_availability = ?, default_country = ?, default_currency = ?, default_locale = ?, "format" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_vertical_feeds_create_request'
--
DELETE FROM catalogs_vertical_feeds_create_request WHERE 1=2;

