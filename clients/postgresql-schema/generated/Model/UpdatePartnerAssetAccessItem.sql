--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UpdatePartnerAssetAccessItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'update_partner_asset_access_item'
--
SELECT asset_id, partner_id, permissions FROM update_partner_asset_access_item WHERE 1=1;

--
-- INSERT template for table 'update_partner_asset_access_item'
--
INSERT INTO update_partner_asset_access_item (asset_id, partner_id, permissions) VALUES (?, ?, ?);

--
-- UPDATE template for table 'update_partner_asset_access_item'
--
UPDATE update_partner_asset_access_item SET asset_id = ?, partner_id = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'update_partner_asset_access_item'
--
DELETE FROM update_partner_asset_access_item WHERE 1=2;

