--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_list_products_by_catalog_based_filter_'
--
SELECT catalog_id, catalog_type, filters FROM catalogs_creative_assets_list_products_by_catalog_based_filter_ WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_list_products_by_catalog_based_filter_'
--
INSERT INTO catalogs_creative_assets_list_products_by_catalog_based_filter_ (catalog_id, catalog_type, filters) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_list_products_by_catalog_based_filter_'
--
UPDATE catalogs_creative_assets_list_products_by_catalog_based_filter_ SET catalog_id = ?, catalog_type = ?, filters = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_list_products_by_catalog_based_filter_'
--
DELETE FROM catalogs_creative_assets_list_products_by_catalog_based_filter_ WHERE 1=2;

