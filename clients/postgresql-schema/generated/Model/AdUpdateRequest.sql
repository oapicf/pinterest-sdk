--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_update_request'
--
SELECT "id", pin_id, ad_group_id, android_deep_link, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, click_tracking_url, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, ios_deep_link, is_carting, is_pin_deleted, is_removable, lead_form_id, "name", quiz_pin_data, status, tracking_urls, view_tracking_url FROM ad_update_request WHERE 1=1;

--
-- INSERT template for table 'ad_update_request'
--
INSERT INTO ad_update_request ("id", pin_id, ad_group_id, android_deep_link, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, click_tracking_url, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, ios_deep_link, is_carting, is_pin_deleted, is_removable, lead_form_id, "name", quiz_pin_data, status, tracking_urls, view_tracking_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_update_request'
--
UPDATE ad_update_request SET "id" = ?, pin_id = ?, ad_group_id = ?, android_deep_link = ?, carousel_android_deep_links = ?, carousel_destination_urls = ?, carousel_ios_deep_links = ?, click_tracking_url = ?, creative_type = ?, customizable_cta_type = ?, destination_url = ?, disclosure_type = ?, disclosure_url = ?, grid_click_type = ?, ios_deep_link = ?, is_carting = ?, is_pin_deleted = ?, is_removable = ?, lead_form_id = ?, "name" = ?, quiz_pin_data = ?, status = ?, tracking_urls = ?, view_tracking_url = ? WHERE 1=2;

--
-- DELETE template for table 'ad_update_request'
--
DELETE FROM ad_update_request WHERE 1=2;

