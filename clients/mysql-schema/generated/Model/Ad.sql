--
-- Pinterest REST API.
-- Prepared SQL queries for 'Ad' definition.
--


--
-- SELECT template for table `Ad`
--
SELECT `ad_account_id`, `ad_group_id`, `android_deep_link`, `campaign_id`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `carting_platform_type`, `carting_products`, `click_tracking_url`, `collection_items_destination_url_template`, `collections_header_type`, `created_time`, `creative_type`, `customizable_cta_type`, `destination_url`, `disclosure_type`, `disclosure_url`, `grid_click_type`, `id`, `ios_deep_link`, `is_carting`, `is_collage_accepted_terms`, `is_collage_single_destination`, `is_pin_deleted`, `is_removable`, `lead_form_id`, `name`, `pin_id`, `quiz_pin_data`, `rejected_reasons`, `rejection_labels`, `review_status`, `status`, `summary_status`, `tracking_urls`, `type`, `updated_time`, `view_tracking_url` FROM `Ad` WHERE 1;

--
-- INSERT template for table `Ad`
--
INSERT INTO `Ad`(`ad_account_id`, `ad_group_id`, `android_deep_link`, `campaign_id`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `carting_platform_type`, `carting_products`, `click_tracking_url`, `collection_items_destination_url_template`, `collections_header_type`, `created_time`, `creative_type`, `customizable_cta_type`, `destination_url`, `disclosure_type`, `disclosure_url`, `grid_click_type`, `id`, `ios_deep_link`, `is_carting`, `is_collage_accepted_terms`, `is_collage_single_destination`, `is_pin_deleted`, `is_removable`, `lead_form_id`, `name`, `pin_id`, `quiz_pin_data`, `rejected_reasons`, `rejection_labels`, `review_status`, `status`, `summary_status`, `tracking_urls`, `type`, `updated_time`, `view_tracking_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Ad`
--
UPDATE `Ad` SET `ad_account_id` = ?, `ad_group_id` = ?, `android_deep_link` = ?, `campaign_id` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `carting_platform_type` = ?, `carting_products` = ?, `click_tracking_url` = ?, `collection_items_destination_url_template` = ?, `collections_header_type` = ?, `created_time` = ?, `creative_type` = ?, `customizable_cta_type` = ?, `destination_url` = ?, `disclosure_type` = ?, `disclosure_url` = ?, `grid_click_type` = ?, `id` = ?, `ios_deep_link` = ?, `is_carting` = ?, `is_collage_accepted_terms` = ?, `is_collage_single_destination` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `lead_form_id` = ?, `name` = ?, `pin_id` = ?, `quiz_pin_data` = ?, `rejected_reasons` = ?, `rejection_labels` = ?, `review_status` = ?, `status` = ?, `summary_status` = ?, `tracking_urls` = ?, `type` = ?, `updated_time` = ?, `view_tracking_url` = ? WHERE 1;

--
-- DELETE template for table `Ad`
--
DELETE FROM `Ad` WHERE 0;

