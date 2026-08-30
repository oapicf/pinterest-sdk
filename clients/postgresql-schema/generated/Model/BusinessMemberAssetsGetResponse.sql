--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessMemberAssetsGetResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_member_assets_get_response'
--
SELECT bookmark, items, total_data_count, total_data_count_by_status FROM business_member_assets_get_response WHERE 1=1;

--
-- INSERT template for table 'business_member_assets_get_response'
--
INSERT INTO business_member_assets_get_response (bookmark, items, total_data_count, total_data_count_by_status) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'business_member_assets_get_response'
--
UPDATE business_member_assets_get_response SET bookmark = ?, items = ?, total_data_count = ?, total_data_count_by_status = ? WHERE 1=2;

--
-- DELETE template for table 'business_member_assets_get_response'
--
DELETE FROM business_member_assets_get_response WHERE 1=2;

