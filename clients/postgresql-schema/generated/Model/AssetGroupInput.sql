--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupInput' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_input'
--
SELECT asset_group FROM asset_group_input WHERE 1=1;

--
-- INSERT template for table 'asset_group_input'
--
INSERT INTO asset_group_input (asset_group) VALUES (?);

--
-- UPDATE template for table 'asset_group_input'
--
UPDATE asset_group_input SET asset_group = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_input'
--
DELETE FROM asset_group_input WHERE 1=2;

