--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownload' definition.
--


--
-- SELECT template for table `BulkDownload`
--
SELECT `request_id` FROM `BulkDownload` WHERE 1;

--
-- INSERT template for table `BulkDownload`
--
INSERT INTO `BulkDownload`(`request_id`) VALUES (?);

--
-- UPDATE template for table `BulkDownload`
--
UPDATE `BulkDownload` SET `request_id` = ? WHERE 1;

--
-- DELETE template for table `BulkDownload`
--
DELETE FROM `BulkDownload` WHERE 0;

