--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdCommon' definition.
--


--
-- SELECT template for table `AdCommon`
--
SELECT `ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data` FROM `AdCommon` WHERE 1;

--
-- INSERT template for table `AdCommon`
--
INSERT INTO `AdCommon`(`ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `status`, `tracking_urls`, `view_tracking_url`, `lead_form_id`, `grid_click_type`, `customizable_cta_type`, `quiz_pin_data`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdCommon`
--
UPDATE `AdCommon` SET `ad_group_id` = ?, `android_deep_link` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `click_tracking_url` = ?, `creative_type` = ?, `destination_url` = ?, `ios_deep_link` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `name` = ?, `status` = ?, `tracking_urls` = ?, `view_tracking_url` = ?, `lead_form_id` = ?, `grid_click_type` = ?, `customizable_cta_type` = ?, `quiz_pin_data` = ? WHERE 1;

--
-- DELETE template for table `AdCommon`
--
DELETE FROM `AdCommon` WHERE 0;

