--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetIdPermissions' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_id_permissions'
--
SELECT asset_group_info, asset_id, asset_type, permissions FROM asset_id_permissions WHERE 1=1;

--
-- INSERT template for table 'asset_id_permissions'
--
INSERT INTO asset_id_permissions (asset_group_info, asset_id, asset_type, permissions) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'asset_id_permissions'
--
UPDATE asset_id_permissions SET asset_group_info = ?, asset_id = ?, asset_type = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'asset_id_permissions'
--
DELETE FROM asset_id_permissions WHERE 1=2;

