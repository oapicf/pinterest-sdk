--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UpdateMemberAssetAccessBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'update_member_asset_access_body'
--
SELECT accesses FROM update_member_asset_access_body WHERE 1=1;

--
-- INSERT template for table 'update_member_asset_access_body'
--
INSERT INTO update_member_asset_access_body (accesses) VALUES (?);

--
-- UPDATE template for table 'update_member_asset_access_body'
--
UPDATE update_member_asset_access_body SET accesses = ? WHERE 1=2;

--
-- DELETE template for table 'update_member_asset_access_body'
--
DELETE FROM update_member_asset_access_body WHERE 1=2;

