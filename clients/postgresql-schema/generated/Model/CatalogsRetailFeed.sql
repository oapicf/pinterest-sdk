--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailFeed' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_feed'
--
SELECT catalog_type, created_at, credentials, default_availability, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at FROM catalogs_retail_feed WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_feed'
--
INSERT INTO catalogs_retail_feed (catalog_type, created_at, credentials, default_availability, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_feed'
--
UPDATE catalogs_retail_feed SET catalog_type = ?, created_at = ?, credentials = ?, default_availability = ?, default_country = ?, default_currency = ?, default_locale = ?, "format" = ?, "id" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_feed'
--
DELETE FROM catalogs_retail_feed WHERE 1=2;

