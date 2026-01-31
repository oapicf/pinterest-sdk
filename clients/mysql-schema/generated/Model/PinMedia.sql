--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMedia' definition.
--


--
-- SELECT template for table `PinMedia`
--
SELECT `images`, `media_type`, `cover_image_url`, `duration`, `height`, `video_url`, `width`, `items` FROM `PinMedia` WHERE 1;

--
-- INSERT template for table `PinMedia`
--
INSERT INTO `PinMedia`(`images`, `media_type`, `cover_image_url`, `duration`, `height`, `video_url`, `width`, `items`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMedia`
--
UPDATE `PinMedia` SET `images` = ?, `media_type` = ?, `cover_image_url` = ?, `duration` = ?, `height` = ?, `video_url` = ?, `width` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `PinMedia`
--
DELETE FROM `PinMedia` WHERE 0;

