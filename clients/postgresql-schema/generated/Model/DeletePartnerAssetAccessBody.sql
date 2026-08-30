--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeletePartnerAssetAccessBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_partner_asset_access_body'
--
SELECT accesses FROM delete_partner_asset_access_body WHERE 1=1;

--
-- INSERT template for table 'delete_partner_asset_access_body'
--
INSERT INTO delete_partner_asset_access_body (accesses) VALUES (?);

--
-- UPDATE template for table 'delete_partner_asset_access_body'
--
UPDATE delete_partner_asset_access_body SET accesses = ? WHERE 1=2;

--
-- DELETE template for table 'delete_partner_asset_access_body'
--
DELETE FROM delete_partner_asset_access_body WHERE 1=2;

