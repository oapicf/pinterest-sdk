--
-- Pinterest REST API.
-- Prepared SQL queries for 'DynamicTitlesUploadURL' definition.
--


--
-- SELECT template for table `DynamicTitlesUploadURL`
--
SELECT `existing_filename`, `request_id`, `upload_url` FROM `DynamicTitlesUploadURL` WHERE 1;

--
-- INSERT template for table `DynamicTitlesUploadURL`
--
INSERT INTO `DynamicTitlesUploadURL`(`existing_filename`, `request_id`, `upload_url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DynamicTitlesUploadURL`
--
UPDATE `DynamicTitlesUploadURL` SET `existing_filename` = ?, `request_id` = ?, `upload_url` = ? WHERE 1;

--
-- DELETE template for table `DynamicTitlesUploadURL`
--
DELETE FROM `DynamicTitlesUploadURL` WHERE 0;

