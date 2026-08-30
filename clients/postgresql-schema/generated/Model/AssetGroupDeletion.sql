--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupDeletion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_deletion'
--
SELECT deleted_asset_groups, exceptions FROM asset_group_deletion WHERE 1=1;

--
-- INSERT template for table 'asset_group_deletion'
--
INSERT INTO asset_group_deletion (deleted_asset_groups, exceptions) VALUES (?, ?);

--
-- UPDATE template for table 'asset_group_deletion'
--
UPDATE asset_group_deletion SET deleted_asset_groups = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_deletion'
--
DELETE FROM asset_group_deletion WHERE 1=2;

