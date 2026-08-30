--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CancelInvitesRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'cancel_invites_request'
--
SELECT invite_ids FROM cancel_invites_request WHERE 1=1;

--
-- INSERT template for table 'cancel_invites_request'
--
INSERT INTO cancel_invites_request (invite_ids) VALUES (?);

--
-- UPDATE template for table 'cancel_invites_request'
--
UPDATE cancel_invites_request SET invite_ids = ? WHERE 1=2;

--
-- DELETE template for table 'cancel_invites_request'
--
DELETE FROM cancel_invites_request WHERE 1=2;

