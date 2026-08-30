--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeletePartnerAssetAccessItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_partner_asset_access_item'
--
SELECT asset_id, partner_id, partner_type FROM delete_partner_asset_access_item WHERE 1=1;

--
-- INSERT template for table 'delete_partner_asset_access_item'
--
INSERT INTO delete_partner_asset_access_item (asset_id, partner_id, partner_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'delete_partner_asset_access_item'
--
UPDATE delete_partner_asset_access_item SET asset_id = ?, partner_id = ?, partner_type = ? WHERE 1=2;

--
-- DELETE template for table 'delete_partner_asset_access_item'
--
DELETE FROM delete_partner_asset_access_item WHERE 1=2;

