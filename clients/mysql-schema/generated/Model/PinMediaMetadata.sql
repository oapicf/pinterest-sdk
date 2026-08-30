--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaMetadata' definition.
--


--
-- SELECT template for table `PinMediaMetadata`
--
SELECT `description`, `images`, `item_type`, `link`, `title`, `cover_image_url`, `duration`, `height`, `video_url`, `video_url_hls`, `width` FROM `PinMediaMetadata` WHERE 1;

--
-- INSERT template for table `PinMediaMetadata`
--
INSERT INTO `PinMediaMetadata`(`description`, `images`, `item_type`, `link`, `title`, `cover_image_url`, `duration`, `height`, `video_url`, `video_url_hls`, `width`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaMetadata`
--
UPDATE `PinMediaMetadata` SET `description` = ?, `images` = ?, `item_type` = ?, `link` = ?, `title` = ?, `cover_image_url` = ?, `duration` = ?, `height` = ?, `video_url` = ?, `video_url_hls` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `PinMediaMetadata`
--
DELETE FROM `PinMediaMetadata` WHERE 0;

