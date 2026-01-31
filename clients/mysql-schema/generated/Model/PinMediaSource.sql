--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSource' definition.
--


--
-- SELECT template for table `PinMediaSource`
--
SELECT `content_type`, `data`, `is_standard`, `source_type`, `url`, `cover_image_content_type`, `cover_image_data`, `cover_image_key_frame_time`, `cover_image_url`, `media_id`, `index`, `items`, `is_affiliate_link` FROM `PinMediaSource` WHERE 1;

--
-- INSERT template for table `PinMediaSource`
--
INSERT INTO `PinMediaSource`(`content_type`, `data`, `is_standard`, `source_type`, `url`, `cover_image_content_type`, `cover_image_data`, `cover_image_key_frame_time`, `cover_image_url`, `media_id`, `index`, `items`, `is_affiliate_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSource`
--
UPDATE `PinMediaSource` SET `content_type` = ?, `data` = ?, `is_standard` = ?, `source_type` = ?, `url` = ?, `cover_image_content_type` = ?, `cover_image_data` = ?, `cover_image_key_frame_time` = ?, `cover_image_url` = ?, `media_id` = ?, `index` = ?, `items` = ?, `is_affiliate_link` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSource`
--
DELETE FROM `PinMediaSource` WHERE 0;

