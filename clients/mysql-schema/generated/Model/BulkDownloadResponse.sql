--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadResponse' definition.
--


--
-- SELECT template for table `BulkDownloadResponse`
--
SELECT `request_id` FROM `BulkDownloadResponse` WHERE 1;

--
-- INSERT template for table `BulkDownloadResponse`
--
INSERT INTO `BulkDownloadResponse`(`request_id`) VALUES (?);

--
-- UPDATE template for table `BulkDownloadResponse`
--
UPDATE `BulkDownloadResponse` SET `request_id` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadResponse`
--
DELETE FROM `BulkDownloadResponse` WHERE 0;

