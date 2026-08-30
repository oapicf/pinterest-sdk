--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeletePartnerAssetAccessResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_partner_asset_access_result'
--
SELECT asset_id, asset_type, is_shared_partner, partner_id, permissions FROM delete_partner_asset_access_result WHERE 1=1;

--
-- INSERT template for table 'delete_partner_asset_access_result'
--
INSERT INTO delete_partner_asset_access_result (asset_id, asset_type, is_shared_partner, partner_id, permissions) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'delete_partner_asset_access_result'
--
UPDATE delete_partner_asset_access_result SET asset_id = ?, asset_type = ?, is_shared_partner = ?, partner_id = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'delete_partner_asset_access_result'
--
DELETE FROM delete_partner_asset_access_result WHERE 1=2;

