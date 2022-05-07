--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUpload_allOf' definition.
--


--
-- SELECT template for table `MediaUpload_allOf`
--
SELECT `media_id`, `media_type`, `upload_url`, `upload_parameters` FROM `MediaUpload_allOf` WHERE 1;

--
-- INSERT template for table `MediaUpload_allOf`
--
INSERT INTO `MediaUpload_allOf`(`media_id`, `media_type`, `upload_url`, `upload_parameters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `MediaUpload_allOf`
--
UPDATE `MediaUpload_allOf` SET `media_id` = ?, `media_type` = ?, `upload_url` = ?, `upload_parameters` = ? WHERE 1;

--
-- DELETE template for table `MediaUpload_allOf`
--
DELETE FROM `MediaUpload_allOf` WHERE 0;

