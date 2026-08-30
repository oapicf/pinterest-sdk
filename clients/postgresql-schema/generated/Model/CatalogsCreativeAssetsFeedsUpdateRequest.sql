--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeedsUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_feeds_update_request'
--
SELECT catalog_type, credentials, default_currency, "format", "location", "name", preferred_processing_schedule, status FROM catalogs_creative_assets_feeds_update_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_feeds_update_request'
--
INSERT INTO catalogs_creative_assets_feeds_update_request (catalog_type, credentials, default_currency, "format", "location", "name", preferred_processing_schedule, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_feeds_update_request'
--
UPDATE catalogs_creative_assets_feeds_update_request SET catalog_type = ?, credentials = ?, default_currency = ?, "format" = ?, "location" = ?, "name" = ?, preferred_processing_schedule = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_feeds_update_request'
--
DELETE FROM catalogs_creative_assets_feeds_update_request WHERE 1=2;

