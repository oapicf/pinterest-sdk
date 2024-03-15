--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdResponse' definition.
--


--
-- SELECT template for table `AdResponse`
--
SELECT `ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data`, `pin_id`, `ad_account_id`, `campaign_id`, `collection_items_destination_url_template`, `created_time`, `id`, `rejected_reasons`, `rejection_labels`, `review_status`, `type`, `updated_time`, `summary_status` FROM `AdResponse` WHERE 1;

--
-- INSERT template for table `AdResponse`
--
INSERT INTO `AdResponse`(`ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data`, `pin_id`, `ad_account_id`, `campaign_id`, `collection_items_destination_url_template`, `created_time`, `id`, `rejected_reasons`, `rejection_labels`, `review_status`, `type`, `updated_time`, `summary_status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdResponse`
--
UPDATE `AdResponse` SET `ad_group_id` = ?, `android_deep_link` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `click_tracking_url` = ?, `creative_type` = ?, `destination_url` = ?, `ios_deep_link` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `name` = ?, `status` = ?, `tracking_urls` = ?, `view_tracking_url` = ?, `lead_form_id` = ?, `grid_click_type` = ?, `customizable_cta_type` = ?, `quiz_pin_data` = ?, `pin_id` = ?, `ad_account_id` = ?, `campaign_id` = ?, `collection_items_destination_url_template` = ?, `created_time` = ?, `id` = ?, `rejected_reasons` = ?, `rejection_labels` = ?, `review_status` = ?, `type` = ?, `updated_time` = ?, `summary_status` = ? WHERE 1;

--
-- DELETE template for table `AdResponse`
--
DELETE FROM `AdResponse` WHERE 0;

