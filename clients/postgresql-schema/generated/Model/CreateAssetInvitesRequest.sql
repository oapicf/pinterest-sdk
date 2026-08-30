--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreateAssetInvitesRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'create_asset_invites_request'
--
SELECT invites FROM create_asset_invites_request WHERE 1=1;

--
-- INSERT template for table 'create_asset_invites_request'
--
INSERT INTO create_asset_invites_request (invites) VALUES (?);

--
-- UPDATE template for table 'create_asset_invites_request'
--
UPDATE create_asset_invites_request SET invites = ? WHERE 1=2;

--
-- DELETE template for table 'create_asset_invites_request'
--
DELETE FROM create_asset_invites_request WHERE 1=2;

