--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupModificationReadOrUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_modification_read_or_update'
--
SELECT asset_groups_to_update, exceptions, updated_asset_groups FROM asset_group_modification_read_or_update WHERE 1=1;

--
-- INSERT template for table 'asset_group_modification_read_or_update'
--
INSERT INTO asset_group_modification_read_or_update (asset_groups_to_update, exceptions, updated_asset_groups) VALUES (?, ?, ?);

--
-- UPDATE template for table 'asset_group_modification_read_or_update'
--
UPDATE asset_group_modification_read_or_update SET asset_groups_to_update = ?, exceptions = ?, updated_asset_groups = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_modification_read_or_update'
--
DELETE FROM asset_group_modification_read_or_update WHERE 1=2;

