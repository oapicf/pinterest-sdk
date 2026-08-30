--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AssetAccessRequestError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'asset_access_request_error'
--
SELECT code, messages FROM asset_access_request_error WHERE 1=1;

--
-- INSERT template for table 'asset_access_request_error'
--
INSERT INTO asset_access_request_error (code, messages) VALUES (?, ?);

--
-- UPDATE template for table 'asset_access_request_error'
--
UPDATE asset_access_request_error SET code = ?, messages = ? WHERE 1=2;

--
-- DELETE template for table 'asset_access_request_error'
--
DELETE FROM asset_access_request_error WHERE 1=2;

