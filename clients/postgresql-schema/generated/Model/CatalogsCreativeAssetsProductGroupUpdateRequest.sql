--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_product_group_update_request'
--
SELECT catalog_type, description, filters, "name" FROM catalogs_creative_assets_product_group_update_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_product_group_update_request'
--
INSERT INTO catalogs_creative_assets_product_group_update_request (catalog_type, description, filters, "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_product_group_update_request'
--
UPDATE catalogs_creative_assets_product_group_update_request SET catalog_type = ?, description = ?, filters = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_product_group_update_request'
--
DELETE FROM catalogs_creative_assets_product_group_update_request WHERE 1=2;

