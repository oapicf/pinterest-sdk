--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AuthRespondInvitesBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'auth_respond_invites_body'
--
SELECT invites FROM auth_respond_invites_body WHERE 1=1;

--
-- INSERT template for table 'auth_respond_invites_body'
--
INSERT INTO auth_respond_invites_body (invites) VALUES (?);

--
-- UPDATE template for table 'auth_respond_invites_body'
--
UPDATE auth_respond_invites_body SET invites = ? WHERE 1=2;

--
-- DELETE template for table 'auth_respond_invites_body'
--
DELETE FROM auth_respond_invites_body WHERE 1=2;

