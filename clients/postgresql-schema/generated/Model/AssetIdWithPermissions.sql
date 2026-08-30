--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetIdWithPermissions' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_id_with_permissions'
--
SELECT "id", permissions FROM asset_id_with_permissions WHERE 1=1;

--
-- INSERT template for table 'asset_id_with_permissions'
--
INSERT INTO asset_id_with_permissions ("id", permissions) VALUES (?, ?);

--
-- UPDATE template for table 'asset_id_with_permissions'
--
UPDATE asset_id_with_permissions SET "id" = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'asset_id_with_permissions'
--
DELETE FROM asset_id_with_permissions WHERE 1=2;

