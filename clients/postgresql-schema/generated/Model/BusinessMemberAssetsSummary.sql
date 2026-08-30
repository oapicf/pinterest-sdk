--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessMemberAssetsSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_member_assets_summary'
--
SELECT ad_accounts, profiles FROM business_member_assets_summary WHERE 1=1;

--
-- INSERT template for table 'business_member_assets_summary'
--
INSERT INTO business_member_assets_summary (ad_accounts, profiles) VALUES (?, ?);

--
-- UPDATE template for table 'business_member_assets_summary'
--
UPDATE business_member_assets_summary SET ad_accounts = ?, profiles = ? WHERE 1=2;

--
-- DELETE template for table 'business_member_assets_summary'
--
DELETE FROM business_member_assets_summary WHERE 1=2;

