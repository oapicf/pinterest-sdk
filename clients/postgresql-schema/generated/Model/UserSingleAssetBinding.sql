--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UserSingleAssetBinding' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'user_single_asset_binding'
--
SELECT permissions, "user" FROM user_single_asset_binding WHERE 1=1;

--
-- INSERT template for table 'user_single_asset_binding'
--
INSERT INTO user_single_asset_binding (permissions, "user") VALUES (?, ?);

--
-- UPDATE template for table 'user_single_asset_binding'
--
UPDATE user_single_asset_binding SET permissions = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'user_single_asset_binding'
--
DELETE FROM user_single_asset_binding WHERE 1=2;

