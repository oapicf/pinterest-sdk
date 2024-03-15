--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithVideo' definition.
--


--
-- SELECT template for table `PinMediaWithVideo`
--
SELECT `media_type`, `images`, `cover_image_url`, `video_url`, `duration`, `height`, `width` FROM `PinMediaWithVideo` WHERE 1;

--
-- INSERT template for table `PinMediaWithVideo`
--
INSERT INTO `PinMediaWithVideo`(`media_type`, `images`, `cover_image_url`, `video_url`, `duration`, `height`, `width`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaWithVideo`
--
UPDATE `PinMediaWithVideo` SET `media_type` = ?, `images` = ?, `cover_image_url` = ?, `video_url` = ?, `duration` = ?, `height` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithVideo`
--
DELETE FROM `PinMediaWithVideo` WHERE 0;

