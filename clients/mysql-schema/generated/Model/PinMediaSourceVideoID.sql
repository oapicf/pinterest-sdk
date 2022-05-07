--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceVideoID' definition.
--


--
-- SELECT template for table `PinMediaSourceVideoID`
--
SELECT `source_type`, `cover_image_url`, `media_id` FROM `PinMediaSourceVideoID` WHERE 1;

--
-- INSERT template for table `PinMediaSourceVideoID`
--
INSERT INTO `PinMediaSourceVideoID`(`source_type`, `cover_image_url`, `media_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceVideoID`
--
UPDATE `PinMediaSourceVideoID` SET `source_type` = ?, `cover_image_url` = ?, `media_id` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceVideoID`
--
DELETE FROM `PinMediaSourceVideoID` WHERE 0;

