--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUploadDetails' definition.
--


--
-- SELECT template for table `MediaUploadDetails`
--
SELECT `media_id`, `media_type`, `status` FROM `MediaUploadDetails` WHERE 1;

--
-- INSERT template for table `MediaUploadDetails`
--
INSERT INTO `MediaUploadDetails`(`media_id`, `media_type`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MediaUploadDetails`
--
UPDATE `MediaUploadDetails` SET `media_id` = ?, `media_type` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `MediaUploadDetails`
--
DELETE FROM `MediaUploadDetails` WHERE 0;

