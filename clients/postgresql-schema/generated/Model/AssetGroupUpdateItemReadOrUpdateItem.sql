--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupUpdateItemReadOrUpdateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_update_item_read_or_update_item'
--
SELECT asset_group_id, asset_group_types, assets_to_add, assets_to_remove, description, "name" FROM asset_group_update_item_read_or_update_item WHERE 1=1;

--
-- INSERT template for table 'asset_group_update_item_read_or_update_item'
--
INSERT INTO asset_group_update_item_read_or_update_item (asset_group_id, asset_group_types, assets_to_add, assets_to_remove, description, "name") VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'asset_group_update_item_read_or_update_item'
--
UPDATE asset_group_update_item_read_or_update_item SET asset_group_id = ?, asset_group_types = ?, assets_to_add = ?, assets_to_remove = ?, description = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_update_item_read_or_update_item'
--
DELETE FROM asset_group_update_item_read_or_update_item WHERE 1=2;

