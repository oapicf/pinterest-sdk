--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithVideos' definition.
--


--
-- SELECT template for table `PinMediaWithVideos`
--
SELECT `media_type`, `items` FROM `PinMediaWithVideos` WHERE 1;

--
-- INSERT template for table `PinMediaWithVideos`
--
INSERT INTO `PinMediaWithVideos`(`media_type`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithVideos`
--
UPDATE `PinMediaWithVideos` SET `media_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithVideos`
--
DELETE FROM `PinMediaWithVideos` WHERE 0;

