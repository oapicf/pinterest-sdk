--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageMetadata' definition.
--


--
-- SELECT template for table `ImageMetadata`
--
SELECT `description`, `images`, `item_type`, `link`, `title` FROM `ImageMetadata` WHERE 1;

--
-- INSERT template for table `ImageMetadata`
--
INSERT INTO `ImageMetadata`(`description`, `images`, `item_type`, `link`, `title`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ImageMetadata`
--
UPDATE `ImageMetadata` SET `description` = ?, `images` = ?, `item_type` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `ImageMetadata`
--
DELETE FROM `ImageMetadata` WHERE 0;

