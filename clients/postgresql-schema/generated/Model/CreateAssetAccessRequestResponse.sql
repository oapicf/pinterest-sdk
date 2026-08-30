--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreateAssetAccessRequestResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'create_asset_access_request_response'
--
SELECT exceptions, invites FROM create_asset_access_request_response WHERE 1=1;

--
-- INSERT template for table 'create_asset_access_request_response'
--
INSERT INTO create_asset_access_request_response (exceptions, invites) VALUES (?, ?);

--
-- UPDATE template for table 'create_asset_access_request_response'
--
UPDATE create_asset_access_request_response SET exceptions = ?, invites = ? WHERE 1=2;

--
-- DELETE template for table 'create_asset_access_request_response'
--
DELETE FROM create_asset_access_request_response WHERE 1=2;

