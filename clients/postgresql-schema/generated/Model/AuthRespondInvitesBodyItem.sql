--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AuthRespondInvitesBodyItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'auth_respond_invites_body_item'
--
SELECT "action", invite_id FROM auth_respond_invites_body_item WHERE 1=1;

--
-- INSERT template for table 'auth_respond_invites_body_item'
--
INSERT INTO auth_respond_invites_body_item ("action", invite_id) VALUES (?, ?);

--
-- UPDATE template for table 'auth_respond_invites_body_item'
--
UPDATE auth_respond_invites_body_item SET "action" = ?, invite_id = ? WHERE 1=2;

--
-- DELETE template for table 'auth_respond_invites_body_item'
--
DELETE FROM auth_respond_invites_body_item WHERE 1=2;

