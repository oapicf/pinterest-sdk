--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageMetadata' definition.
--


--
-- SELECT template for table `ImageMetadata`
--
SELECT `item_type`, `title`, `description`, `link`, `images` FROM `ImageMetadata` WHERE 1;

--
-- INSERT template for table `ImageMetadata`
--
INSERT INTO `ImageMetadata`(`item_type`, `title`, `description`, `link`, `images`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ImageMetadata`
--
UPDATE `ImageMetadata` SET `item_type` = ?, `title` = ?, `description` = ?, `link` = ?, `images` = ? WHERE 1;

--
-- DELETE template for table `ImageMetadata`
--
DELETE FROM `ImageMetadata` WHERE 0;

