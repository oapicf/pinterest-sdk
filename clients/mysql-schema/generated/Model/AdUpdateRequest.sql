--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdUpdateRequest' definition.
--


--
-- SELECT template for table `AdUpdateRequest`
--
SELECT `ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data`, `id`, `pin_id` FROM `AdUpdateRequest` WHERE 1;

--
-- INSERT template for table `AdUpdateRequest`
--
INSERT INTO `AdUpdateRequest`(`ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data`, `id`, `pin_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdUpdateRequest`
--
UPDATE `AdUpdateRequest` SET `ad_group_id` = ?, `android_deep_link` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `click_tracking_url` = ?, `creative_type` = ?, `destination_url` = ?, `ios_deep_link` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `name` = ?, `status` = ?, `tracking_urls` = ?, `view_tracking_url` = ?, `lead_form_id` = ?, `grid_click_type` = ?, `customizable_cta_type` = ?, `quiz_pin_data` = ?, `id` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `AdUpdateRequest`
--
DELETE FROM `AdUpdateRequest` WHERE 0;

