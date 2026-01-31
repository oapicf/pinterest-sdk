--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceVideoID' definition.
--


--
-- SELECT template for table `PinMediaSourceVideoID`
--
SELECT `cover_image_content_type`, `cover_image_data`, `cover_image_key_frame_time`, `cover_image_url`, `is_standard`, `media_id`, `source_type` FROM `PinMediaSourceVideoID` WHERE 1;

--
-- INSERT template for table `PinMediaSourceVideoID`
--
INSERT INTO `PinMediaSourceVideoID`(`cover_image_content_type`, `cover_image_data`, `cover_image_key_frame_time`, `cover_image_url`, `is_standard`, `media_id`, `source_type`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceVideoID`
--
UPDATE `PinMediaSourceVideoID` SET `cover_image_content_type` = ?, `cover_image_data` = ?, `cover_image_key_frame_time` = ?, `cover_image_url` = ?, `is_standard` = ?, `media_id` = ?, `source_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceVideoID`
--
DELETE FROM `PinMediaSourceVideoID` WHERE 0;

