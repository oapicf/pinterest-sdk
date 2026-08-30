--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeed' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_feed'
--
SELECT catalog_id, catalog_type, created_at, credentials, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at FROM catalogs_creative_assets_feed WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_feed'
--
INSERT INTO catalogs_creative_assets_feed (catalog_id, catalog_type, created_at, credentials, default_country, default_currency, default_locale, "format", "id", "location", "name", preferred_processing_schedule, status, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_feed'
--
UPDATE catalogs_creative_assets_feed SET catalog_id = ?, catalog_type = ?, created_at = ?, credentials = ?, default_country = ?, default_currency = ?, default_locale = ?, "format" = ?, "id" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_feed'
--
DELETE FROM catalogs_creative_assets_feed WHERE 1=2;

