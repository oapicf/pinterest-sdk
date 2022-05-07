--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUpload_allOf_upload_parameters' definition.
--


--
-- SELECT template for table `MediaUpload_allOf_upload_parameters`
--
SELECT `x-amz-date`, `x-amz-signature`, `x-amz-security-token`, `x-amz-algorithm`, `key`, `policy`, `x-amz-credential`, `Content-Type` FROM `MediaUpload_allOf_upload_parameters` WHERE 1;

--
-- INSERT template for table `MediaUpload_allOf_upload_parameters`
--
INSERT INTO `MediaUpload_allOf_upload_parameters`(`x-amz-date`, `x-amz-signature`, `x-amz-security-token`, `x-amz-algorithm`, `key`, `policy`, `x-amz-credential`, `Content-Type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MediaUpload_allOf_upload_parameters`
--
UPDATE `MediaUpload_allOf_upload_parameters` SET `x-amz-date` = ?, `x-amz-signature` = ?, `x-amz-security-token` = ?, `x-amz-algorithm` = ?, `key` = ?, `policy` = ?, `x-amz-credential` = ?, `Content-Type` = ? WHERE 1;

--
-- DELETE template for table `MediaUpload_allOf_upload_parameters`
--
DELETE FROM `MediaUpload_allOf_upload_parameters` WHERE 0;

