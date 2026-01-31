--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardMedia' definition.
--


--
-- SELECT template for table `BoardMedia`
--
SELECT `image_cover_url`, `pin_thumbnail_urls` FROM `BoardMedia` WHERE 1;

--
-- INSERT template for table `BoardMedia`
--
INSERT INTO `BoardMedia`(`image_cover_url`, `pin_thumbnail_urls`) VALUES (?, ?);

--
-- UPDATE template for table `BoardMedia`
--
UPDATE `BoardMedia` SET `image_cover_url` = ?, `pin_thumbnail_urls` = ? WHERE 1;

--
-- DELETE template for table `BoardMedia`
--
DELETE FROM `BoardMedia` WHERE 0;

