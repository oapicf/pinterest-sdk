--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AuthRespondInviteAction' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'auth_respond_invite_action'
--
SELECT accept_invite, asset_id_to_permissions FROM auth_respond_invite_action WHERE 1=1;

--
-- INSERT template for table 'auth_respond_invite_action'
--
INSERT INTO auth_respond_invite_action (accept_invite, asset_id_to_permissions) VALUES (?, ?);

--
-- UPDATE template for table 'auth_respond_invite_action'
--
UPDATE auth_respond_invite_action SET accept_invite = ?, asset_id_to_permissions = ? WHERE 1=2;

--
-- DELETE template for table 'auth_respond_invite_action'
--
DELETE FROM auth_respond_invite_action WHERE 1=2;

