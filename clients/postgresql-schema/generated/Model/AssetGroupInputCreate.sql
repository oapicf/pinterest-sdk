--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupInputCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_input_create'
--
SELECT asset_group, asset_group_description, asset_group_name, asset_group_types FROM asset_group_input_create WHERE 1=1;

--
-- INSERT template for table 'asset_group_input_create'
--
INSERT INTO asset_group_input_create (asset_group, asset_group_description, asset_group_name, asset_group_types) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'asset_group_input_create'
--
UPDATE asset_group_input_create SET asset_group = ?, asset_group_description = ?, asset_group_name = ?, asset_group_types = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_input_create'
--
DELETE FROM asset_group_input_create WHERE 1=2;

