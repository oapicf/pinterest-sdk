--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUpload' definition.
--


--
-- SELECT template for table `MediaUpload`
--
SELECT `media_id`, `media_type`, `upload_parameters`, `upload_url` FROM `MediaUpload` WHERE 1;

--
-- INSERT template for table `MediaUpload`
--
INSERT INTO `MediaUpload`(`media_id`, `media_type`, `upload_parameters`, `upload_url`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MediaUpload`
--
UPDATE `MediaUpload` SET `media_id` = ?, `media_type` = ?, `upload_parameters` = ?, `upload_url` = ? WHERE 1;

--
-- DELETE template for table `MediaUpload`
--
DELETE FROM `MediaUpload` WHERE 0;

