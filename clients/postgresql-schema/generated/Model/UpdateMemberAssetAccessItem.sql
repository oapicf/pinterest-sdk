--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UpdateMemberAssetAccessItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'update_member_asset_access_item'
--
SELECT asset_id, member_id, permissions FROM update_member_asset_access_item WHERE 1=1;

--
-- INSERT template for table 'update_member_asset_access_item'
--
INSERT INTO update_member_asset_access_item (asset_id, member_id, permissions) VALUES (?, ?, ?);

--
-- UPDATE template for table 'update_member_asset_access_item'
--
UPDATE update_member_asset_access_item SET asset_id = ?, member_id = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'update_member_asset_access_item'
--
DELETE FROM update_member_asset_access_item WHERE 1=2;

