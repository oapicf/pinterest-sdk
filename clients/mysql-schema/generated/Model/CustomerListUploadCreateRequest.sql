--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUploadCreateRequest' definition.
--


--
-- SELECT template for table `CustomerListUploadCreateRequest`
--
SELECT `operation`, `total_parts` FROM `CustomerListUploadCreateRequest` WHERE 1;

--
-- INSERT template for table `CustomerListUploadCreateRequest`
--
INSERT INTO `CustomerListUploadCreateRequest`(`operation`, `total_parts`) VALUES (?, ?);

--
-- UPDATE template for table `CustomerListUploadCreateRequest`
--
UPDATE `CustomerListUploadCreateRequest` SET `operation` = ?, `total_parts` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUploadCreateRequest`
--
DELETE FROM `CustomerListUploadCreateRequest` WHERE 0;

