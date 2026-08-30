--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UpdatePartnerAssetsResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'update_partner_assets_result'
--
SELECT asset_id, asset_type, partner_id, permissions FROM update_partner_assets_result WHERE 1=1;

--
-- INSERT template for table 'update_partner_assets_result'
--
INSERT INTO update_partner_assets_result (asset_id, asset_type, partner_id, permissions) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'update_partner_assets_result'
--
UPDATE update_partner_assets_result SET asset_id = ?, asset_type = ?, partner_id = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'update_partner_assets_result'
--
DELETE FROM update_partner_assets_result WHERE 1=2;

