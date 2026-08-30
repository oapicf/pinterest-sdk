--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupModification' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_modification'
--
SELECT exceptions, updated_asset_groups FROM asset_group_modification WHERE 1=1;

--
-- INSERT template for table 'asset_group_modification'
--
INSERT INTO asset_group_modification (exceptions, updated_asset_groups) VALUES (?, ?);

--
-- UPDATE template for table 'asset_group_modification'
--
UPDATE asset_group_modification SET exceptions = ?, updated_asset_groups = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_modification'
--
DELETE FROM asset_group_modification WHERE 1=2;

