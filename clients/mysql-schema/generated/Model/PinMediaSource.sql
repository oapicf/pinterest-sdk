--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSource' definition.
--


--
-- SELECT template for table `PinMediaSource`
--
SELECT `source_type`, `content_type`, `data`, `url`, `cover_image_url`, `media_id` FROM `PinMediaSource` WHERE 1;

--
-- INSERT template for table `PinMediaSource`
--
INSERT INTO `PinMediaSource`(`source_type`, `content_type`, `data`, `url`, `cover_image_url`, `media_id`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSource`
--
UPDATE `PinMediaSource` SET `source_type` = ?, `content_type` = ?, `data` = ?, `url` = ?, `cover_image_url` = ?, `media_id` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSource`
--
DELETE FROM `PinMediaSource` WHERE 0;

