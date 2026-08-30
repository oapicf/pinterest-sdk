--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BaseBusinessAssets' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'base_business_assets'
--
SELECT asset_group_info, asset_id, asset_type, permissions FROM base_business_assets WHERE 1=1;

--
-- INSERT template for table 'base_business_assets'
--
INSERT INTO base_business_assets (asset_group_info, asset_id, asset_type, permissions) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'base_business_assets'
--
UPDATE base_business_assets SET asset_group_info = ?, asset_id = ?, asset_type = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'base_business_assets'
--
DELETE FROM base_business_assets WHERE 1=2;

