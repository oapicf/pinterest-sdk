--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithVideos' definition.
--


--
-- SELECT template for table `PinMediaWithVideos`
--
SELECT `items`, `media_type` FROM `PinMediaWithVideos` WHERE 1;

--
-- INSERT template for table `PinMediaWithVideos`
--
INSERT INTO `PinMediaWithVideos`(`items`, `media_type`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithVideos`
--
UPDATE `PinMediaWithVideos` SET `items` = ?, `media_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithVideos`
--
DELETE FROM `PinMediaWithVideos` WHERE 0;

