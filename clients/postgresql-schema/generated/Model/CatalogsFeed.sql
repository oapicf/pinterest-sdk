--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeed' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed'
--
SELECT catalog_type, created_at, credentials, default_availability, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at, catalog_id FROM catalogs_feed WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed'
--
INSERT INTO catalogs_feed (catalog_type, created_at, credentials, default_availability, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at, catalog_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed'
--
UPDATE catalogs_feed SET catalog_type = ?, created_at = ?, credentials = ?, default_availability = ?, default_country = ?, default_currency = ?, default_locale = ?, "format" = ?, "id" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ?, updated_at = ?, catalog_id = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed'
--
DELETE FROM catalogs_feed WHERE 1=2;

