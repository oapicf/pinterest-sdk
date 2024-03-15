--
-- Pinterest REST API.
-- Prepared SQL queries for 'VideoMetadata' definition.
--


--
-- SELECT template for table `VideoMetadata`
--
SELECT `item_type`, `cover_image_url`, `video_url`, `duration`, `height`, `width` FROM `VideoMetadata` WHERE 1;

--
-- INSERT template for table `VideoMetadata`
--
INSERT INTO `VideoMetadata`(`item_type`, `cover_image_url`, `video_url`, `duration`, `height`, `width`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `VideoMetadata`
--
UPDATE `VideoMetadata` SET `item_type` = ?, `cover_image_url` = ?, `video_url` = ?, `duration` = ?, `height` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `VideoMetadata`
--
DELETE FROM `VideoMetadata` WHERE 0;

