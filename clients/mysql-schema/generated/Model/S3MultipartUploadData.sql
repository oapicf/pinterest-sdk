--
-- Pinterest REST API.
-- Prepared SQL queries for 'S3MultipartUploadData' definition.
--


--
-- SELECT template for table `S3MultipartUploadData`
--
SELECT `file_parts` FROM `S3MultipartUploadData` WHERE 1;

--
-- INSERT template for table `S3MultipartUploadData`
--
INSERT INTO `S3MultipartUploadData`(`file_parts`) VALUES (?);

--
-- UPDATE template for table `S3MultipartUploadData`
--
UPDATE `S3MultipartUploadData` SET `file_parts` = ? WHERE 1;

--
-- DELETE template for table `S3MultipartUploadData`
--
DELETE FROM `S3MultipartUploadData` WHERE 0;

