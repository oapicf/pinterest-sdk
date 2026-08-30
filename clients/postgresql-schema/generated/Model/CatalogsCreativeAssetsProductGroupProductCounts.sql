--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupProductCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_product_group_product_counts'
--
SELECT app_links, catalog_type, images, total, videos FROM catalogs_creative_assets_product_group_product_counts WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_product_group_product_counts'
--
INSERT INTO catalogs_creative_assets_product_group_product_counts (app_links, catalog_type, images, total, videos) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_product_group_product_counts'
--
UPDATE catalogs_creative_assets_product_group_product_counts SET app_links = ?, catalog_type = ?, images = ?, total = ?, videos = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_product_group_product_counts'
--
DELETE FROM catalogs_creative_assets_product_group_product_counts WHERE 1=2;

