--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdResponse_allOf' definition.
--


--
-- SELECT template for table `AdResponse_allOf`
--
SELECT `ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `pin_id`, `status`, `tracking_urls`, `view_tracking_url` FROM `AdResponse_allOf` WHERE 1;

--
-- INSERT template for table `AdResponse_allOf`
--
INSERT INTO `AdResponse_allOf`(`ad_group_id`, `android_deep_link`, `carousel_android_deep_links`, `carousel_destination_urls`, `carousel_ios_deep_links`, `click_tracking_url`, `creative_type`, `destination_url`, `ios_deep_link`, `is_pin_deleted`, `is_removable`, `name`, `pin_id`, `status`, `tracking_urls`, `view_tracking_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdResponse_allOf`
--
UPDATE `AdResponse_allOf` SET `ad_group_id` = ?, `android_deep_link` = ?, `carousel_android_deep_links` = ?, `carousel_destination_urls` = ?, `carousel_ios_deep_links` = ?, `click_tracking_url` = ?, `creative_type` = ?, `destination_url` = ?, `ios_deep_link` = ?, `is_pin_deleted` = ?, `is_removable` = ?, `name` = ?, `pin_id` = ?, `status` = ?, `tracking_urls` = ?, `view_tracking_url` = ? WHERE 1;

--
-- DELETE template for table `AdResponse_allOf`
--
DELETE FROM `AdResponse_allOf` WHERE 0;

