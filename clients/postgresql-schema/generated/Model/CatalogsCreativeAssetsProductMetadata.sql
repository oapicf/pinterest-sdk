--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_product_metadata'
--
SELECT creative_assets_id, visibility FROM catalogs_creative_assets_product_metadata WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_product_metadata'
--
INSERT INTO catalogs_creative_assets_product_metadata (creative_assets_id, visibility) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_product_metadata'
--
UPDATE catalogs_creative_assets_product_metadata SET creative_assets_id = ?, visibility = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_product_metadata'
--
DELETE FROM catalogs_creative_assets_product_metadata WHERE 1=2;

