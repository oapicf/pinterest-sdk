--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessMembersAssetAccessDeleteBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_members_asset_access_delete_body'
--
SELECT accesses FROM business_members_asset_access_delete_body WHERE 1=1;

--
-- INSERT template for table 'business_members_asset_access_delete_body'
--
INSERT INTO business_members_asset_access_delete_body (accesses) VALUES (?);

--
-- UPDATE template for table 'business_members_asset_access_delete_body'
--
UPDATE business_members_asset_access_delete_body SET accesses = ? WHERE 1=2;

--
-- DELETE template for table 'business_members_asset_access_delete_body'
--
DELETE FROM business_members_asset_access_delete_body WHERE 1=2;

