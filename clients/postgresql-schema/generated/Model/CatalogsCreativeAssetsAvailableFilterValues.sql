--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsAvailableFilterValues' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_available_filter_values'
--
SELECT catalog_type, filter_values FROM catalogs_creative_assets_available_filter_values WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_available_filter_values'
--
INSERT INTO catalogs_creative_assets_available_filter_values (catalog_type, filter_values) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_available_filter_values'
--
UPDATE catalogs_creative_assets_available_filter_values SET catalog_type = ?, filter_values = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_available_filter_values'
--
DELETE FROM catalogs_creative_assets_available_filter_values WHERE 1=2;

