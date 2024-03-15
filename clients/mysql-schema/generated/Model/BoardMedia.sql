--
-- Pinterest REST API.
-- Prepared SQL queries for 'Board_media' definition.
--


--
-- SELECT template for table `Board_media`
--
SELECT `image_cover_url`, `pin_thumbnail_urls` FROM `Board_media` WHERE 1;

--
-- INSERT template for table `Board_media`
--
INSERT INTO `Board_media`(`image_cover_url`, `pin_thumbnail_urls`) VALUES (?, ?);

--
-- UPDATE template for table `Board_media`
--
UPDATE `Board_media` SET `image_cover_url` = ?, `pin_thumbnail_urls` = ? WHERE 1;

--
-- DELETE template for table `Board_media`
--
DELETE FROM `Board_media` WHERE 0;

