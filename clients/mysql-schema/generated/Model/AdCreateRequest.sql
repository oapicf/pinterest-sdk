--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdCreateRequest' definition.
--


--
-- SELECT template for table `AdCreateRequest`
--
SELECT `ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `customizable_cta_type`, `destination_url`, `disclosure_type`, `disclosure_url`, `grid_click_type`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `lead_form_id`, `name`, `quiz_pin_data`, `status`, `tracking_urls`, `view_tracking_url`, `pin_id` FROM `AdCreateRequest` WHERE 1;

--
-- INSERT template for table `AdCreateRequest`
--
INSERT INTO `AdCreateRequest`(`ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `customizable_cta_type`, `destination_url`, `disclosure_type`, `disclosure_url`, `grid_click_type`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `lead_form_id`, `name`, `quiz_pin_data`, `status`, `tracking_urls`, `view_tracking_url`, `pin_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdCreateRequest`
--
UPDATE `AdCreateRequest` SET `ad_group_id` = ?, `android_deep_link` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `click_tracking_url` = ?, `creative_type` = ?, `customizable_cta_type` = ?, `destination_url` = ?, `disclosure_type` = ?, `disclosure_url` = ?, `grid_click_type` = ?, `ios_deep_link` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `lead_form_id` = ?, `name` = ?, `quiz_pin_data` = ?, `status` = ?, `tracking_urls` = ?, `view_tracking_url` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `AdCreateRequest`
--
DELETE FROM `AdCreateRequest` WHERE 0;

