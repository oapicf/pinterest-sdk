--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaMetadata' definition.
--


--
-- SELECT template for table `PinMediaMetadata`
--
SELECT `item_type`, `title`, `description`, `link`, `images`, `cover_image_url`, `video_url`, `duration`, `height`, `width` FROM `PinMediaMetadata` WHERE 1;

--
-- INSERT template for table `PinMediaMetadata`
--
INSERT INTO `PinMediaMetadata`(`item_type`, `title`, `description`, `link`, `images`, `cover_image_url`, `video_url`, `duration`, `height`, `width`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaMetadata`
--
UPDATE `PinMediaMetadata` SET `item_type` = ?, `title` = ?, `description` = ?, `link` = ?, `images` = ?, `cover_image_url` = ?, `video_url` = ?, `duration` = ?, `height` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `PinMediaMetadata`
--
DELETE FROM `PinMediaMetadata` WHERE 0;

