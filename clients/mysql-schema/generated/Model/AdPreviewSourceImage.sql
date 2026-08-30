--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewSourceImage' definition.
--


--
-- SELECT template for table `AdPreviewSourceImage`
--
SELECT `image_url`, `promotion_id`, `title` FROM `AdPreviewSourceImage` WHERE 1;

--
-- INSERT template for table `AdPreviewSourceImage`
--
INSERT INTO `AdPreviewSourceImage`(`image_url`, `promotion_id`, `title`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdPreviewSourceImage`
--
UPDATE `AdPreviewSourceImage` SET `image_url` = ?, `promotion_id` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewSourceImage`
--
DELETE FROM `AdPreviewSourceImage` WHERE 0;

