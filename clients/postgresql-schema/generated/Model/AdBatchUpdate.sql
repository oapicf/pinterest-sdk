--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdBatchUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_batch_update'
--
SELECT ad_group_id, android_deep_link, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, click_tracking_url, collection_items_destination_url_template, collections_header_type, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, "id", ios_deep_link, is_carting, is_collage_accepted_terms, is_collage_single_destination, is_pin_deleted, is_removable, lead_form_id, "name", pin_id, quiz_pin_data, status, tracking_urls, view_tracking_url FROM ad_batch_update WHERE 1=1;

--
-- INSERT template for table 'ad_batch_update'
--
INSERT INTO ad_batch_update (ad_group_id, android_deep_link, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, click_tracking_url, collection_items_destination_url_template, collections_header_type, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, "id", ios_deep_link, is_carting, is_collage_accepted_terms, is_collage_single_destination, is_pin_deleted, is_removable, lead_form_id, "name", pin_id, quiz_pin_data, status, tracking_urls, view_tracking_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_batch_update'
--
UPDATE ad_batch_update SET ad_group_id = ?, android_deep_link = ?, carousel_android_deep_links = ?, carousel_destination_urls = ?, carousel_ios_deep_links = ?, click_tracking_url = ?, collection_items_destination_url_template = ?, collections_header_type = ?, creative_type = ?, customizable_cta_type = ?, destination_url = ?, disclosure_type = ?, disclosure_url = ?, grid_click_type = ?, "id" = ?, ios_deep_link = ?, is_carting = ?, is_collage_accepted_terms = ?, is_collage_single_destination = ?, is_pin_deleted = ?, is_removable = ?, lead_form_id = ?, "name" = ?, pin_id = ?, quiz_pin_data = ?, status = ?, tracking_urls = ?, view_tracking_url = ? WHERE 1=2;

--
-- DELETE template for table 'ad_batch_update'
--
DELETE FROM ad_batch_update WHERE 1=2;

