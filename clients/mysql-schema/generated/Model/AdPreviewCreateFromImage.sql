--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewCreateFromImage' definition.
--


--
-- SELECT template for table `AdPreviewCreateFromImage`
--
SELECT `image_url`, `title` FROM `AdPreviewCreateFromImage` WHERE 1;

--
-- INSERT template for table `AdPreviewCreateFromImage`
--
INSERT INTO `AdPreviewCreateFromImage`(`image_url`, `title`) VALUES (?, ?);

--
-- UPDATE template for table `AdPreviewCreateFromImage`
--
UPDATE `AdPreviewCreateFromImage` SET `image_url` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewCreateFromImage`
--
DELETE FROM `AdPreviewCreateFromImage` WHERE 0;

