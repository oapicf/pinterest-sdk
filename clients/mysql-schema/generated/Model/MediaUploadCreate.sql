--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUploadCreate' definition.
--


--
-- SELECT template for table `MediaUploadCreate`
--
SELECT `media_type` FROM `MediaUploadCreate` WHERE 1;

--
-- INSERT template for table `MediaUploadCreate`
--
INSERT INTO `MediaUploadCreate`(`media_type`) VALUES (?);

--
-- UPDATE template for table `MediaUploadCreate`
--
UPDATE `MediaUploadCreate` SET `media_type` = ? WHERE 1;

--
-- DELETE template for table `MediaUploadCreate`
--
DELETE FROM `MediaUploadCreate` WHERE 0;

