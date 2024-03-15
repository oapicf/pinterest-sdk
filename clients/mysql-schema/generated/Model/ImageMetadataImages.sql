--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageMetadata_images' definition.
--


--
-- SELECT template for table `ImageMetadata_images`
--
SELECT `150x150`, `400x300`, `600x`, `1200x` FROM `ImageMetadata_images` WHERE 1;

--
-- INSERT template for table `ImageMetadata_images`
--
INSERT INTO `ImageMetadata_images`(`150x150`, `400x300`, `600x`, `1200x`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ImageMetadata_images`
--
UPDATE `ImageMetadata_images` SET `150x150` = ?, `400x300` = ?, `600x` = ?, `1200x` = ? WHERE 1;

--
-- DELETE template for table `ImageMetadata_images`
--
DELETE FROM `ImageMetadata_images` WHERE 0;

