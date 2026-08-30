--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsPostFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_items_post_filter'
--
SELECT catalog_id, catalog_type, creative_assets_ids FROM catalogs_creative_assets_items_post_filter WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_items_post_filter'
--
INSERT INTO catalogs_creative_assets_items_post_filter (catalog_id, catalog_type, creative_assets_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_items_post_filter'
--
UPDATE catalogs_creative_assets_items_post_filter SET catalog_id = ?, catalog_type = ?, creative_assets_ids = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_items_post_filter'
--
DELETE FROM catalogs_creative_assets_items_post_filter WHERE 1=2;

