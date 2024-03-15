--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadRequest' definition.
--


--
-- SELECT template for table `BulkDownloadRequest`
--
SELECT `entity_types`, `entity_ids`, `updated_since`, `campaign_filter`, `output_format` FROM `BulkDownloadRequest` WHERE 1;

--
-- INSERT template for table `BulkDownloadRequest`
--
INSERT INTO `BulkDownloadRequest`(`entity_types`, `entity_ids`, `updated_since`, `campaign_filter`, `output_format`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadRequest`
--
UPDATE `BulkDownloadRequest` SET `entity_types` = ?, `entity_ids` = ?, `updated_since` = ?, `campaign_filter` = ?, `output_format` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadRequest`
--
DELETE FROM `BulkDownloadRequest` WHERE 0;

