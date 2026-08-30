--
-- "Pinterest REST API"
-- Prepared SQL queries for 'business_partner_asset_access_get_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_partner_asset_access_get_200_response'
--
SELECT bookmark, items FROM business_partner_asset_access_get_200_response WHERE 1=1;

--
-- INSERT template for table 'business_partner_asset_access_get_200_response'
--
INSERT INTO business_partner_asset_access_get_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'business_partner_asset_access_get_200_response'
--
UPDATE business_partner_asset_access_get_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'business_partner_asset_access_get_200_response'
--
DELETE FROM business_partner_asset_access_get_200_response WHERE 1=2;

