--
-- Pinterest REST API.
-- Prepared SQL queries for 'MediaUploadParameters' definition.
--


--
-- SELECT template for table `MediaUploadParameters`
--
SELECT `Content-Type`, `key`, `policy`, `x-amz-algorithm`, `x-amz-credential`, `x-amz-date`, `x-amz-security-token`, `x-amz-signature` FROM `MediaUploadParameters` WHERE 1;

--
-- INSERT template for table `MediaUploadParameters`
--
INSERT INTO `MediaUploadParameters`(`Content-Type`, `key`, `policy`, `x-amz-algorithm`, `x-amz-credential`, `x-amz-date`, `x-amz-security-token`, `x-amz-signature`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MediaUploadParameters`
--
UPDATE `MediaUploadParameters` SET `Content-Type` = ?, `key` = ?, `policy` = ?, `x-amz-algorithm` = ?, `x-amz-credential` = ?, `x-amz-date` = ?, `x-amz-security-token` = ?, `x-amz-signature` = ? WHERE 1;

--
-- DELETE template for table `MediaUploadParameters`
--
DELETE FROM `MediaUploadParameters` WHERE 0;

