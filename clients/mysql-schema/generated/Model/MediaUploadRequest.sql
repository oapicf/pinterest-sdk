--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUploadRequest' definition.
--


--
-- SELECT template for table `MediaUploadRequest`
--
SELECT `media_type` FROM `MediaUploadRequest` WHERE 1;

--
-- INSERT template for table `MediaUploadRequest`
--
INSERT INTO `MediaUploadRequest`(`media_type`) VALUES (?);

--
-- UPDATE template for table `MediaUploadRequest`
--
UPDATE `MediaUploadRequest` SET `media_type` = ? WHERE 1;

--
-- DELETE template for table `MediaUploadRequest`
--
DELETE FROM `MediaUploadRequest` WHERE 0;

