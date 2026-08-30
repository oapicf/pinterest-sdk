--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessAssets' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_assets'
--
SELECT asset_group_info, asset_id, asset_type, permissions, catalog_info FROM business_assets WHERE 1=1;

--
-- INSERT template for table 'business_assets'
--
INSERT INTO business_assets (asset_group_info, asset_id, asset_type, permissions, catalog_info) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'business_assets'
--
UPDATE business_assets SET asset_group_info = ?, asset_id = ?, asset_type = ?, permissions = ?, catalog_info = ? WHERE 1=2;

--
-- DELETE template for table 'business_assets'
--
DELETE FROM business_assets WHERE 1=2;

