--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithVideo' definition.
--


--
-- SELECT template for table `PinMediaWithVideo`
--
SELECT `cover_image_url`, `duration`, `height`, `images`, `media_type`, `video_url`, `video_url_hls`, `width` FROM `PinMediaWithVideo` WHERE 1;

--
-- INSERT template for table `PinMediaWithVideo`
--
INSERT INTO `PinMediaWithVideo`(`cover_image_url`, `duration`, `height`, `images`, `media_type`, `video_url`, `video_url_hls`, `width`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaWithVideo`
--
UPDATE `PinMediaWithVideo` SET `cover_image_url` = ?, `duration` = ?, `height` = ?, `images` = ?, `media_type` = ?, `video_url` = ?, `video_url_hls` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithVideo`
--
DELETE FROM `PinMediaWithVideo` WHERE 0;

