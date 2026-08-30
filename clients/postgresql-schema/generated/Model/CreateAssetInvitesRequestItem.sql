--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreateAssetInvitesRequestItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'create_asset_invites_request_item'
--
SELECT asset_id_to_permissions, invite_id, invite_type FROM create_asset_invites_request_item WHERE 1=1;

--
-- INSERT template for table 'create_asset_invites_request_item'
--
INSERT INTO create_asset_invites_request_item (asset_id_to_permissions, invite_id, invite_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'create_asset_invites_request_item'
--
UPDATE create_asset_invites_request_item SET asset_id_to_permissions = ?, invite_id = ?, invite_type = ? WHERE 1=2;

--
-- DELETE template for table 'create_asset_invites_request_item'
--
DELETE FROM create_asset_invites_request_item WHERE 1=2;

