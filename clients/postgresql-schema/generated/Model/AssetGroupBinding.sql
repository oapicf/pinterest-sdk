--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupBinding' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_binding'
--
SELECT ad_accounts_ids, asset_group_description, asset_group_name, asset_group_types, catalogs_ids, created_by, created_time, "id", "owner", profiles_ids, updated_time FROM asset_group_binding WHERE 1=1;

--
-- INSERT template for table 'asset_group_binding'
--
INSERT INTO asset_group_binding (ad_accounts_ids, asset_group_description, asset_group_name, asset_group_types, catalogs_ids, created_by, created_time, "id", "owner", profiles_ids, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'asset_group_binding'
--
UPDATE asset_group_binding SET ad_accounts_ids = ?, asset_group_description = ?, asset_group_name = ?, asset_group_types = ?, catalogs_ids = ?, created_by = ?, created_time = ?, "id" = ?, "owner" = ?, profiles_ids = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_binding'
--
DELETE FROM asset_group_binding WHERE 1=2;

