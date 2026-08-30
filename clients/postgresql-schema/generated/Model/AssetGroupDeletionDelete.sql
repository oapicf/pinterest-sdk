--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupDeletionDelete' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_deletion_delete'
--
SELECT asset_groups_to_delete FROM asset_group_deletion_delete WHERE 1=1;

--
-- INSERT template for table 'asset_group_deletion_delete'
--
INSERT INTO asset_group_deletion_delete (asset_groups_to_delete) VALUES (?);

--
-- UPDATE template for table 'asset_group_deletion_delete'
--
UPDATE asset_group_deletion_delete SET asset_groups_to_delete = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_deletion_delete'
--
DELETE FROM asset_group_deletion_delete WHERE 1=2;

