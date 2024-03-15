--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSource' definition.
--


--
-- SELECT template for table `PinMediaSource`
--
SELECT `source_type`, `content_type`, `data`, `is_standard`, `url`, `cover_image_url`, `cover_image_content_type`, `cover_image_data`, `media_id`, `items`, `index`, `is_affiliate_link` FROM `PinMediaSource` WHERE 1;

--
-- INSERT template for table `PinMediaSource`
--
INSERT INTO `PinMediaSource`(`source_type`, `content_type`, `data`, `is_standard`, `url`, `cover_image_url`, `cover_image_content_type`, `cover_image_data`, `media_id`, `items`, `index`, `is_affiliate_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSource`
--
UPDATE `PinMediaSource` SET `source_type` = ?, `content_type` = ?, `data` = ?, `is_standard` = ?, `url` = ?, `cover_image_url` = ?, `cover_image_content_type` = ?, `cover_image_data` = ?, `media_id` = ?, `items` = ?, `index` = ?, `is_affiliate_link` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSource`
--
DELETE FROM `PinMediaSource` WHERE 0;

