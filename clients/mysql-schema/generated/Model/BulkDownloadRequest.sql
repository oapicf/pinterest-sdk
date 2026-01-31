--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadRequest' definition.
--


--
-- SELECT template for table `BulkDownloadRequest`
--
SELECT `campaign_filter`, `entity_ids`, `entity_types`, `output_format`, `updated_since` FROM `BulkDownloadRequest` WHERE 1;

--
-- INSERT template for table `BulkDownloadRequest`
--
INSERT INTO `BulkDownloadRequest`(`campaign_filter`, `entity_ids`, `entity_types`, `output_format`, `updated_since`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadRequest`
--
UPDATE `BulkDownloadRequest` SET `campaign_filter` = ?, `entity_ids` = ?, `entity_types` = ?, `output_format` = ?, `updated_since` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadRequest`
--
DELETE FROM `BulkDownloadRequest` WHERE 0;

