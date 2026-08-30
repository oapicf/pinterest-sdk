--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetGroupDeleteError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_group_delete_error'
--
SELECT asset_group_id, code, message FROM asset_group_delete_error WHERE 1=1;

--
-- INSERT template for table 'asset_group_delete_error'
--
INSERT INTO asset_group_delete_error (asset_group_id, code, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'asset_group_delete_error'
--
UPDATE asset_group_delete_error SET asset_group_id = ?, code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'asset_group_delete_error'
--
DELETE FROM asset_group_delete_error WHERE 1=2;

