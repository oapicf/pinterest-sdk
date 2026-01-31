--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUploadCreateResponse' definition.
--


--
-- SELECT template for table `CustomerListUploadCreateResponse`
--
SELECT `customer_list_upload`, `s3_multipart_upload_data` FROM `CustomerListUploadCreateResponse` WHERE 1;

--
-- INSERT template for table `CustomerListUploadCreateResponse`
--
INSERT INTO `CustomerListUploadCreateResponse`(`customer_list_upload`, `s3_multipart_upload_data`) VALUES (?, ?);

--
-- UPDATE template for table `CustomerListUploadCreateResponse`
--
UPDATE `CustomerListUploadCreateResponse` SET `customer_list_upload` = ?, `s3_multipart_upload_data` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUploadCreateResponse`
--
DELETE FROM `CustomerListUploadCreateResponse` WHERE 0;

