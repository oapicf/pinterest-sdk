--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Ad' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad'
--
SELECT ad_account_id, ad_group_id, android_deep_link, campaign_id, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, carting_platform_type, carting_products, click_tracking_url, collection_items_destination_url_template, collections_header_type, created_time, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, "id", ios_deep_link, is_carting, is_collage_accepted_terms, is_collage_single_destination, is_pin_deleted, is_removable, lead_form_id, "name", pin_id, quiz_pin_data, rejected_reasons, rejection_labels, review_status, status, summary_status, tracking_urls, "type", updated_time, view_tracking_url FROM ad WHERE 1=1;

--
-- INSERT template for table 'ad'
--
INSERT INTO ad (ad_account_id, ad_group_id, android_deep_link, campaign_id, carousel_android_deep_links, carousel_destination_urls, carousel_ios_deep_links, carting_platform_type, carting_products, click_tracking_url, collection_items_destination_url_template, collections_header_type, created_time, creative_type, customizable_cta_type, destination_url, disclosure_type, disclosure_url, grid_click_type, "id", ios_deep_link, is_carting, is_collage_accepted_terms, is_collage_single_destination, is_pin_deleted, is_removable, lead_form_id, "name", pin_id, quiz_pin_data, rejected_reasons, rejection_labels, review_status, status, summary_status, tracking_urls, "type", updated_time, view_tracking_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad'
--
UPDATE ad SET ad_account_id = ?, ad_group_id = ?, android_deep_link = ?, campaign_id = ?, carousel_android_deep_links = ?, carousel_destination_urls = ?, carousel_ios_deep_links = ?, carting_platform_type = ?, carting_products = ?, click_tracking_url = ?, collection_items_destination_url_template = ?, collections_header_type = ?, created_time = ?, creative_type = ?, customizable_cta_type = ?, destination_url = ?, disclosure_type = ?, disclosure_url = ?, grid_click_type = ?, "id" = ?, ios_deep_link = ?, is_carting = ?, is_collage_accepted_terms = ?, is_collage_single_destination = ?, is_pin_deleted = ?, is_removable = ?, lead_form_id = ?, "name" = ?, pin_id = ?, quiz_pin_data = ?, rejected_reasons = ?, rejection_labels = ?, review_status = ?, status = ?, summary_status = ?, tracking_urls = ?, "type" = ?, updated_time = ?, view_tracking_url = ? WHERE 1=2;

--
-- DELETE template for table 'ad'
--
DELETE FROM ad WHERE 1=2;

