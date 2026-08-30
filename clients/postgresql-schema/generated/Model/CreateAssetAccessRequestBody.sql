--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreateAssetAccessRequestBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'create_asset_access_request_body'
--
SELECT asset_requests FROM create_asset_access_request_body WHERE 1=1;

--
-- INSERT template for table 'create_asset_access_request_body'
--
INSERT INTO create_asset_access_request_body (asset_requests) VALUES (?);

--
-- UPDATE template for table 'create_asset_access_request_body'
--
UPDATE create_asset_access_request_body SET asset_requests = ? WHERE 1=2;

--
-- DELETE template for table 'create_asset_access_request_body'
--
DELETE FROM create_asset_access_request_body WHERE 1=2;

