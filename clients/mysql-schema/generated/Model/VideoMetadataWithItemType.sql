--
-- Pinterest REST API.
-- Prepared SQL queries for 'VideoMetadataWithItemType' definition.
--


--
-- SELECT template for table `VideoMetadataWithItemType`
--
SELECT `cover_image_url`, `duration`, `height`, `item_type`, `video_url`, `width` FROM `VideoMetadataWithItemType` WHERE 1;

--
-- INSERT template for table `VideoMetadataWithItemType`
--
INSERT INTO `VideoMetadataWithItemType`(`cover_image_url`, `duration`, `height`, `item_type`, `video_url`, `width`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `VideoMetadataWithItemType`
--
UPDATE `VideoMetadataWithItemType` SET `cover_image_url` = ?, `duration` = ?, `height` = ?, `item_type` = ?, `video_url` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `VideoMetadataWithItemType`
--
DELETE FROM `VideoMetadataWithItemType` WHERE 0;

