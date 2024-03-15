--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewRequest' definition.
--


--
-- SELECT template for table `AdPreviewRequest`
--
SELECT `image_url`, `title`, `pin_id` FROM `AdPreviewRequest` WHERE 1;

--
-- INSERT template for table `AdPreviewRequest`
--
INSERT INTO `AdPreviewRequest`(`image_url`, `title`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdPreviewRequest`
--
UPDATE `AdPreviewRequest` SET `image_url` = ?, `title` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewRequest`
--
DELETE FROM `AdPreviewRequest` WHERE 0;

